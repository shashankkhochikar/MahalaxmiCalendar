package com.impex.mahalaxmicalendar.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.impex.mahalaxmicalendar.R;

public class ourCalenderActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RelativeLayout mRelativeLayoutMonthName;
    private ImageView mImageViewBackward;
    private RelativeLayout mRelativeLayoutTextViewMonthName;
    private TextView mTextViewMonthName;
    private ImageView mImageViewForward;
    private GridLayout mCalendarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_calender);
        assignViews();setListners();
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.logo_blue2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dashboard_menu, menu);
        return true;
    }


    private void assignViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRelativeLayoutMonthName = (RelativeLayout) findViewById(R.id.relativeLayoutMonthName);
        mImageViewBackward = (ImageView) findViewById(R.id.imageViewBackward);
        mRelativeLayoutTextViewMonthName = (RelativeLayout) findViewById(R.id.relativeLayoutTextViewMonthName);
        mTextViewMonthName = (TextView) findViewById(R.id.textViewMonthName);
        mImageViewForward = (ImageView) findViewById(R.id.imageViewForward);
        mCalendarLayout = (GridLayout) findViewById(R.id.calendarLayout);
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
                    }
                });
                builderSingle.show();
            }
        });
    }


}
