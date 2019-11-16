package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TablePanchang;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Panchang;
import java.util.ArrayList;
import java.util.List;

public class RepoImplPanchang implements RepoPanchang {
    private Helper helper;

    public RepoImplPanchang(Helper helper2) {
        this.helper = helper2;
    }

    public List<Panchang> getPanchangInfo(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("select date,day,marathi_month,tithi,time_up_to_tithi,nakshatra,time_up_to_nakshatra,yoga,time_up_to_yoga,karan,time_up_to_karan,moonrashi,sunrise,sunset,bharatiya_saur_date from panchang where month = '");
        sb.append(str);
        sb.append("'");
        Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                Panchang panchang = new Panchang();
                panchang.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                panchang.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                panchang.setMarathiMonth(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_MARATHI_MONTH)));
                panchang.setTithi(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_THITHI)));
                panchang.setTimeUpToTithi(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_TIME_UP_TO_THITHI)));
                panchang.setNakshtra(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_NAKSHATRA)));
                panchang.setTimeUpToNakshtra(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_TIME_UP_TO_NAKSHATRA)));
                panchang.setYoga(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_YOGA)));
                panchang.setTimeUpToYoga(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_TIME_UP_TO_YOGA)));
                panchang.setKaran(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_KARAN)));
                panchang.setTimeUpToKaran(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_TIME_UP_TO_KARAN)));
                panchang.setMoonRashi(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_MOONRASHI)));
                panchang.setSunrise(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_SUNRISE)));
                panchang.setSunset(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_SUNSET)));
                panchang.setBharatiyaSaurDate(rawQuery.getString(rawQuery.getColumnIndex(TablePanchang.COL_BHARATIYA_SAUR_DATE)));
                arrayList.add(panchang);
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
