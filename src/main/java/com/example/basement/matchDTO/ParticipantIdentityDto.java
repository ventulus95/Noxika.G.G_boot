package com.example.basement.matchDTO;

public class ParticipantIdentityDto {
    private PlayerDto player;
    private int participantId;

    public ParticipantIdentityDto() {
    }

    public ParticipantIdentityDto(PlayerDto player, int participantId) {
        this.player = player;
        this.participantId = participantId;
    }

    public PlayerDto getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDto player) {
        this.player = player;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    @Override
    public String toString() {
        return "ParticipantIdentityDto{" +
                "player=" + player +
                ", participantId=" + participantId +
                '}';
    }
}
