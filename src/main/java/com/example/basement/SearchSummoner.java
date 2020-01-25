package com.example.basement;

import com.example.basement.Champion.ChampionData;
import com.example.basement.Champion.ChampionParser;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SearchSummoner {
    final static Logger logger = LoggerFactory.getLogger(SearchSummoner.class);

    @Autowired
    SummonerDetailService service;

    @Autowired
    MatchService matchService;

    @Autowired
    ChampionParser championParser;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Realms realms;

    @Autowired
    Version currVer;

    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "uid") String users, RedirectAttributes redirectAttributes) throws Exception {
        Summoner tempSummoner = service.findSummoner(users, restTemplate);
        LeagueEntrydto[] leagueEntrydto = service.findLeague(tempSummoner.getId(), restTemplate);
        MatchlistDto matchlistDto = matchService.searchSummonerMatchList(tempSummoner.getAccountId(), restTemplate);
        List<MatchReferenceDto> referenceDto = matchlistDto.getMatches();
        for (MatchReferenceDto temp : referenceDto.subList(0, referenceDto.size())) {
            String championString = null;
            String championImgString = null;
            int champion = temp.getChampion();
            for (ChampionData data : championParser.getData().values()) {
                if (data.getKey() == champion) {
                    championImgString = data.getId();
                    championString = data.getName();
                }
            }
            temp.setChampionImgUrl("http://ddragon.leagueoflegends.com/cdn/" +
                    currVer.getChampion() +
                    "/img/champion/" + championImgString + ".png");
            temp.setChampionName(championString);
        }
        ArrayUtils.reverse(leagueEntrydto);
        model.addAttribute("uid", tempSummoner);
        model.addAttribute("version", currVer);
        model.addAttribute("realms", realms);
        model.addAttribute("league", leagueEntrydto);
        model.addAttribute("matches", referenceDto);
        return "summoner";
    }

//    @GetMapping("/search/match/{id}")
//    public String detatilMatch(@ModelAttribute MatchlistDto matchlistDto, Model model, @PathVariable long id){
//        model.addAttribute("match", matchlistDto);
//        return  "match";
//    }


}
