package com.telegramBotServer.dao.jpa;

import com.telegramBotServer.domain.model.CurrencyHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyHistoryRepository extends JpaRepository<CurrencyHistory, Long> {

}
