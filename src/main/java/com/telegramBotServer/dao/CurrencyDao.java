package com.telegramBotServer.dao;

import com.telegramBotServer.domain.model.Currency;

import java.util.List;

public interface CurrencyDao {
    Currency getByCode(String code);

    List<String> getCodeCurrencies();
}
