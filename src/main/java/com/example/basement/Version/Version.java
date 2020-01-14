package com.example.basement.Version;

public class Version implements Cloneable {

    private String item;
    private String rune;
    private String mastery;
    private String summoner;
    private String champion;
    private String profileicon;
    private String map;
    private String language;
    private String sticker;

    public Version() {
    }

    public Version(String item, String rune, String mastery, String summoner, String champion, String profileicon, String map, String language, String sticker) {
        this.item = item;
        this.rune = rune;
        this.mastery = mastery;
        this.summoner = summoner;
        this.champion = champion;
        this.profileicon = profileicon;
        this.map = map;
        this.language = language;
        this.sticker = sticker;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getRune() {
        return rune;
    }

    public void setRune(String rune) {
        this.rune = rune;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(String mastery) {
        this.mastery = mastery;
    }

    public String getSummoner() {
        return summoner;
    }

    public void setSummoner(String summoner) {
        this.summoner = summoner;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getProfileicon() {
        return profileicon;
    }

    public void setProfileicon(String profileicon) {
        this.profileicon = profileicon;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    @Override
    public String toString() {
        return "Version{" +
                "item='" + item + '\'' +
                ", rune='" + rune + '\'' +
                ", mastery='" + mastery + '\'' +
                ", summoner='" + summoner + '\'' +
                ", champion='" + champion + '\'' +
                ", profileicon='" + profileicon + '\'' +
                ", map='" + map + '\'' +
                ", language='" + language + '\'' +
                ", sticker='" + sticker + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
