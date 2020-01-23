package com.example.basement.matchDTO;

public class PlayerDto {

    private String currentPlatformId;
    private String summonerName;
    private String matchHistoryUri;
    private String platformId;
    private String currentAccountId;
    private int profileIcon;
    private String summonerId;
    private String accountId;

    public PlayerDto() {
    }

    public PlayerDto(String currentPlatformId, String summonerName, String matchHistoryUri, String platformId, String currentAccountId, int profileIcon, String summonerId, String accountId) {
        this.currentPlatformId = currentPlatformId;
        this.summonerName = summonerName;
        this.matchHistoryUri = matchHistoryUri;
        this.platformId = platformId;
        this.currentAccountId = currentAccountId;
        this.profileIcon = profileIcon;
        this.summonerId = summonerId;
        this.accountId = accountId;
    }

    public String getCurrentPlatformId() {
        return currentPlatformId;
    }

    public void setCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getCurrentAccountId() {
        return currentAccountId;
    }

    public void setCurrentAccountId(String currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(int profileIcon) {
        this.profileIcon = profileIcon;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "currentPlatformId='" + currentPlatformId + '\'' +
                ", summonerName='" + summonerName + '\'' +
                ", matchHistoryUri='" + matchHistoryUri + '\'' +
                ", platformId='" + platformId + '\'' +
                ", currentAccountId='" + currentAccountId + '\'' +
                ", profileIcon=" + profileIcon +
                ", summonerId='" + summonerId + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
