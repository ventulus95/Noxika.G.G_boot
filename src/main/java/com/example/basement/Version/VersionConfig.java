package com.example.basement.Version;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VersionConfig {

    @Bean("version")
    public Version currVer() {
        return new Version();
    }

    @Bean("realms")
    public Realms currRealm() {
        return new Realms();
    }
}
