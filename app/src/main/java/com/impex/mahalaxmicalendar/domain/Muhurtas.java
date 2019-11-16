package com.impex.mahalaxmicalendar.domain;

public class Muhurtas {
    private String date;
    private String day;
    private String muhurt;

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String str) {
        this.day = str;
    }

    public String getMuhurt() {
        return this.muhurt;
    }

    public void setMuhurt(String str) {
        this.muhurt = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Muhurtas{date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", muhurt='");
        sb.append(this.muhurt);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
