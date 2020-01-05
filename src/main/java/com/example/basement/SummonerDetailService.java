package com.example.basement;

import com.example.basement.DTO.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class SummonerDetailService implements SummonerDetail {


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public Summoner findSummoner(String id, RestTemplate restTemplate) throws IOException {
        String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" +
                id.replace(" ", "") + "?api_key="+PrivateKey.API_KEY.getAPIKey();
        Summoner key = restTemplate.getForObject(urlstr, Summoner.class);
        return key;
    }

}
