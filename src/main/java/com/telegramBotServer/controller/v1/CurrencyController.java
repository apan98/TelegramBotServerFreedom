package com.telegramBotServer.controller.v1;

import com.telegramBotServer.dao.CurrencyDao;
import com.telegramBotServer.dao.CurrencyHistoryDao;
import com.telegramBotServer.domain.model.CurrencyHistory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.telegramBotServer.controller.RestConstant.V1;

@RestController
@AllArgsConstructor
@RequestMapping(V1 + "/currencies")
public class CurrencyController {

    private CurrencyHistoryDao currencyHistoryDao;
    private CurrencyDao currencyDao;

    @GetMapping("/{currencyCode}")
    Double getCurrentCurrency(@PathVariable("currencyCode") String currencyCode) {
        return currencyHistoryDao.getLastByCode(currencyCode).getValue();
    }

    @GetMapping
    List<String> getCurrencies() {
        return currencyDao.getCodeCurrencies();
    }

    @GetMapping("/{currencyCode}/history")
    List<CurrencyHistory> getCurrencyHistory(@PathVariable("currencyCode") String currencyCode) {
        return currencyHistoryDao.getAllByCode(currencyCode);
    }
}

