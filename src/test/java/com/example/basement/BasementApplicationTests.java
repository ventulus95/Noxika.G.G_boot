package com.example.basement;

import com.example.basement.DTO.Summoner;
import org.hibernate.validator.internal.util.logging.Log;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
class BasementApplicationTests {

	private static Logger log = LoggerFactory.getLogger(BasementApplicationTests.class);



	@Test
	void contextLoads() {
	}

	@Test
	void restTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" +
				"Noxika" + "?api_key=RGAPI-c517c19c-a3a1-4a49-9d48-2547ac377744" ;
		Summoner temp = restTemplate.getForObject(urlstr, Summoner.class);
		log.info(temp.toString());

	}

	@Test
	void print(){
		log.info(PrivateKey.API_KEY.getAPIKey());
	}
}
