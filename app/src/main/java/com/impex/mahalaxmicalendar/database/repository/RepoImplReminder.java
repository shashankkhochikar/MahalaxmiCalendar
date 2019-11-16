package com.impex.mahalaxmicalendar.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TableReminder;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Reminder;
import java.util.ArrayList;
import java.util.List;

public class RepoImplReminder implements RepoReminder {
    private Helper helper;

    public RepoImplReminder(Helper helper2) {
        this.helper = helper2;
    }

    public void saveReminderData(Reminder reminder) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("festival_name", reminder.getFestivalName());
        contentValues.put("day", reminder.getDay());
        contentValues.put("date", reminder.getDate());
        contentValues.put("time", reminder.getTime());
        contentValues.put("month", reminder.getMonth());
        contentValues.put(TableReminder.COL_MUSIC_PATH, reminder.getMusic());
        writableDatabase.insert("reminder", null, contentValues);
    }

    public List<Reminder> getReminderList() {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.helper.getReadableDatabase().rawQuery("select sr_no,festival_name,date,month,time,music_path from reminder", null);
        while (rawQuery.moveToNext()) {
            try {
                Reminder reminder = new Reminder();
                reminder.setSrNo(Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("sr_no"))));
                reminder.setFestivalName(rawQuery.getString(rawQuery.getColumnIndex("festival_name")));
                reminder.setDate(rawQuery.getString(rawQuery.getColumnIndex("date")));
                reminder.setMonth(rawQuery.getString(rawQuery.getColumnIndex("month")));
                reminder.setMusic(rawQuery.getString(rawQuery.getColumnIndex(TableReminder.COL_MUSIC_PATH)));
                reminder.setTime(rawQuery.getString(rawQuery.getColumnIndex("time")));
                arrayList.add(reminder);
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        //throw th;
    }

    public Boolean getDeleteReminderList(Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append("sr_no=");
        sb.append(num);
        this.helper.getWritableDatabase().delete("reminder", sb.toString(), null);
        return Boolean.valueOf(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (r6 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public List<com.impex.mahalaxmicalendar.domain.Reminder> getReminder(String r5, String r6) {
        /*
            r4 = this;
            com.impex.mahalaxmicalendar.database.Helper r0 = r4.helper
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Select GROUP_CONCAT(festival_name) AS festival_name,date,day,time,music_path from reminder where time = '"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "' and "
            r2.append(r6)
            java.lang.String r6 = "date"
            r2.append(r6)
            java.lang.String r6 = " = '"
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = "'"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6 = 0
            android.database.Cursor r5 = r0.rawQuery(r5, r6)
        L_0x0038:
            boolean r0 = r5.moveToNext()     // Catch:{ Throwable -> 0x0096 }
            if (r0 == 0) goto L_0x008e
            com.impex.mahalaxmicalendar.domain.Reminder r0 = new com.impex.mahalaxmicalendar.domain.Reminder     // Catch:{ Throwable -> 0x0096 }
            r0.<init>()     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = "festival_name"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0096 }
            r0.setFestivalName(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = "date"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0096 }
            r0.setDate(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = "day"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0096 }
            r0.setDay(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = "time"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0096 }
            r0.setTime(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = "music_path"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ Throwable -> 0x0096 }
            r0.setMusic(r2)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r2 = r0.getFestivalName()     // Catch:{ Throwable -> 0x0096 }
            if (r2 == 0) goto L_0x0038
            r1.add(r0)     // Catch:{ Throwable -> 0x0096 }
            goto L_0x0038
        L_0x008e:
            if (r5 == 0) goto L_0x0093
            r5.close()
        L_0x0093:
            return r1
        L_0x0094:
            r0 = move-exception
            goto L_0x0098
        L_0x0096:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0094 }
        L_0x0098:
            if (r5 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a0
            r5.close()     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x00a3
        L_0x00a0:
            r5.close()
        L_0x00a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impex.mahalaxmicalendar.database.repository.RepoImplReminder.getReminder(java.lang.String, java.lang.String):java.util.List");
    }

    public void saveDainikReminderData(Reminder reminder) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", reminder.getTime());
        contentValues.put("festival_name", reminder.getFestivalName());
        contentValues.put("date", reminder.getDate());
        contentValues.put(TableReminder.COL_MUSIC_PATH, reminder.getMusic());
        writableDatabase.insert("reminder", null, contentValues);
    }

    public int updateReminderStatus(String str, String str2) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_fired", Integer.valueOf(1));
        return writableDatabase.update("reminder", contentValues, "date = ? and time = ?", new String[]{str, str2});
    }
}
