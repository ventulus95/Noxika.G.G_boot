package com.example.basement.matchDTO;

import com.example.basement.DTO.Summoner;

import java.util.List;

public class ParticipantDto {
    private ParticipantStatsDto stats;
    private int participantId;
    private int championId;
    private int teamId;     //	100 for blue side. 200 for red side.
    private int spell1Id;
    private int spell2Id;
    private List<RuneDto> runes;
    private List<MasteryDto> masteries;
    private String highestAchievedSeasonTier;
    private ParticipantTimelineDto timeline;

    public ParticipantDto() {
    }

    public ParticipantDto(ParticipantStatsDto stats, int participantId, int championId, int teamId, int spell1Id, int spell2Id, List<RuneDto> runes, List<MasteryDto> masteries, String highestAchievedSeasonTier, ParticipantTimelineDto timeline) {
        this.stats = stats;
        this.participantId = participantId;
        this.championId = championId;
        this.teamId = teamId;
        this.spell1Id = spell1Id;
        this.spell2Id = spell2Id;
        this.runes = runes;
        this.masteries = masteries;
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
        this.timeline = timeline;
    }

    public ParticipantStatsDto getStats() {
        return stats;
    }

    public void setStats(ParticipantStatsDto stats) {
        this.stats = stats;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(int spell1Id) {
        this.spell1Id = spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    public List<RuneDto> getRunes() {
        return runes;
    }

    public void setRunes(List<RuneDto> runes) {
        this.runes = runes;
    }

    public List<MasteryDto> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<MasteryDto> masteries) {
        this.masteries = masteries;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    public ParticipantTimelineDto getTimeline() {
        return timeline;
    }

    public void setTimeline(ParticipantTimelineDto timeline) {
        this.timeline = timeline;
    }

    @Override
    public String toString() {
        return "ParticipantDto{" +
                "stats=" + stats +
                ", participantId=" + participantId +
                ", championId=" + championId +
                ", teamId=" + teamId +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", runes=" + runes +
                ", masteries=" + masteries +
                ", highestAchievedSeasonTier='" + highestAchievedSeasonTier + '\'' +
                ", timeline=" + timeline +
                '}';
    }
}
