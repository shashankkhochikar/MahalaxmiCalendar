package com.impex.mahalaxmicalendar.database.repository;

import android.database.Cursor;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Sankashti;
import java.util.ArrayList;
import java.util.List;

public class RepoImplSankashti implements RepoSankashti {
    private Helper helper;

    public RepoImplSankashti(Helper helper2) {
        this.helper = helper2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        if (r5 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007f, code lost:
        if (r6 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0079, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.impex.mahalaxmicalendar.domain.Sankashti getLocationDayInfo(String r5, String r6) {
        /*
            r4 = this;
            com.impex.mahalaxmicalendar.domain.Sankashti r0 = new com.impex.mahalaxmicalendar.domain.Sankashti
            r0.<init>()
            com.impex.mahalaxmicalendar.database.Helper r1 = r4.helper
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Select day,date,time,location from sankashti where month = '"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "' and "
            r2.append(r5)
            java.lang.String r5 = "location"
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
            boolean r1 = r5.moveToNext()     // Catch:{ Throwable -> 0x007b }
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = "day"
            int r1 = r5.getColumnIndex(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ Throwable -> 0x007b }
            r0.setDay(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = "date"
            int r1 = r5.getColumnIndex(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ Throwable -> 0x007b }
            r0.setDate(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = "time"
            int r1 = r5.getColumnIndex(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ Throwable -> 0x007b }
            r0.setTime(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = "location"
            int r1 = r5.getColumnIndex(r1)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ Throwable -> 0x007b }
            r0.setLocation(r1)     // Catch:{ Throwable -> 0x007b }
            goto L_0x0038
        L_0x0073:
            if (r5 == 0) goto L_0x0078
            r5.close()
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007d
        L_0x007b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0079 }
        L_0x007d:
            if (r5 == 0) goto L_0x0088
            if (r6 == 0) goto L_0x0085
            r5.close()     // Catch:{ Throwable -> 0x0088 }
            goto L_0x0088
        L_0x0085:
            r5.close()
        L_0x0088:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impex.mahalaxmicalendar.database.repository.RepoImplSankashti.getLocationDayInfo(java.lang.String, java.lang.String):com.impex.mahalaxmicalendar.domain.Sankashti");
    }

    public List<String> getSankashtiLocation() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery("select distinct location from sankashti", null);
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("location")));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    public List<Sankashti> getSankashtiReminder(String str, String str2, String str3) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select english_date,location,day,month from sankashti where english_date between date('");
        sb.append(str);
        sb.append("') AND date('");
        sb.append(str2);
        sb.append("') and ");
        sb.append("location");
        sb.append(" = '");
        sb.append(str3);
        sb.append("'");
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                Sankashti sankashti = new Sankashti();
                sankashti.setMonth(rawQuery.getString(rawQuery.getColumnIndex("month")));
                sankashti.setDay(rawQuery.getString(rawQuery.getColumnIndex("day")));
                sankashti.setDate(rawQuery.getString(rawQuery.getColumnIndex("english_date")));
                sankashti.setLocation(rawQuery.getString(rawQuery.getColumnIndex("location")));
                arrayList.add(sankashti);
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
