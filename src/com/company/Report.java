package com.company;

public class Report {
    Seasons season;
    String reportText;
    //constructor
    public Report (Seasons season, String reportText) {
        this.season = season;
        this.reportText = reportText;
    }

    @Override
    public String toString () {
        return reportText;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (!(obj instanceof Report)) return false;
        Report that = (Report) obj; // Преобразуем obj в репорт


        if ((this.season == that.season)
                && (this.reportText.equals(that.reportText)))
                return true;
        return false;
}}
