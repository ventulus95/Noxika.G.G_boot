package com.example.basement.matchDTO;

import java.util.List;

public class MatchDto {

    private int seasonId;
    private int queueId;
    private long gameId;
    private List<ParticipantIdentityDto> participantIdentities;
    private String gameVersion;
    private String platformId;
    private String gameMode;
    private int mapId;
    private String gameType;
    private List<TeamStatsDto> teams;
    private List<ParticipantDto> participants;
    private long gameDuration;
    private long gameCreation;
    private boolean winorloss; //true: loss false: true
    private int currteam;

    public MatchDto() {
    }

    public MatchDto(int seasonId, int queueId, long gameId, List<ParticipantIdentityDto> participantIdentities, String gameVersion, String platformId, String gameMode, int mapId, String gameType, List<TeamStatsDto> teams, List<ParticipantDto> participants, long gameDuration, long gameCreation) {
        this.seasonId = seasonId;
        this.queueId = queueId;
        this.gameId = gameId;
        this.participantIdentities = participantIdentities;
        this.gameVersion = gameVersion;
        this.platformId = platformId;
        this.gameMode = gameMode;
        this.mapId = mapId;
        this.gameType = gameType;
        this.teams = teams;
        this.participants = participants;
        this.gameDuration = gameDuration;
        this.gameCreation = gameCreation;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public List<ParticipantIdentityDto> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentityDto> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public List<TeamStatsDto> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamStatsDto> teams) {
        this.teams = teams;
    }

    public List<ParticipantDto> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantDto> participants) {
        this.participants = participants;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(long gameDuration) {
        this.gameDuration = gameDuration;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public boolean isWinorloss() {
        return winorloss;
    }

    public void setWinorloss(boolean winorloss) {
        this.winorloss = winorloss;
    }

    public int getCurrteam() {
        return currteam;
    }

    public void setCurrteam(int currteam) {
        this.currteam = currteam;
    }

    @Override
    public String toString() {
        return "MatchDto{" +
                "seasonId=" + seasonId +
                ", queueId=" + queueId +
                ", gameId=" + gameId +
                ", participantIdentities=" + participantIdentities +
                ", gameVersion='" + gameVersion + '\'' +
                ", platformId='" + platformId + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", mapId=" + mapId +
                ", gameType='" + gameType + '\'' +
                ", teams=" + teams +
                ", participants=" + participants +
                ", gameDuration=" + gameDuration +
                ", gameCreation=" + gameCreation +
                ", winorloss=" + winorloss +
                ", currteam=" + currteam +
                '}';
    }
}
