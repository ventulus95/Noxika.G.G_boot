package com.example.basement.Champion;

import com.example.basement.Version.Version;
import org.springframework.web.client.RestTemplate;

public interface ChampionServiceDetails {

    public String imgUrlCham(int chamId, RestTemplate restTemplate, Version version);

    public String nameCham(int chamId, RestTemplate restTemplate, Version version);
}
