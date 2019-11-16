package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TableMuhurtas;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Muhurtas;
import java.util.ArrayList;
import java.util.List;

public class RepoImplMuhurtas implements RepoMuhurtas {
    private Helper helper;

    public RepoImplMuhurtas(Helper helper2) {
        this.helper = helper2;
    }

    public List<Muhurtas> getMuhurtInfoByMonth(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("select GROUP_CONCAT(muhurt)as muhurt,date,day from muhurtas where month='");
        sb.append(str);
        sb.append("'GROUP By ");
        sb.append("date");
        sb.append(" HAVING COUNT(*) >= 1");
        Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                Muhurtas muhurtas = new Muhurtas();
                muhurtas.setMuhurt(rawQuery.getString(rawQuery.getColumnIndex(TableMuhurtas.COL_MUHURT)));
                muhurtas.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                muhurtas.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                arrayList.add(muhurtas);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    public List<String> getTodayMuhurt(String str) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("Select muhurt from muhurtas where date='");
        sb.append(str);
        sb.append("';");
        Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(TableMuhurtas.COL_MUHURT)));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    public List<String> getMuhurtas() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery("select distinct(muhurt) from muhurtas", null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(TableMuhurtas.COL_MUHURT)));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        if (r5 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007a, code lost:
        if (r6 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public List<com.impex.mahalaxmicalendar.domain.Muhurtas> getMuhurtByMonthAndMuhurt(String r5, String r6) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.impex.mahalaxmicalendar.database.Helper r1 = r4.helper
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Select day,date,muhurt from muhurtas where month='"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "' and "
            r2.append(r5)
            java.lang.String r5 = "muhurt"
            r2.append(r5)
            java.lang.String r5 = " = '"
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = "'"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6 = 0
            android.database.Cursor r5 = r1.rawQuery(r5, r6)
        L_0x0038:
            boolean r1 = r5.moveToNext()     // Catch:{ Throwable -> 0x0076 }
            if (r1 == 0) goto L_0x006e
            com.impex.mahalaxmicalendar.domain.Muhurtas r1 = new com.impex.mahalaxmicalendar.domain.Muhurtas     // Catch:{ Throwable -> 0x0076 }
            r1.<init>()     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = "day"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0076 }
            r1.setDay(r2)     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = "date"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0076 }
            r1.setDate(r2)     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = "muhurt"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0076 }
            r1.setMuhurt(r2)     // Catch:{ Throwable -> 0x0076 }
            r0.add(r1)     // Catch:{ Throwable -> 0x0076 }
            goto L_0x0038
        L_0x006e:
            if (r5 == 0) goto L_0x0073
            r5.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0078
        L_0x0076:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0074 }
        L_0x0078:
            if (r5 == 0) goto L_0x0083
            if (r6 == 0) goto L_0x0080
            r5.close()     // Catch:{ Throwable -> 0x0083 }
            goto L_0x0083
        L_0x0080:
            r5.close()
        L_0x0083:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impex.mahalaxmicalendar.database.repository.RepoImplMuhurtas.getMuhurtByMonthAndMuhurt(java.lang.String, java.lang.String):java.util.List");
    }
}
