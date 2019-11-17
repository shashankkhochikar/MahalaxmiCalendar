package com.impex.mahalaxmicalendar.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.impex.mahalaxmicalendar.R;
import com.impex.mahalaxmicalendar.database.Helper;
import com.impex.mahalaxmicalendar.myCalendar;

public class DashboardActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private LinearLayout mDashboardTitle;
    private LinearLayout mOurCalenderLinear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        assignViews();setListners();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
        mDashboardTitle = (LinearLayout) findViewById(R.id.dashboardTitle);
        mOurCalenderLinear = (LinearLayout) findViewById(R.id.ourCalenderLinear);
    }
    private void setListners(){
        mOurCalenderLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,ourCalenderActivity.class));
            }
        });
    }

}
