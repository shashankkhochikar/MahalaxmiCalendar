package com.impex.mahalaxmicalendar.domain;

public class Panchang {
    private String bharatiyaSaurDate;
    private String date;
    private String day;
    private String karan;
    private String marathiMonth;
    private String moonRashi;
    private String nakshtra;
    private String sunrise;
    private String sunset;
    private String timeUpToKaran;
    private String timeUpToNakshtra;
    private String timeUpToTithi;
    private String timeUpToYoga;
    private String tithi;
    private String yoga;

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

    public String getMarathiMonth() {
        return this.marathiMonth;
    }

    public void setMarathiMonth(String str) {
        this.marathiMonth = str;
    }

    public String getTithi() {
        return this.tithi;
    }

    public void setTithi(String str) {
        this.tithi = str;
    }

    public String getTimeUpToTithi() {
        return this.timeUpToTithi;
    }

    public void setTimeUpToTithi(String str) {
        this.timeUpToTithi = str;
    }

    public String getNakshtra() {
        return this.nakshtra;
    }

    public void setNakshtra(String str) {
        this.nakshtra = str;
    }

    public String getTimeUpToNakshtra() {
        return this.timeUpToNakshtra;
    }

    public void setTimeUpToNakshtra(String str) {
        this.timeUpToNakshtra = str;
    }

    public String getYoga() {
        return this.yoga;
    }

    public void setYoga(String str) {
        this.yoga = str;
    }

    public String getTimeUpToYoga() {
        return this.timeUpToYoga;
    }

    public void setTimeUpToYoga(String str) {
        this.timeUpToYoga = str;
    }

    public String getKaran() {
        return this.karan;
    }

    public void setKaran(String str) {
        this.karan = str;
    }

    public String getTimeUpToKaran() {
        return this.timeUpToKaran;
    }

    public void setTimeUpToKaran(String str) {
        this.timeUpToKaran = str;
    }

    public String getMoonRashi() {
        return this.moonRashi;
    }

    public void setMoonRashi(String str) {
        this.moonRashi = str;
    }

    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String str) {
        this.sunrise = str;
    }

    public String getSunset() {
        return this.sunset;
    }

    public void setSunset(String str) {
        this.sunset = str;
    }

    public String getBharatiyaSaurDate() {
        return this.bharatiyaSaurDate;
    }

    public void setBharatiyaSaurDate(String str) {
        this.bharatiyaSaurDate = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Panchang{date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", marathiMonth='");
        sb.append(this.marathiMonth);
        sb.append('\'');
        sb.append(", tithi='");
        sb.append(this.tithi);
        sb.append('\'');
        sb.append(", timeUpToTithi='");
        sb.append(this.timeUpToTithi);
        sb.append('\'');
        sb.append(", nakshtra='");
        sb.append(this.nakshtra);
        sb.append('\'');
        sb.append(", timeUpToNakshtra='");
        sb.append(this.timeUpToNakshtra);
        sb.append('\'');
        sb.append(", yoga='");
        sb.append(this.yoga);
        sb.append('\'');
        sb.append(", timeUpToYoga='");
        sb.append(this.timeUpToYoga);
        sb.append('\'');
        sb.append(", karan='");
        sb.append(this.karan);
        sb.append('\'');
        sb.append(", timeUpToKaran='");
        sb.append(this.timeUpToKaran);
        sb.append('\'');
        sb.append(", moonRashi='");
        sb.append(this.moonRashi);
        sb.append('\'');
        sb.append(", sunrise='");
        sb.append(this.sunrise);
        sb.append('\'');
        sb.append(", sunset='");
        sb.append(this.sunset);
        sb.append('\'');
        sb.append(", bharatiyaSaurDate='");
        sb.append(this.bharatiyaSaurDate);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
