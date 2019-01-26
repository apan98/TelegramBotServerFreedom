package com.template.controller.v1;

import com.template.dao.CurrencyHistoryDao;
import com.template.domain.model.CurrencyHistory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.template.controller.RestConstant.V1;

@RestController
@AllArgsConstructor
@RequestMapping(V1 + "/currency")
public class CurrencyController {

    private CurrencyHistoryDao currencyHistoryDao;

    @GetMapping("/{currencyCode}")
    Double getCurrentCurrency(@PathVariable("currencyCode") String currencyCode) {
        return currencyHistoryDao.getLastByCode(currencyCode).getValue();
    }

    @GetMapping("/{currencyCode}/history")
    List<CurrencyHistory> getCurrencyHistory(@PathVariable("currencyCode") String currencyCode) {
        return currencyHistoryDao.getAllByCode(currencyCode);
    }
}

