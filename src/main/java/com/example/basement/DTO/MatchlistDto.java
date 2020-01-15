package com.example.basement.DTO;

import java.util.List;

public class MatchlistDto {
    private List<MatchReferenceDto> matches;
    private int totalGames;

    public MatchlistDto() {
    }

    public MatchlistDto(List<MatchReferenceDto> matches, int totalGames) {
        this.matches = matches;
        this.totalGames = totalGames;
    }

    public List<MatchReferenceDto> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReferenceDto> matches) {
        this.matches = matches;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    @Override
    public String toString() {
        return "MatchlistDto{" +
                "matches=" + matches +
                ", totalGames=" + totalGames +
                '}';
    }
}
