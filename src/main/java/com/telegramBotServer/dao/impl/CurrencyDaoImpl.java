package com.telegramBotServer.dao.impl;

import com.telegramBotServer.dao.CurrencyDao;
import com.telegramBotServer.dao.jpa.CurrencyRepository;
import com.telegramBotServer.domain.model.Currency;
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
