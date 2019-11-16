package com.impex.mahalaxmicalendar.domain;

public class Reminder {
    private String date;
    private String day;
    private String ekadashiName;
    private String festivalName;
    private String month;
    private String music;
    private Integer srNo;
    private String time;

    public String getFestivalName() {
        return this.festivalName;
    }

    public void setFestivalName(String str) {
        this.festivalName = str;
    }

    public Integer getSrNo() {
        return this.srNo;
    }

    public void setSrNo(Integer num) {
        this.srNo = num;
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

    public String getTime() {
        return this.time;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public String getMusic() {
        return this.music;
    }

    public void setMusic(String str) {
        this.music = str;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public String getEkadashiName() {
        return this.ekadashiName;
    }

    public void setEkadashiName(String str) {
        this.ekadashiName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reminder{srNo=");
        sb.append(this.srNo);
        sb.append(", festivalName='");
        sb.append(this.festivalName);
        sb.append('\'');
        sb.append(", day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", month='");
        sb.append(this.month);
        sb.append('\'');
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", time='");
        sb.append(this.time);
        sb.append('\'');
        sb.append(", music='");
        sb.append(this.music);
        sb.append('\'');
        sb.append(", ekadashiName='");
        sb.append(this.ekadashiName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
