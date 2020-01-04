package com.example.basement;

public enum PrivateKey {
    API_KEY("+");
    private final String name;

    private PrivateKey(String s) {
        this.name = s;
    }

    public String getAPIKey(){
        return name;
    }

}
