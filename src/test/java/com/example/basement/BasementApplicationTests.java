package com.example.basement;

import com.example.basement.Champion.ChampionData;
import com.example.basement.Champion.ChampionParser;
import com.example.basement.matchDTO.MatchDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;


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
        String url = "https://kr.api.riotgames.com/lol/match/v4/matches/4094451728?api_key=RGAPI-b7f62abb-59dd-454b-aa12-024755b0dc2d";
        MatchDto temp = restTemplate.getForObject(url, MatchDto.class);
        for (int i = 0; i < temp.getParticipantIdentities().size(); i++) {
            System.out.println(temp.getParticipantIdentities().get(i).getPlayer().getSummonerName());
            System.out.println(temp.getParticipants().get(i).getTeamId());
            System.out.println(temp.getParticipants().get(i).getStats().isWin());
        }
        log.info(temp.getTeams().toString());
    }


}
