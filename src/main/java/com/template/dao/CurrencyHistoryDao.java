package com.template.dao;

import com.template.domain.model.CurrencyHistory;

import java.util.List;

public interface CurrencyHistoryDao {

    void writeHistory(String currencyCode, Double value);

    List<CurrencyHistory> getAllByCode( String currencyCode);

    CurrencyHistory getLastByCode(String currencyCode);
}
