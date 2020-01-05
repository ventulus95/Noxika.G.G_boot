package com.example.basement;

import com.example.basement.DTO.Summoner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public interface SummonerDetail {

    public Summoner findSummoner(String id, RestTemplate restTemplate) throws  IOException;

}
