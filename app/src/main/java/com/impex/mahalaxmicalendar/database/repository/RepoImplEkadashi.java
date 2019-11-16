package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Ekadashi;
import java.util.ArrayList;
import java.util.List;

public class RepoImplEkadashi implements RepoEkadashi {
    private Helper helper;

    public RepoImplEkadashi(Helper helper2) {
        this.helper = helper2;
    }

    public List<Ekadashi> getEkadashiReminder(String str, String str2) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select date,day,month,ekadashi from ekadashi where date between date('");
        sb.append(str);
        sb.append("') AND date('");
        sb.append(str2);
        sb.append("') ");
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                Ekadashi ekadashi = new Ekadashi();
                ekadashi.setMonth(rawQuery.getString(rawQuery.getColumnIndex("month")));
                ekadashi.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                ekadashi.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                ekadashi.setEkadashiName(rawQuery.getString(rawQuery.getColumnIndex("ekadashi")));
                arrayList.add(ekadashi);
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
