package com.impex.mahalaxmicalendar.domain;

public class NotificationDetails {
    private Integer dateEnglish;
    private String dateMarathi;
    private String message;
    private String month;

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public String getDateMarathi() {
        return this.dateMarathi;
    }

    public void setDateMarathi(String str) {
        this.dateMarathi = str;
    }

    public Integer getDateEnglish() {
        return this.dateEnglish;
    }

    public void setDateEnglish(Integer num) {
        this.dateEnglish = num;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationDetails{month='");
        sb.append(this.month);
        sb.append('\'');
        sb.append(", dateMarathi='");
        sb.append(this.dateMarathi);
        sb.append('\'');
        sb.append(", dateEnglish=");
        sb.append(this.dateEnglish);
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
