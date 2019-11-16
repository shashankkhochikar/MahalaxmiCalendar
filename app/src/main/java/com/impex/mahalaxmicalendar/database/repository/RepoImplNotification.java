package com.impex.mahalaxmicalendar.database.repository;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Helper;

public class RepoImplNotification implements RepoNotification {
    private Helper helper;

    public RepoImplNotification(Helper helper2) {
        this.helper = helper2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009d, code lost:
        if (r5 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009f, code lost:
        if (r6 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a5, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0099, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.impex.mahalaxmicalendar.domain.NotificationDetails> getNotification(Integer r5, String r6) {
        /*
            r4 = this;
            com.impex.mahalaxmicalendar.database.Helper r0 = r4.helper
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Select GROUP_CONCAT(message) AS message,date_english,date_marathi,month from notification where month = '"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "' and "
            r2.append(r6)
            java.lang.String r6 = "is_fired"
            r2.append(r6)
            java.lang.String r6 = " = 0 and "
            r2.append(r6)
            java.lang.String r6 = "date_english"
            r2.append(r6)
            java.lang.String r6 = " = "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = " GROUP BY "
            r2.append(r5)
            java.lang.String r5 = "date_english"
            r2.append(r5)
            java.lang.String r5 = " HAVING COUNT(*) >= 1"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6 = 0
            android.database.Cursor r5 = r0.rawQuery(r5, r6)
        L_0x004c:
            boolean r0 = r5.moveToNext()     // Catch:{ Throwable -> 0x009b }
            if (r0 == 0) goto L_0x0093
            com.impex.mahalaxmicalendar.domain.NotificationDetails r0 = new com.impex.mahalaxmicalendar.domain.NotificationDetails     // Catch:{ Throwable -> 0x009b }
            r0.<init>()     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = "date_english"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x009b }
            int r2 = r5.getInt(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x009b }
            r0.setDateEnglish(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = "date_marathi"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x009b }
            r0.setDateMarathi(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = "month"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x009b }
            r0.setMonth(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = "message"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x009b }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x009b }
            r0.setMessage(r2)     // Catch:{ Throwable -> 0x009b }
            r1.add(r0)     // Catch:{ Throwable -> 0x009b }
            goto L_0x004c
        L_0x0093:
            if (r5 == 0) goto L_0x0098
            r5.close()
        L_0x0098:
            return r1
        L_0x0099:
            r0 = move-exception
            goto L_0x009d
        L_0x009b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0099 }
        L_0x009d:
            if (r5 == 0) goto L_0x00a8
            if (r6 == 0) goto L_0x00a5
            r5.close()     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00a8
        L_0x00a5:
            r5.close()
        L_0x00a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impex.mahalaxmicalendar.database.repository.RepoImplNotification.getNotification(java.lang.Integer, java.lang.String):java.util.List");
    }

    public int updateNotificationStatus(Integer num, String str) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_fired", Integer.valueOf(1));
        return writableDatabase.update("notification", contentValues, "date_english = ? and month = ?", new String[]{String.valueOf(num), str});
    }
}
