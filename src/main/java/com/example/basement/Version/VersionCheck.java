package com.example.basement.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableScheduling
public class VersionCheck {

    private static final Logger logger = LoggerFactory.getLogger(VersionCheck.class);

    final RestTemplate restTemplate1;

    public VersionCheck(RestTemplate restTemplate1) {
        this.restTemplate1 = restTemplate1;
    }

    @Autowired
    Version currVer;

    @Autowired
    Realms realms;

    @Scheduled(fixedDelay = 1800000)
    private void execute() throws Exception {
        String urlStr = "https://ddragon.leagueoflegends.com/realms/kr.json";
        Realms tempr = restTemplate1.getForObject(urlStr, Realms.class);
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
    }
}
