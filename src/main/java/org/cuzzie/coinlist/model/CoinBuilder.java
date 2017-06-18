package org.cuzzie.coinlist.model;

import java.math.BigDecimal;

public class CoinBuilder {
    private String name;
    private String symbol;
    private BigDecimal priceUSD;
    private BigDecimal priceBTC;
    private BigDecimal priceMYR;
    private BigDecimal percentChange1h;
    private BigDecimal percentChange24h;
    private BigDecimal percentChange7d;

    public CoinBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CoinBuilder setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public CoinBuilder setPriceUSD(BigDecimal priceUSD) {
        this.priceUSD = priceUSD;
        return this;
    }

    public CoinBuilder setPriceBTC(BigDecimal priceBTC) {
        this.priceBTC = priceBTC;
        return this;
    }

    public CoinBuilder setPriceMYR(BigDecimal priceMYR) {
        this.priceMYR = priceMYR;
        return this;
    }

    public CoinBuilder setPercentChange1h(BigDecimal percentChange1h) {
        this.percentChange1h = percentChange1h;
        return this;
    }

    public CoinBuilder setPercentChange24h(BigDecimal percentChange24h) {
        this.percentChange24h = percentChange24h;
        return this;
    }

    public CoinBuilder setPercentChange7d(BigDecimal percentChange7d) {
        this.percentChange7d = percentChange7d;
        return this;
    }

    public Coin createCoin() {
        return new Coin(name, symbol, priceUSD, priceBTC, priceMYR, percentChange1h, percentChange24h, percentChange7d);
    }
}