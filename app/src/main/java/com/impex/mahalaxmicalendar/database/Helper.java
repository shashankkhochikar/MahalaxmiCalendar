package com.impex.mahalaxmicalendar.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.impex.mahalaxmicalendar.database.Database.TableAmavasyaPurnima;
import com.impex.mahalaxmicalendar.database.Database.TableCollectiveDataSheet;
import com.impex.mahalaxmicalendar.database.Database.TableDurgashtmi;
import com.impex.mahalaxmicalendar.database.Database.TableEkadashi;
import com.impex.mahalaxmicalendar.database.Database.TableMonthDetails;
import com.impex.mahalaxmicalendar.database.Database.TableMuhurtas;
import com.impex.mahalaxmicalendar.database.Database.TableNotes;
import com.impex.mahalaxmicalendar.database.Database.TableNotification;
import com.impex.mahalaxmicalendar.database.Database.TablePanchang;
import com.impex.mahalaxmicalendar.database.Database.TableRashibhavishya;
import com.impex.mahalaxmicalendar.database.Database.TableReminder;
import com.impex.mahalaxmicalendar.database.Database.TableSankashti;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper extends SQLiteOpenHelper {
    private static Helper helperInstance;
    private Context context;
    public String TAG = Helper.class.getName();

    public Helper(Context context2) {
        super(context2, Database.DB_NAME, null, Database.DB_VERSION.intValue());
        this.context = context2;
    }

    public static synchronized Helper getInstance(Context context2) {
        Helper helper;
        synchronized (Helper.class) {
            if (helperInstance == null) {
                helperInstance = new Helper(context2.getApplicationContext());
            }
            helper = helperInstance;
        }
        return helper;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(TableCollectiveDataSheet.createTable());
        sQLiteDatabase.execSQL(TableMonthDetails.createTable());
       /* sQLiteDatabase.execSQL(TablePanchang.createTable());
        sQLiteDatabase.execSQL(TableRashibhavishya.createTable());
        sQLiteDatabase.execSQL(TableSankashti.createTable());
        sQLiteDatabase.execSQL(TableMuhurtas.createTable());
        sQLiteDatabase.execSQL(TableNotification.createTable());
        sQLiteDatabase.execSQL(TableReminder.createTable());
        sQLiteDatabase.execSQL(TableEkadashi.createTable());
        sQLiteDatabase.execSQL(TableDurgashtmi.createTable());
        sQLiteDatabase.execSQL(TableAmavasyaPurnima.createTable());
        sQLiteDatabase.execSQL(TableNotes.createTable());*/
        try {
            insertData(sQLiteDatabase, "collective_data.sql");
            insertData(sQLiteDatabase, "month_details.sql");
            /*insertData(sQLiteDatabase, "punchang_data.sql");
            insertData(sQLiteDatabase, "notification.sql");
            insertData(sQLiteDatabase, "ekadashi_data.sql");
            insertData(sQLiteDatabase, "durgashtami.sql");
            insertData(sQLiteDatabase, "amavasya_purnima_data.sql");*/
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());


        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("delete from collective_data_sheet");
        sQLiteDatabase.execSQL("delete from month_details");
        /*sQLiteDatabase.execSQL("delete from panchang");
        sQLiteDatabase.execSQL("delete from rashibhavishya");
        sQLiteDatabase.execSQL("delete from sankashti");
        sQLiteDatabase.execSQL("delete from muhurtas");
        sQLiteDatabase.execSQL("delete from notification");
        sQLiteDatabase.execSQL("delete from reminder");
        sQLiteDatabase.execSQL("delete from ekadashi");
        sQLiteDatabase.execSQL("delete from durgashtami");
        sQLiteDatabase.execSQL("delete from amavasyaPurnima");*/
        try {
            insertData(sQLiteDatabase, "collective_data.sql");
            insertData(sQLiteDatabase, "month_details.sql");
            /*insertData(sQLiteDatabase, "punchang_data.sql");
            insertData(sQLiteDatabase, "notification.sql");
            insertData(sQLiteDatabase, "ekadashi_data.sql");
            insertData(sQLiteDatabase, "durgashtami.sql");
            insertData(sQLiteDatabase, "amavasya_purnima_data.sql");*/
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
        }
        sQLiteDatabase.execSQL(TableNotes.createTable());
    }

    private void insertData(SQLiteDatabase sQLiteDatabase, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.context.getAssets().open(str)));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sQLiteDatabase.execSQL(readLine);
            } else {
                return;
            }
        }
    }
}
