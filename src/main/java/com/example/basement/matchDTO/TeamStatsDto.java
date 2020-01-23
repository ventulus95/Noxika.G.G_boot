package com.example.basement.matchDTO;

import java.util.List;

public class TeamStatsDto {
    private boolean firstDragon;
    private boolean firstInhibitor;
    private List<teamBansDto> bans;
    private int baronKills;
    private boolean firstRiftHerald;
    private boolean firstBaron;
    private int riftHeraldKills;
    private boolean firstBlood;
    private int teamId;        //100 for blue side. 200 for red side.
    private boolean firstTower;
    private int vilemawKills;
    private int inhibitorKills;
    private int towerKills;
    private int dominionVictoryScore;
    private String win;
    private int dragonKills;

    public TeamStatsDto() {
    }

    public TeamStatsDto(boolean firstDragon, boolean firstInhibitor, List<teamBansDto> bans, int baronKills, boolean firstRiftHerald, boolean firstBaron, int riftHeraldKills, boolean firstBlood, int teamId, boolean firstTower, int vilemawKills, int inhibitorKills, int towerKills, int dominionVictoryScore, String win, int dragonKills) {
        this.firstDragon = firstDragon;
        this.firstInhibitor = firstInhibitor;
        this.bans = bans;
        this.baronKills = baronKills;
        this.firstRiftHerald = firstRiftHerald;
        this.firstBaron = firstBaron;
        this.riftHeraldKills = riftHeraldKills;
        this.firstBlood = firstBlood;
        this.teamId = teamId;
        this.firstTower = firstTower;
        this.vilemawKills = vilemawKills;
        this.inhibitorKills = inhibitorKills;
        this.towerKills = towerKills;
        this.dominionVictoryScore = dominionVictoryScore;
        this.win = win;
        this.dragonKills = dragonKills;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public List<teamBansDto> getBans() {
        return bans;
    }

    public void setBans(List<teamBansDto> bans) {
        this.bans = bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(int baronKills) {
        this.baronKills = baronKills;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(int riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public void setFirstTower(boolean firstTower) {
        this.firstTower = firstTower;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(int vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(int dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(int dragonKills) {
        this.dragonKills = dragonKills;
    }

    @Override
    public String toString() {
        return "TeamStatsDto{" +
                "firstDragon=" + firstDragon +
                ", firstInhibitor=" + firstInhibitor +
                ", bans=" + bans +
                ", baronKills=" + baronKills +
                ", firstRiftHerald=" + firstRiftHerald +
                ", firstBaron=" + firstBaron +
                ", riftHeraldKills=" + riftHeraldKills +
                ", firstBlood=" + firstBlood +
                ", teamId=" + teamId +
                ", firstTower=" + firstTower +
                ", vilemawKills=" + vilemawKills +
                ", inhibitorKills=" + inhibitorKills +
                ", towerKills=" + towerKills +
                ", dominionVictoryScore=" + dominionVictoryScore +
                ", win='" + win + '\'' +
                ", dragonKills=" + dragonKills +
                '}';
    }
}
