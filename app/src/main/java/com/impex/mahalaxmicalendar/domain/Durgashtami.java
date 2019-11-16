package com.impex.mahalaxmicalendar.domain;

public class Durgashtami {
    private String date;
    private String day;
    private String month;

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String str) {
        this.day = str;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Durgashtami{month='");
        sb.append(this.month);
        sb.append('\'');
        sb.append(", day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
