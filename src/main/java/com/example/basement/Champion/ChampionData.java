package com.example.basement.Champion;

public class ChampionData {
    private String version;
    private String id;
    private int key;
    private String title;
    private String blurb;
    private String name;

    public ChampionData() {
    }

    public ChampionData(String version, String id, int key, String title, String blurb, String name) {
        this.version = version;
        this.id = id;
        this.key = key;
        this.title = title;
        this.blurb = blurb;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    @Override
    public String toString() {
        return "ChampionData{" +
                "version='" + version + '\'' +
                ", id='" + id + '\'' +
                ", key=" + key +
                ", title='" + title + '\'' +
                ", blurb='" + blurb + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //    "info":{"attack":8,"defense":4,"magic":3,"difficulty":4},
//    "image":{"full":"Aatrox.png","sprite":"champion0.png","group":"champion","x":0,"y":0,"w":48,"h":48},
//    "tags":["Fighter","Tank"],
//    "partype":"피의 샘",
//    "stats":{"hp":580,"hpperlevel":90,"mp":0,"mpperlevel":0,"movespeed":345,"armor":38,"armorperlevel":3.25,"spellblock":32.1,
//    "spellblockperlevel":1.25,"attackrange":175,"hpregen":3,"hpregenperlevel":1,"mpregen":0,"mpregenperlevel":0,"crit":0,
//    "critperlevel":0,"attackdamage":60,"attackdamageperlevel":5,"attackspeedperlevel":2.5,"attackspeed":0.651}}
}
