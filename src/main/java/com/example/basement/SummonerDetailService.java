package com.example.basement;

import com.example.basement.DTO.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SummonerDetailService implements SummonerDetail {

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Summoner findSummoner(String id) throws IOException {
        String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" +
                id.replace(" ", "") + "?api_key="+PrivateKey.API_KEY.getAPIKey();
        Summoner key = restTemplate.getForObject(urlstr, Summoner.class);
        return key;
    }



    @Override
    public String findId(String SummonerName) throws IOException {
        String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" +
                SummonerName.replace(" ", "") + "?api_key="+PrivateKey.API_KEY.getAPIKey();
        Summoner key = restTemplate.getForObject(urlstr, Summoner.class);
        return key.toString();
    }
}
