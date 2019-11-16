package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import com.impex.mahalaxmicalendar.database.Database.TableAmavasyaPurnima;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.AmavasyaPurnima;
import java.util.ArrayList;
import java.util.List;

public class RepoImplAmavasyaPurnima implements RepoAmavasyaPurnima {
    private Helper helper;

    public RepoImplAmavasyaPurnima(Helper helper2) {
        this.helper = helper2;
    }

    public List<AmavasyaPurnima> getAmavasyaPurnimaReminder(String str, String str2, String str3) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select start_date,start_time,month from amavasyaPurnima where start_date between date('");
        sb.append(str);
        sb.append("') AND date('");
        sb.append(str2);
        sb.append("') and ");
        sb.append(TableAmavasyaPurnima.COL_AMAVASYA_PURNIMA);
        sb.append(" = '");
        sb.append(str3);
        sb.append("'");
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                AmavasyaPurnima amavasyaPurnima = new AmavasyaPurnima();
                amavasyaPurnima.setMonth(rawQuery.getString(rawQuery.getColumnIndex("month")));
                amavasyaPurnima.setStartDate(rawQuery.getString(rawQuery.getColumnIndex(TableAmavasyaPurnima.COL_START_DATE)));
                amavasyaPurnima.setStartTime(rawQuery.getString(rawQuery.getColumnIndex(TableAmavasyaPurnima.COL_START_TIME)));
                arrayList.add(amavasyaPurnima);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        ////throw th;
    }
}
