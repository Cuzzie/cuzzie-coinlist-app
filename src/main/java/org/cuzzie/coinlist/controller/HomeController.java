package org.cuzzie.coinlist.controller;

import org.cuzzie.coinlist.model.Coin;
import org.cuzzie.coinlist.model.CoinBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Cuzzie on 6/19/2017.
 */
@Controller
public class HomeController {

    private static final String COINMARKETCAP_COINLIST_API = "https://api.coinmarketcap.com/v1/ticker/?convert=MYR&limit=40";

    @GetMapping("/")
    public String loadCoinList(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, String>> coinListMap = restTemplate.getForObject(COINMARKETCAP_COINLIST_API, List.class);
        List<Coin> coinList = coinListMap.stream().map(this::populateCoinObjects).collect(Collectors.toList());
        model.addAttribute("coinList", coinList);
        return "coinlist";
    }

    private Coin populateCoinObjects(LinkedHashMap<String, String> map) {
        return new CoinBuilder()
                .setName(map.get("name"))
                .setSymbol(map.get("symbol"))
                .setPriceUSD(new BigDecimal(map.get("price_usd")))
                .setPriceBTC(new BigDecimal(map.get("price_btc")))
                .setPriceMYR(new BigDecimal(map.get("price_myr")))
                .setPercentChange1h(new BigDecimal(map.get("percent_change_1h")))
                .setPercentChange24h(new BigDecimal(map.get("percent_change_24h")))
                .setPercentChange7d(new BigDecimal(map.get("percent_change_7d")))
                .createCoin();
    }

}
