package com.example.basement;

import com.example.basement.DTO.LeagueEntrydto;
import com.example.basement.DTO.Summoner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class SummonerDetailService implements SummonerDetail {

    @Override
    public Summoner findSummoner(String id, RestTemplate restTemplate) throws IOException {
        String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" +
                id.replace(" ", "") + "?api_key=" + PrivateKey.API_KEY.getAPIKey();
        Summoner key = restTemplate.getForObject(urlstr, Summoner.class);
        return key;
    }

    public LeagueEntrydto[] findLeague(String id, RestTemplate restTemplate) {
        String urlstr = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/" +
                id + "?api_key=" + PrivateKey.API_KEY.getAPIKey();
        LeagueEntrydto[] league = restTemplate.getForObject(urlstr, LeagueEntrydto[].class);
        return league;
    }


}
