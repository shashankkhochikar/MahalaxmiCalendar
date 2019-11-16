package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Durgashtami;
import java.util.ArrayList;
import java.util.List;

public class RepoImplDurgashtami implements RepoDurgashtami {
    private Helper helper;

    public RepoImplDurgashtami(Helper helper2) {
        this.helper = helper2;
    }

    public List<Durgashtami> getDurgashtamiReminder(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select date,day,month from durgashtami where date between date('");
        sb.append(str);
        sb.append("') AND date('");
        sb.append(str2);
        sb.append("') ");
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            Durgashtami durgashtami = new Durgashtami();
            durgashtami.setMonth(rawQuery.getString(rawQuery.getColumnIndex("month")));
            durgashtami.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
            durgashtami.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
            arrayList.add(durgashtami);
        }
        return arrayList;
    }
}
