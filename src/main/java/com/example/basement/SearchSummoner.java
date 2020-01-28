package com.example.basement;

import com.example.basement.Champion.ChampionData;
import com.example.basement.Champion.ChampionParser;
import com.example.basement.DTO.LeagueEntrydto;
import com.example.basement.DTO.MatchReferenceDto;
import com.example.basement.DTO.MatchlistDto;
import com.example.basement.DTO.Summoner;
import com.example.basement.Version.Realms;
import com.example.basement.Version.Version;
import com.example.basement.matchDTO.MatchDto;
import com.example.basement.matchDTO.ParticipantDto;
import com.example.basement.matchDTO.ParticipantIdentityDto;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SearchSummoner {
    final static Logger logger = LoggerFactory.getLogger(SearchSummoner.class);

    final SummonerDetailService service;
    final MatchService matchService;
    final ChampionParser championParser;
    final RestTemplate restTemplate;
    final Realms realms;
    final Version currVer;

    private static Summoner tempSummoner;
    private static LeagueEntrydto[] leagueEntrydto;
    private static MatchlistDto matchlistDto;
    private static List<MatchReferenceDto> referenceDto;

    public SearchSummoner(SummonerDetailService service, MatchService matchService, ChampionParser championParser, RestTemplate restTemplate, Realms realms, Version currVer) {
        this.service = service;
        this.matchService = matchService;
        this.championParser = championParser;
        this.restTemplate = restTemplate;
        this.realms = realms;
        this.currVer = currVer;
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "uid") String users, RedirectAttributes redirectAttributes) throws Exception {
        tempSummoner = service.findSummoner(users, restTemplate);
        leagueEntrydto = service.findLeague(tempSummoner.getId(), restTemplate);
        matchlistDto = matchService.searchSummonerMatchList(tempSummoner.getAccountId(), restTemplate);
        referenceDto = matchlistDto.getMatches();
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

    @GetMapping("/search/match/{id}")
    public String detatilMatch(Model model, @PathVariable long id) {
        String url = "https://kr.api.riotgames.com/lol/match/v4/matches/" +
                id + "?api_key="
                + PrivateKey.API_KEY.getAPIKey();
        MatchDto matchDto = restTemplate.getForObject(url, MatchDto.class);
        List<ParticipantIdentityDto> participantIdentitiesList = matchDto.getParticipantIdentities();
        List<ParticipantDto> participantDtosList = matchDto.getParticipants();
        for (int i = 0; i < participantIdentitiesList.size(); i++) {
            if (participantIdentitiesList.get(i).getPlayer().getSummonerName().equals(tempSummoner.getName())) {
                matchDto.setCurrteam(participantDtosList.get(i).getTeamId());
                matchDto.setWinorloss(participantDtosList.get(i).getStats().isWin());
                System.out.println(matchDto.toString());
            }
        }
        model.addAttribute("uid", tempSummoner);
        model.addAttribute("version", currVer);
        model.addAttribute("realms", realms);
        model.addAttribute("league", leagueEntrydto);
        model.addAttribute("matches", referenceDto);
        model.addAttribute("match", matchDto);
        return "match";
    }


}
