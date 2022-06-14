package com.eray.formula1takvim;

public class Pistler {
    String pistResim;
    String pistAd;

    public Pistler() {
    }

    public Pistler(String pistResim, String pistAd) {
        this.pistResim = pistResim;
        this.pistAd = pistAd;
    }

    public String getPistResim() {
        return pistResim;
    }

    public void setPistResim(String pistResim) {
        this.pistResim = pistResim;
    }

    public String getPistAd() {
        return pistAd;
    }

    public void setPistAd(String pistAd) {
        this.pistAd = pistAd;
    }
}
