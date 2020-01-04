package com.example.basement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
public class SearchSummoner {

    @Autowired
    SummonerDetailService service;

    @GetMapping("/search")
    public String search(Model model, @RequestParam(value = "uid") String users) throws IOException {
        model.addAttribute("uid",  service.findSummoner(users));
        return "summoner";
    }

}