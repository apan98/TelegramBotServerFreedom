package com.telegramBotServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TelegramBotServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TelegramBotServerApplication.class, args);
    }
}
