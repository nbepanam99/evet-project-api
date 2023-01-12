package com.events.services;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private String name;
    private CurrencyTools currencyTools;

    public ConsumerService(String name, CurrencyTools currencyTools) {
        this.name = name;
        this.currencyTools = currencyTools;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrencyTools getCurrencyTools() {
        return currencyTools;
    }

    public void setCurrencyTools(CurrencyTools currencyTools) {
        this.currencyTools = currencyTools;
    }
}
