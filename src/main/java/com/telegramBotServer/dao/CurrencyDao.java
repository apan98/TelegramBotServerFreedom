package com.telegramBotServer.dao;

import com.telegramBotServer.domain.model.Currency;

public interface CurrencyDao {
    Currency getByCode(String code);
}
