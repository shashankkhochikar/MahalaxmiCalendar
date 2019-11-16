package com.impex.mahalaxmicalendar.domain;

public class Notes {
    private String date;
    private String notesMsg;
    private Integer srNo;

    public Integer getSrNo() {
        return this.srNo;
    }

    public void setSrNo(Integer num) {
        this.srNo = num;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getNotesMsg() {
        return this.notesMsg;
    }

    public void setNotesMsg(String str) {
        this.notesMsg = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Notes{srNo=");
        sb.append(this.srNo);
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", notesMsg='");
        sb.append(this.notesMsg);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
