package com.impex.mahalaxmicalendar.domain;

public class Sankashti {
    private String date;
    private String day;
    private String location;
    private String month;
    private String time;

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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sankashti{day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", location='");
        sb.append(this.location);
        sb.append('\'');
        sb.append(", month='");
        sb.append(this.month);
        sb.append('\'');
        sb.append(", time='");
        sb.append(this.time);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
