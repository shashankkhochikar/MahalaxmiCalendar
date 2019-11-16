package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TableRashibhavishya;
import com.impex.mahalaxmicalendar.database.Helper;

public class RepoImplRashiBhavishya implements RepoRashiBhavishya {
    private Helper helper;

    public RepoImplRashiBhavishya(Helper helper2) {
        this.helper = helper2;
    }

    public String getRashiDetailsByMonth(String str, String str2) {
        SQLiteDatabase readableDatabase = this.helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(str);
        sb.append(" FROM ");
        sb.append(TableRashibhavishya.TABLE_NAME);
        sb.append(" WHERE ");
        sb.append("month");
        sb.append("='");
        sb.append(str2);
        sb.append("';");
        String sb2 = sb.toString();
        String str3 = null;
        Cursor rawQuery = readableDatabase.rawQuery(sb2, null);
        while (rawQuery.moveToNext()) {
            try {
                str3 = rawQuery.getString(rawQuery.getColumnIndex(str));
            } finally {
                readableDatabase.close();
                rawQuery.close();
            }
        }
        return str3;
    }
}
