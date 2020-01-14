package com.example.basement.Version;

import com.example.basement.Version.Version;

public class Realms {
    private Version n;
    private String v;
    private String l;
    private String cdn;

    public Realms() {
    }

    public Realms(Version n, String v, String l, String cdn) {
        this.n = n;
        this.v = v;
        this.l = l;
        this.cdn = cdn;
    }

    public Version getN() {
        return n;
    }

    public void setN(Version n) {
        this.n = n;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    @Override
    public String toString() {
        return "Realms{" +
                "n=" + n +
                ", v='" + v + '\'' +
                ", l='" + l + '\'' +
                ", cdn='" + cdn + '\'' +
                '}';
    }

}