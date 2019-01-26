package com.telegramBotServer.dao.impl;

import com.telegramBotServer.dao.CurrencyDao;
import com.telegramBotServer.dao.jpa.CurrencyRepository;
import com.telegramBotServer.domain.model.Currency;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CurrencyDaoImpl implements CurrencyDao {
    private final CurrencyRepository currencyRepository;

    @Override
    public Currency getByCode(String code) {
        return currencyRepository.getByCode(code);
    }

    @Override
    public List<String> getCodeCurrencies() {
        return currencyRepository.findAll().stream().map(Currency::getCode).collect(Collectors.toList());
    }
}
