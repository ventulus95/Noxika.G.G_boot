package com.example.basement.Champion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChampionConfig {

    @Bean
    public ChampionParser championParser() {
        return new ChampionParser();
    }
}
