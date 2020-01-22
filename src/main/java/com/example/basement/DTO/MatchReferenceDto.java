package com.example.basement.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MatchReferenceDto {

    private String lane;
    private long gameId;
    private int champion;
    private String championName;
    private String championImgUrl;
    private String platformId;
    private int season;
    private int queue;
    private String role;
    private String timestamp;

    public MatchReferenceDto() {
    }

    public MatchReferenceDto(String lane, long gameId, int champion, String championName, String championImgUrl, String platformId, int season, int queue, String role, String timestamp) {
        this.lane = lane;
        this.gameId = gameId;
        this.champion = champion;
        this.championName = championName;
        this.championImgUrl = championImgUrl;
        this.platformId = platformId;
        this.season = season;
        this.queue = queue;
        this.role = role;
        this.timestamp = timestamp;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getChampionImgUrl() {
        return championImgUrl;
    }

    public void setChampionImgUrl(String championImgUrl) {
        this.championImgUrl = championImgUrl;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public int getChampion() {
        return champion;
    }

    public void setChampion(int champion) {
        this.champion = champion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        Date date = new Date(timestamp);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
        f.setTimeZone(tz);
        this.timestamp = f.format(date);
    }

    @Override
    public String toString() {
        return "MatchReferenceDto{" +
                "lane='" + lane + '\'' +
                ", gameId=" + gameId +
                ", champion=" + champion +
                ", championName=" + championName +
                ", championImgUrl=" + championImgUrl +
                ", platformId='" + platformId + '\'' +
                ", season=" + season +
                ", queue=" + queue +
                ", role='" + role + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
