package com.company;

public enum Seasons {
    Summer("hot", "лето"),
    Autumn("cold","осень"),
    Winter("very cold","зима"),
    Spring("warm","весна");

    private String warmT;
    private String ruCaption;

    private Seasons (String warmT, String ruCaption) {
        this.warmT = warmT;
        this.ruCaption = ruCaption;
    }

    public String getWarmT() {
        return warmT;
    }

    public String getRuCaption() {
        return ruCaption;
    }


}
