package com.example.basement.Champion;

import com.example.basement.Version.Version;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChampionService implements ChampionServiceDetails {

    public String imgUrlCham(int chamId, RestTemplate restTemplate, Version version) {
        String urlstr = "http://ddragon.leagueoflegends.com/cdn/" +
                version.getChampion() +
                "/data/ko_KR/champion.json";
        ChampionParser k = restTemplate.getForObject(urlstr, ChampionParser.class);
        for (ChampionData t : k.getData().values()) {
            if (chamId == t.getKey()) {
                return t.getId();
            }
        }
        return "";
    }

    public String nameCham(int chamId, RestTemplate restTemplate, Version version) {
        String urlstr = "http://ddragon.leagueoflegends.com/cdn/" +
                version.getChampion() +
                "/data/ko_KR/champion.json";
        ChampionParser k = restTemplate.getForObject(urlstr, ChampionParser.class);
        for (ChampionData t : k.getData().values()) {
            if (chamId == t.getKey()) {
                return t.getName();
            }
        }
        return "";
    }


}
