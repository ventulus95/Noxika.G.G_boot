package com.example.basement;

import com.example.basement.Champion.ChampionData;
import com.example.basement.Champion.ChampionParser;
import com.example.basement.matchDTO.MatchDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
class BasementApplicationTests {

	private static Logger log = LoggerFactory.getLogger(BasementApplicationTests.class);

	@Test
	void contextLoads() {
	}

    @Test
    void restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        String urlstr = "http://ddragon.leagueoflegends.com/cdn/10.1.1/data/ko_KR/champion.json";
        ChampionParser k = restTemplate.getForObject(urlstr, ChampionParser.class);
        for (ChampionData t : k.getData().values()) {

            log.info(t.getId() + " " + t.getKey());
        }
    }

    @Test
    void matchDtoTest() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://kr.api.riotgames.com/lol/match/v4/matches/4094451728?api_key=RGAPI-66b8d7b1-4fed-4aaf-aa3d-078018304b1b";
        MatchDto temp = restTemplate.getForObject(url, MatchDto.class);
        log.info(temp.getTeams().toString());
    }


}
