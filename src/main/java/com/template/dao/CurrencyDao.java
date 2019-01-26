package com.template.dao;

import com.template.domain.model.Currency;

public interface CurrencyDao {
    Currency getByCode(String code);
}
