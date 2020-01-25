package com.example.basement;

import com.example.basement.Champion.ChampionParser;
import com.example.basement.Version.Realms;
import com.example.basement.Version.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableScheduling
public class DataCheckService {

    private static final Logger logger = LoggerFactory.getLogger(DataCheckService.class);

    final RestTemplate restTemplate;
    final Version currVer;
    final Realms realms;
    final ChampionParser championParser;

    public DataCheckService(RestTemplate restTemplate, Version currVer, Realms realms, ChampionParser championParser) {
        this.restTemplate = restTemplate;
        this.currVer = currVer;
        this.realms = realms;
        this.championParser = championParser;
    }

    @Scheduled(fixedDelay = 1800000)
    private void execute() throws Exception {
        String urlStr = "https://ddragon.leagueoflegends.com/realms/kr.json";
        Realms tempr = restTemplate.getForObject(urlStr, Realms.class);
        realms.setCdn(tempr.getCdn());
        realms.setL(tempr.getL());
        realms.setV(tempr.getV());
        Version tempv = tempr.getN();
        currVer.setSummoner(tempv.getSummoner());
        currVer.setChampion(tempv.getChampion());
        currVer.setProfileicon(tempv.getProfileicon());
        currVer.setItem(tempv.getItem());
        currVer.setLanguage(tempv.getLanguage());
        currVer.setMap(tempv.getMap());
        currVer.setMastery(tempv.getMastery());
        currVer.setSticker(tempv.getSticker());
        currVer.setRune(tempv.getRune());
        logger.info("[Version check!]");
        String urlstr = "http://ddragon.leagueoflegends.com/cdn/" +
                tempv.getChampion() +
                "/data/ko_KR/champion.json";
        ChampionParser tempChampionParser = restTemplate.getForObject(urlstr, ChampionParser.class);
        championParser.setData(tempChampionParser.getData());
        logger.info("[ChampionData Check!]");

    }
}
