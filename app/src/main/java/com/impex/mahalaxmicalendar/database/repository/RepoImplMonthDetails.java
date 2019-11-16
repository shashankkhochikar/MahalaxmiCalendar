package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TableMonthDetails;
import com.impex.mahalaxmicalendar.database.Helper;
import java.util.ArrayList;
import java.util.List;

public class RepoImplMonthDetails implements RepoMonthDetails {
    private Helper helper;
    private SQLiteDatabase sqDb;

    public RepoImplMonthDetails(Helper helper2) {
        this.helper = helper2;
        this.sqDb = helper2.getWritableDatabase();
    }

    public List<String> getMonthInfo(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT month_info FROM month_details WHERE month='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = this.sqDb.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(TableMonthDetails.COL_MONTH_INFO)));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    public String getMonthNameFromDatabase(Integer num) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT month FROM month_details WHERE sr_no=");
        sb.append(num);
        sb.append(";");
        Cursor rawQuery = this.sqDb.rawQuery(sb.toString(), null);
        String str = null;
        while (rawQuery.moveToNext()) {
            try {
                str = rawQuery.getString(rawQuery.getColumnIndex("month"));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str;
        //throw th;
    }

    public Integer getMonthNumberFromDatabase(String str) {
        Throwable th;
        String[] split = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT sr_no FROM month_details WHERE month='");
        sb.append(split[0]);
        sb.append("';");
        Cursor rawQuery = this.sqDb.rawQuery(sb.toString(), null);
        Integer num = null;
        while (rawQuery.moveToNext()) {
            try {
                num = Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("sr_no")));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return num;
        //throw th;
    }

    public String getMonthInfoFromDatabase(String str) {
        Throwable th;
        String[] split = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT month_info FROM month_details WHERE month='");
        sb.append(split[0]);
        sb.append("';");
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableMonthDetails.COL_MONTH_INFO));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        //throw th;
    }

    public List<String> getMonthList() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.sqDb.rawQuery("Select month from month_details", null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("month")));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }
}
