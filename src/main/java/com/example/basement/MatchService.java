package com.example.basement;

import com.example.basement.DTO.MatchlistDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchService implements MatchDetail {

    @Override
    public MatchlistDto searchSummonerMatchList(String encryptedAccountId, RestTemplate restTemplate) {
        String url = "https://kr.api.riotgames.com/lol/match/v4/matchlists/by-account/" + encryptedAccountId
                + "?api_key="
                + PrivateKey.API_KEY.getAPIKey();
        return restTemplate.getForObject(url, MatchlistDto.class);
    }
}
