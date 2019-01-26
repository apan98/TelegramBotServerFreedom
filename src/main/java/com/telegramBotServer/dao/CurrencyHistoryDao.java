package com.telegramBotServer.dao;

import com.telegramBotServer.domain.model.CurrencyHistory;

import java.util.List;

public interface CurrencyHistoryDao {

    void writeHistory(String currencyCode, Double value);

    List<CurrencyHistory> getAllByCode( String currencyCode);

    CurrencyHistory getLastByCode(String currencyCode);
}
