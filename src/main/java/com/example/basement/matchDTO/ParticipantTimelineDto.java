package com.example.basement.matchDTO;

import java.util.HashMap;

public class ParticipantTimelineDto {
    private String lane;
    private int participantId;
    private HashMap<String, Double> csDiffPerMinDeltas;    //Creep score difference versus the calculated lane opponent(s) for a specified period.
    private HashMap<String, Double> goldPerMinDeltas;    //Gold for a specified period.
    private HashMap<String, Double> xpDiffPerMinDeltas; //Experience difference versus the calculated lane opponent(s) for a specified period.
    private HashMap<String, Double> creepsPerMinDeltas;    //Creeps for a specified period.
    private HashMap<String, Double> xpPerMinDeltas; //Experience change for a specified period.
    private String role; //Participant's calculated role. (Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT)
    private HashMap<String, Double> damageTakenDiffPerMinDeltas;    //Damage taken difference versus the calculated lane opponent(s) for a specified period.
    private HashMap<String, Double> damageTakenPerMinDeltas;    //	Damage taken for a specified period.

    public ParticipantTimelineDto() {
    }

    public ParticipantTimelineDto(String lane, int participantId, HashMap<String, Double> csDiffPerMinDeltas, HashMap<String, Double> goldPerMinDeltas, HashMap<String, Double> xpDiffPerMinDeltas, HashMap<String, Double> creepsPerMinDeltas, HashMap<String, Double> xpPerMinDeltas, String role, HashMap<String, Double> damageTakenDiffPerMinDeltas, HashMap<String, Double> damageTakenPerMinDeltas) {
        this.lane = lane;
        this.participantId = participantId;
        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
        this.goldPerMinDeltas = goldPerMinDeltas;
        this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
        this.creepsPerMinDeltas = creepsPerMinDeltas;
        this.xpPerMinDeltas = xpPerMinDeltas;
        this.role = role;
        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public HashMap<String, Double> getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public void setCsDiffPerMinDeltas(HashMap<String, Double> csDiffPerMinDeltas) {
        this.csDiffPerMinDeltas = csDiffPerMinDeltas;
    }

    public HashMap<String, Double> getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public void setGoldPerMinDeltas(HashMap<String, Double> goldPerMinDeltas) {
        this.goldPerMinDeltas = goldPerMinDeltas;
    }

    public HashMap<String, Double> getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public void setXpDiffPerMinDeltas(HashMap<String, Double> xpDiffPerMinDeltas) {
        this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
    }

    public HashMap<String, Double> getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public void setCreepsPerMinDeltas(HashMap<String, Double> creepsPerMinDeltas) {
        this.creepsPerMinDeltas = creepsPerMinDeltas;
    }

    public HashMap<String, Double> getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public void setXpPerMinDeltas(HashMap<String, Double> xpPerMinDeltas) {
        this.xpPerMinDeltas = xpPerMinDeltas;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public HashMap<String, Double> getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    public void setDamageTakenDiffPerMinDeltas(HashMap<String, Double> damageTakenDiffPerMinDeltas) {
        this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
    }

    public HashMap<String, Double> getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public void setDamageTakenPerMinDeltas(HashMap<String, Double> damageTakenPerMinDeltas) {
        this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
    }

    @Override
    public String toString() {
        return "ParticipantTimelineDto{" +
                "lane='" + lane + '\'' +
                ", participantId=" + participantId +
                ", csDiffPerMinDeltas=" + csDiffPerMinDeltas +
                ", goldPerMinDeltas=" + goldPerMinDeltas +
                ", xpDiffPerMinDeltas=" + xpDiffPerMinDeltas +
                ", creepsPerMinDeltas=" + creepsPerMinDeltas +
                ", xpPerMinDeltas=" + xpPerMinDeltas +
                ", role='" + role + '\'' +
                ", damageTakenDiffPerMinDeltas=" + damageTakenDiffPerMinDeltas +
                ", damageTakenPerMinDeltas=" + damageTakenPerMinDeltas +
                '}';
    }
}
