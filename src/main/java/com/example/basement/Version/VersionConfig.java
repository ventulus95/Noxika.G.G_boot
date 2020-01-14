package com.example.basement.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VersionConfig {

    private static final Logger logger = LoggerFactory.getLogger(VersionCheck.class);

    @Bean
    public Version currVer() {
        return new Version();
    }

    @Bean
    public Realms currRealm() {
        return new Realms();
    }
}
