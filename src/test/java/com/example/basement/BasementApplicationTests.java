package com.example.basement;

import com.example.basement.Champion.ChampionData;
import com.example.basement.Champion.ChampionParser;
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


}
