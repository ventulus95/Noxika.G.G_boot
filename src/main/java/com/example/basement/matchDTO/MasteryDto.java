package com.example.basement.matchDTO;

public class MasteryDto {
    private int masteryId;
    private int rank;

    public MasteryDto() {
    }

    public MasteryDto(int masteryId, int rank) {
        this.masteryId = masteryId;
        this.rank = rank;
    }

    public int getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(int masteryId) {
        this.masteryId = masteryId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "MasteryDto{" +
                "masteryId=" + masteryId +
                ", rank=" + rank +
                '}';
    }
}
