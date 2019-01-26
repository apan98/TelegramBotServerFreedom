package com.template.dao.impl;

import com.template.dao.CurrencyDao;
import com.template.dao.jpa.CurrencyRepository;
import com.template.domain.model.Currency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyDaoImpl implements CurrencyDao {
    private final CurrencyRepository currencyRepository;

    @Override
    public Currency getByCode(String code) {
        return currencyRepository.getByCode(code);
    }
}
