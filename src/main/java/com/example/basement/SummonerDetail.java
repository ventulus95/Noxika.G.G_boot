package com.example.basement;

import com.example.basement.DTO.Summoner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public interface SummonerDetail {

    public Summoner findSummoner(String id) throws  IOException;

    public String findId(String id) throws MalformedURLException, IOException;
}
