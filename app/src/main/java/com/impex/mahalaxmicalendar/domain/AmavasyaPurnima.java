package com.impex.mahalaxmicalendar.domain;

public class AmavasyaPurnima {
    private String amavasyaOrPurnima;
    private String endDate;
    private String endTime;
    private String month;
    private String startDate;
    private String startTime;

    public String getAmavasyaOrPurnima() {
        return this.amavasyaOrPurnima;
    }

    public void setAmavasyaOrPurnima(String str) {
        this.amavasyaOrPurnima = str;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AmavasyaPurnima{amavasyaOrPurnima='");
        sb.append(this.amavasyaOrPurnima);
        sb.append('\'');
        sb.append(", month='");
        sb.append(this.month);
        sb.append('\'');
        sb.append(", startDate='");
        sb.append(this.startDate);
        sb.append('\'');
        sb.append(", startTime='");
        sb.append(this.startTime);
        sb.append('\'');
        sb.append(", endDate='");
        sb.append(this.endDate);
        sb.append('\'');
        sb.append(", endTime='");
        sb.append(this.endTime);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }
}
