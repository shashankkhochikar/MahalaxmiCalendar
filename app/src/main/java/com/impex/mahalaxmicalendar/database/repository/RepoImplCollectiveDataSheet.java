package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import com.impex.mahalaxmicalendar.database.Database.TableCollectiveDataSheet;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.OtherFestival;
import java.util.ArrayList;
import java.util.List;

public class RepoImplCollectiveDataSheet implements RepoCollectiveDataSheet {
    Helper helper;

    public List<String> getNationalHolidaysInfo(String str) {
        return null;
    }

    public RepoImplCollectiveDataSheet(Helper helper2) {
        helper = helper2;
    }

    public String getDaySummary(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT day_summary FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_DAY_SUMMARY));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getFestivals(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT festival FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_FESTIVAL));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getDailyPanchang(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT daily_panchang_info FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_DAILY_PANCHANG_INFO));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getDailyHighLights(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT days_highlights FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_DAYS_HIGHLIGHTS));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getShubhAshubhDay(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT shubh_ashubh_day FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_SHUBH_ASHUBH_DAY));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getIslamicDate(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT islamic_date FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_ISLAMIC_DATE));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public List<String> getFestivalList(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT festival FROM collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_FESTIVAL)));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<OtherFestival> getFestivalListByMonth(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT DISTINCT (festival),day,date FROM collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("' and ");
        sb.append(TableCollectiveDataSheet.COL_FESTIVAL);
        sb.append(" IS NOT NULL;");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                OtherFestival otherFestival = new OtherFestival();
                otherFestival.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                otherFestival.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                otherFestival.setFestival(rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_FESTIVAL)));
                arrayList.add(otherFestival);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<String> getFestivalAndEvents(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT DISTINCT (festival),day,date FROM collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("' and ");
        sb.append(TableCollectiveDataSheet.COL_FESTIVAL);
        sb.append(" IS NOT NULL;");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndexOrThrow("day")));
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndexOrThrow("date")));
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndexOrThrow(TableCollectiveDataSheet.COL_FESTIVAL)));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<OtherFestival> getFestivalListToReminder(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT DISTINCT (festival),day,date FROM collective_data_sheet WHERE festival IS NOT NULL and english_date between date('");
        sb.append(str);
        sb.append("') AND date('");
        sb.append("2019-12-31");
        sb.append("')  ");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                OtherFestival otherFestival = new OtherFestival();
                otherFestival.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                otherFestival.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                otherFestival.setFestival(rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_FESTIVAL)));
                arrayList.add(otherFestival);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<OtherFestival> getNationalHolidaysByMonth(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT national_holidays,day,date FROM collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("' and ");
        sb.append(TableCollectiveDataSheet.COL_NATIONAL_HOLIDAYS);
        sb.append(" IS NOT NULL;");
        Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                OtherFestival otherFestival = new OtherFestival();
                otherFestival.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                otherFestival.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                otherFestival.setFestival(rawQuery.getString(rawQuery.getColumnIndex(TableCollectiveDataSheet.COL_NATIONAL_HOLIDAYS)));
                arrayList.add(otherFestival);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<String> getDateList() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = helper.getReadableDatabase().rawQuery("Select date from collective_data_sheet", null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("date")));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public List<String> getWeekNameList() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = helper.getReadableDatabase().rawQuery("Select day from collective_data_sheet", null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("day")));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }

    public String getWeekNameFromDate(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT day FROM collective_data_sheet WHERE date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex("day"));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getLastDateOfMonth(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT date from collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("' ORDER BY ");
        sb.append("sr_no");
        sb.append(" DESC LIMIT 1");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex("date"));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getFirstDateOfMonth(String str) {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT date from collective_data_sheet WHERE month='");
        sb.append(str);
        sb.append("' ORDER BY ");
        sb.append("sr_no");
        sb.append(" LIMIT 1");
        Cursor rawQuery = helper.getReadableDatabase().rawQuery(sb.toString(), null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex("date"));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public String getSecondLastDateOfMonth(String str) {
        Throwable th;
        Cursor rawQuery = helper.getReadableDatabase().rawQuery("SELECT MAX(date) from collective_data_sheet WHERE date < (SELECT MAX(date) from collective_data_sheet)", null);
        String str2 = null;
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(0);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        ////throw th;
    }

    public Boolean isDateValid(String str) {
        Throwable th;
        Boolean valueOf = Boolean.valueOf(false);
        SQLiteDatabase readableDatabase = helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("Select day from collective_data_sheet where english_date = '");
        sb.append(str);
        sb.append("'");
        Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
        try {
            if (rawQuery.getCount() > 0) {
                valueOf = Boolean.valueOf(true);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return valueOf;
        } catch (Throwable unused) {
            Log.e(RepoImplCollectiveDataSheet.class.getName(),""+unused.getMessage());
        }
        return false;
        ////throw th;
    }
}
