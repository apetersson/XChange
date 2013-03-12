package com.xeiam.xchange.bitstamp;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Andreas Petersson
 */
public class BitstampEurUsdRate {
    public final double buy;
    public final double sell;

    public BitstampEurUsdRate(@JsonProperty("buy") double buy, @JsonProperty("sell") double sell) {
        this.buy = buy;
        this.sell = sell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BitstampEurUsdRate that = (BitstampEurUsdRate) o;

        if (Double.compare(that.buy, buy) != 0) return false;
        if (Double.compare(that.sell, sell) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = buy != +0.0d ? Double.doubleToLongBits(buy) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        temp = sell != +0.0d ? Double.doubleToLongBits(sell) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BitstampEurUsdRate{\"sell\": \""+sell+"\", \"buy\": \""+buy+"\"}";
    }
}
