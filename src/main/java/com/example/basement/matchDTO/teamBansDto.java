package com.example.basement.matchDTO;

public class teamBansDto {

    private int pickTurn;
    private int championId;

    public teamBansDto() {
    }

    public teamBansDto(int pickTurn, int championId) {
        this.pickTurn = pickTurn;
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    @Override
    public String toString() {
        return "teamBansDto{" +
                "pickTurn=" + pickTurn +
                ", championId=" + championId +
                '}';
    }
}

