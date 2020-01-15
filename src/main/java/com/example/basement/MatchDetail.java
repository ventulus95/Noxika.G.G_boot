package com.example.basement;

import com.example.basement.DTO.MatchlistDto;
import org.springframework.web.client.RestTemplate;

public interface MatchDetail {

    public MatchlistDto searchSummonerMatchList(String encryptedAccountId, RestTemplate restTemplate);

}
