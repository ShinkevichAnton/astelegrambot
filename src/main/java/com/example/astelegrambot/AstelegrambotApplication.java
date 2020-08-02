package com.example.astelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class AstelegrambotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(AstelegrambotApplication.class, args);
	}

}
