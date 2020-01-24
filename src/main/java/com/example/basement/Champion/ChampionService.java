package com.example.basement.Champion;

import com.example.basement.Version.Realms;
import com.example.basement.Version.Version;
import com.example.basement.Version.VersionCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableScheduling
public class ChampionService {

    private static final Logger logger = LoggerFactory.getLogger(VersionCheck.class);

    final RestTemplate restTemplate;
    final Realms realms;
    final Version version;
    final ChampionParser championParser;

    public ChampionService(RestTemplate restTemplate, Realms realms, Version version, ChampionParser championParser) {
        this.restTemplate = restTemplate;
        this.realms = realms;
        this.version = version;
        this.championParser = championParser;
    }

    @Scheduled(fixedDelay = 1800000)
    private void checkChampion() throws Exception {
        String urlstr = "http://ddragon.leagueoflegends.com/cdn/" +
                version.getChampion() +
                "/data/ko_KR/champion.json";
        System.out.println(urlstr);
        ChampionParser tempChampionParser = restTemplate.getForObject(urlstr, ChampionParser.class);
        championParser.setData(tempChampionParser.getData());
        logger.info("[ChampionData Check!]");
    }

}
