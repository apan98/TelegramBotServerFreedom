package com.telegramBotServer.dao.jpa;

import com.telegramBotServer.domain.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Currency getByCode(String code);

}
