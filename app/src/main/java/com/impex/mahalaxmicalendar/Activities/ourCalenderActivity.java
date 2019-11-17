package com.impex.mahalaxmicalendar.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.impex.mahalaxmicalendar.Adapters.calendarAdapter;
import com.impex.mahalaxmicalendar.R;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.database.repository.RepoImplCollectiveDataSheet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ourCalenderActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RelativeLayout mRelativeLayoutMonthName;
    private ImageView mImageViewBackward;
    private RelativeLayout mRelativeLayoutTextViewMonthName;
    private TextView mTextViewMonthName;
    private ImageView mImageViewForward;
    private GridView  mCalendarLayout;
    private Calendar calendar = Calendar.getInstance();
    public Integer test[];
    public int currentMonth;
    String[] mMonthsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_calender);
        assignViews();setListners();
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.logo_blue2);

        Toast.makeText(ourCalenderActivity.this,""+isDateValid().booleanValue(),Toast.LENGTH_LONG).show();
        //Helper helper = new Helper(this);
        //getDbHelper().getReadableDatabase();

        mMonthsArray = getResources().getStringArray(R.array.arr_months);
        //getCurrent Month
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        currentMonth = c.get(Calendar.MONTH);

        mTextViewMonthName.setText(mMonthsArray[currentMonth]);
        getDatesOfMonth(currentMonth+1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dashboard_menu, menu);
        return true;
    }

    public final Helper getDbHelper() {
        return Helper.getInstance(getApplicationContext());
    }
    private Boolean isDateValid() {
        return new RepoImplCollectiveDataSheet(getDbHelper()).isDateValid(getCurrentDate());
    }
    private String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    private void assignViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRelativeLayoutMonthName = (RelativeLayout) findViewById(R.id.relativeLayoutMonthName);
        mImageViewBackward = (ImageView) findViewById(R.id.imageViewBackward);
        mRelativeLayoutTextViewMonthName = (RelativeLayout) findViewById(R.id.relativeLayoutTextViewMonthName);
        mTextViewMonthName = (TextView) findViewById(R.id.textViewMonthName);
        mImageViewForward = (ImageView) findViewById(R.id.imageViewForward);
        mCalendarLayout = (GridView) findViewById(R.id.calendarLayout);
    }
    private void setListners(){
        mRelativeLayoutTextViewMonthName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builderSingle = new AlertDialog.Builder(ourCalenderActivity.this);
                builderSingle.setTitle("ತಿಂಗಳು ಆಯ್ಕೆಮಾಡಿ");
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ourCalenderActivity.this, android.R.layout.select_dialog_singlechoice,getResources().getStringArray(R.array.arr_months));
                builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String strName = arrayAdapter.getItem(which);
                        Toast.makeText(ourCalenderActivity.this,"Sel :"+strName,Toast.LENGTH_LONG).show();
                        mTextViewMonthName.setText(strName);
                        getDatesOfMonth(which+1);
                    }
                });
                builderSingle.show();
            }
        });
        mImageViewBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentMonth == 0){
                    Toast.makeText(ourCalenderActivity.this,"Wooo Its First Month",Toast.LENGTH_LONG).show();
                }else{
                    currentMonth--;
                    Log.e("111","selemonthId"+currentMonth);
                    mTextViewMonthName.setText(mMonthsArray[currentMonth]);
                    getDatesOfMonth(currentMonth+1);
                }
            }
        });
        mImageViewForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentMonth == 11){
                    Toast.makeText(ourCalenderActivity.this,"Sorry This is last month",Toast.LENGTH_LONG).show();
                }else{
                    currentMonth++;
                    Log.e("111","selemonthId"+currentMonth);
                    mTextViewMonthName.setText(mMonthsArray[currentMonth]);
                    getDatesOfMonth(currentMonth+1);
                }
            }
        });
        //mCalendarLayout
        //getDatesOfMonth(11);
    }

    public void getDatesOfMonth(int monthId){
        int i3;
        int lastDayNum = getLastDayNum(2019, monthId);
        int firstDayNum = getFirstDayNum(2019, monthId);
        Integer[][] numArr = new Integer[7][5];//(Integer[][]) new int[]{7, 5};
        for (int i4 = 0; i4 < numArr.length; i4++) {
            for (int i5 = 0; i5 < numArr[i4].length; i5++) {
                numArr[i4][i5] = Integer.valueOf(0);
            }
        }
        int i6 = firstDayNum - 1;
        int i7 = 0;
        int i8 = 1;
        while (i7 < 5) {
            if (i6 < 7 || i7 > 5) {
                Integer[] numArr2 = numArr[i6];
                if (i8 > lastDayNum) {
                    i3 = i8;
                    i8 = 0;
                } else {
                    i3 = i8 + 1;
                }
                numArr2[i7] = Integer.valueOf(i8);
                i6++;
                i8 = i3;
            } else {
                i7++;
                i6 = 0;
            }
        }
        int i9 = lastDayNum - i8;
        if (i9 == 0 || i9 == 1) {
            int i10 = 0;
            while (i10 <= (lastDayNum - i8) + 1) {
                int i11 = i8 + 1;
                numArr[i10][0] = Integer.valueOf(i8);
                i10++;
                i8 = i11;
            }
        }

        test = new Integer[42];
        int k = 0;

        for (int i4 = 0; i4 < numArr.length; i4++) {
            for (int i5 = 0; i5 < numArr[i4].length; i5++) {
                //test[k]=numArr[i4][i5];
                //k++;
                if(i5 == 0){
                    test[k]=(111*(i4+1));
                    k++;
                    //System.out.print("T"+k);
                    test[k]=numArr[i4][i5];
                    k++;
                }else{
                    test[k]=numArr[i4][i5];
                    k++;
                    //System.out.print("f"+k);
                }
            }
        }

        mCalendarLayout.setAdapter(new calendarAdapter(ourCalenderActivity.this,test));
        //mCalendarLayout.notify();

       /* for (int i5 = 0; i5 < test.length; i5++) {
            //numArr[i4][i5] = Integer.valueOf(0);
            System.out.print(test[i5]+" ");
        }*/
    }
    @SuppressLint("WrongConstant")
    private int getLastDayNum(int i, int i2) {
        this.calendar = Calendar.getInstance();
        this.calendar.set(Calendar.YEAR, i);
        this.calendar.set(Calendar.MONTH, i2 - 1);
        this.calendar.set(5, 1);
        return this.calendar.getActualMaximum(5);
    }

    @SuppressLint("WrongConstant")
    private int getFirstDayNum(int i, int i2) {
        this.calendar = Calendar.getInstance();
        this.calendar.set(Calendar.YEAR, i);
        this.calendar.set(Calendar.MONTH, i2 - 1);
        this.calendar.set(5, 1);
        return this.calendar.get(7);
    }

}
