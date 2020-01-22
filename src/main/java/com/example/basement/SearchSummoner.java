package com.example.basement;

import com.example.basement.Champion.ChampionService;
import com.example.basement.DTO.LeagueEntrydto;
import com.example.basement.DTO.MatchReferenceDto;
import com.example.basement.DTO.MatchlistDto;
import com.example.basement.DTO.Summoner;
import com.example.basement.Version.Realms;
import com.example.basement.Version.Version;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class SearchSummoner {
    final static Logger logger = LoggerFactory.getLogger(SearchSummoner.class);

    @Autowired
    SummonerDetailService service;

    @Autowired
    MatchService matchService;

    @Autowired
    ChampionService championService;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Realms realms;

    @Autowired
    Version currVer;

    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "uid") String users) throws Exception {
        Summoner tempSummoner = service.findSummoner(users, restTemplate);
        LeagueEntrydto[] leagueEntrydto = service.findLeague(tempSummoner.getId(), restTemplate);
        MatchlistDto matchlistDto = matchService.searchSummonerMatchList(tempSummoner.getAccountId(), restTemplate);
        List<MatchReferenceDto> referenceDto = matchlistDto.getMatches();
        for (MatchReferenceDto temp : referenceDto.subList(0, referenceDto.size())) {
            temp.setChampionImgUrl("http://ddragon.leagueoflegends.com/cdn/" +
                    currVer.getChampion() +
                    "/img/champion/" + championService.imgUrlCham(temp.getChampion(), restTemplate, currVer) + ".png");
            temp.setChampionName(championService.nameCham(temp.getChampion(), restTemplate, currVer));
        }
        ArrayUtils.reverse(leagueEntrydto);
        model.addAttribute("uid", tempSummoner);
        model.addAttribute("version", currVer);
        model.addAttribute("realms", realms);
        model.addAttribute("league", leagueEntrydto);
        model.addAttribute("matches", referenceDto);
        return "summoner";
    }

//    @RequestParam(value = "begin") int begin, @RequestParam(value = "end") int end

}
