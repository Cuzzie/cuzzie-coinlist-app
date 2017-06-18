package org.cuzzie.coinlist.model;

import java.math.BigDecimal;

/**
 * Created by Cuzzie on 6/19/2017.
 */
public class Coin {

    private String name;

    private String symbol;

    private BigDecimal priceUSD;

    private BigDecimal priceBTC;

    private BigDecimal priceMYR;

    private BigDecimal percentChange1h;

    private BigDecimal percentChange24h;

    private BigDecimal percentChange7d;

    public Coin(String name, String symbol, BigDecimal priceUSD, BigDecimal priceBTC, BigDecimal priceMYR, BigDecimal percentChange1h, BigDecimal percentChange24h, BigDecimal percentChange7d) {
        this.name = name;
        this.symbol = symbol;
        this.priceUSD = priceUSD;
        this.priceBTC = priceBTC;
        this.priceMYR = priceMYR;
        this.percentChange1h = percentChange1h;
        this.percentChange24h = percentChange24h;
        this.percentChange7d = percentChange7d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(BigDecimal priceUSD) {
        this.priceUSD = priceUSD;
    }

    public BigDecimal getPriceBTC() {
        return priceBTC;
    }

    public void setPriceBTC(BigDecimal priceBTC) {
        this.priceBTC = priceBTC;
    }

    public BigDecimal getPriceMYR() {
        return priceMYR;
    }

    public void setPriceMYR(BigDecimal priceMYR) {
        this.priceMYR = priceMYR;
    }

    public BigDecimal getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(BigDecimal percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public BigDecimal getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(BigDecimal percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public BigDecimal getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(BigDecimal percentChange7d) {
        this.percentChange7d = percentChange7d;
    }
}
