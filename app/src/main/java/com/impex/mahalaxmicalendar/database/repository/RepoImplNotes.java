package com.impex.mahalaxmicalendar.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.impex.mahalaxmicalendar.database.Database.TableNotes;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.domain.Notes;

public class RepoImplNotes implements RepoNotes {
    private Helper helper;

    public RepoImplNotes(Helper helper2) {
        this.helper = helper2;
    }

    public void saveNotes(Notes notes) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("date", notes.getDate());
        contentValues.put(TableNotes.COL_NOTE_MESSAGE, notes.getNotesMsg());
        writableDatabase.insert(TableNotes.TABLE_NAME, null, contentValues);
    }

    public void updateNotes(Notes notes) {
        SQLiteDatabase writableDatabase = this.helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TableNotes.COL_NOTE_MESSAGE, notes.getNotesMsg());
        writableDatabase.update(TableNotes.TABLE_NAME, contentValues, "date = ? ", new String[]{notes.getDate()});
    }

    public String getNoteMsg(String str) {
        Throwable th;
        SQLiteDatabase readableDatabase = this.helper.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("select note_msg from notes where date = '");
        sb.append(str);
        sb.append("'");
        String sb2 = sb.toString();
        String str2 = "";
        Cursor rawQuery = readableDatabase.rawQuery(sb2, null);
        while (rawQuery.moveToNext()) {
            try {
                str2 = rawQuery.getString(rawQuery.getColumnIndex(TableNotes.COL_NOTE_MESSAGE));
            } catch (Throwable unused) {
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return str2;
        //throw th;
    }
}
