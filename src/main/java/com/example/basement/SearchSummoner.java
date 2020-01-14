package com.example.basement;

import com.example.basement.DTO.Summoner;
import com.example.basement.Version.Realms;
import com.example.basement.Version.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller
public class SearchSummoner {
    final static Logger logger = LoggerFactory.getLogger(SearchSummoner.class);

    @Autowired
    SummonerDetailService service;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Realms realms;

    @Autowired
    Version currVer;

    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "uid") String users) throws IOException {
        model.addAttribute("uid", service.findSummoner(users, restTemplate));
        Summoner s = service.findSummoner(users, restTemplate);
        model.addAttribute("imgurl", realms.getCdn() + "/" + currVer.getProfileicon() + "/img/profileicon/" + s.getProfileIconId() + ".png");
        return "summoner";
    }

}
