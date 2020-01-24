package com.example.basement.Champion;

import java.util.HashMap;

public class ChampionParser {
    private HashMap<String, ChampionData> data;

    public ChampionParser() {
    }

    public ChampionParser(HashMap<String, ChampionData> data) {
        this.data = data;
    }

    public HashMap<String, ChampionData> getData() {
        return data;
    }

    public void setData(HashMap<String, ChampionData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "temp{" +
                "data=" + data +
                '}';
    }
}
