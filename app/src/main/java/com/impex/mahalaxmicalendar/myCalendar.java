package com.impex.mahalaxmicalendar;

import android.app.Application;
import android.util.Log;

import com.impex.mahalaxmicalendar.database.Helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class myCalendar extends Application {
    private static final String TAG = myCalendar.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String dateString = dateFormat.format(calendar.getTime());
        Log.d(TAG, "App Installed Date String :" + dateString);


    }

    /*public final Helper getDbHelper() {
        return Helper.getInstance(this);
    }*/
}
