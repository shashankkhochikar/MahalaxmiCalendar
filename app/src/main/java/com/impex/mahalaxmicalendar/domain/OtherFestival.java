package com.impex.mahalaxmicalendar.domain;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class OtherFestival implements Parcelable {
    public static final Creator<OtherFestival> CREATOR = new Creator<OtherFestival>() {
        public OtherFestival createFromParcel(Parcel parcel) {
            return new OtherFestival(parcel);
        }

        public OtherFestival[] newArray(int i) {
            return new OtherFestival[i];
        }
    };
    private String date;
    private String day;
    private String festival;
    private boolean isSelected;

    public int describeContents() {
        return 0;
    }

    public OtherFestival() {
    }

    public OtherFestival(Parcel parcel) {
        this.day = parcel.readString();
        this.date = parcel.readString();
        this.festival = parcel.readString();
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
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

    public String getFestival() {
        return this.festival;
    }

    public void setFestival(String str) {
        this.festival = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OtherFestival{day='");
        sb.append(this.day);
        sb.append('\'');
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", festival='");
        sb.append(this.festival);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.day);
        parcel.writeString(this.date);
        parcel.writeString(this.festival);
    }
}
