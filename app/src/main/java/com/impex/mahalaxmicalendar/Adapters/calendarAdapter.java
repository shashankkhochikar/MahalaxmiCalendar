package com.impex.mahalaxmicalendar.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.impex.mahalaxmicalendar.R;

/**
 * Created by shashank on 11/17/2019.
 */

public class calendarAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] mThumbIds ;

    public calendarAdapter(Context c,Integer[] integers){
        mContext = c;
        this.mThumbIds = integers;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        if(mThumbIds[position] == 111 || mThumbIds[position] == 222 ||
            mThumbIds[position] == 333 || mThumbIds[position] == 444 ||
            mThumbIds[position] == 555 || mThumbIds[position] == 666 ||  mThumbIds[position] == 777)
        {
            imageView.setImageResource(getDayImagesFromRow(mThumbIds[position]));
        }else{
            imageView.setImageResource(getDayImage(mThumbIds[position]));
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
        return imageView;
    }

    public int getDayImage(int i) {
        int i2 = i == 1 ? R.drawable.one : 0;
        if (i == 2) {
            i2 = R.drawable.two;
        }
        if (i == 3) {
            i2 = R.drawable.three;
        }
        if (i == 4) {
            i2 = R.drawable.four;
        }
        if (i == 5) {
            i2 = R.drawable.five;
        }
        if (i == 6) {
            i2 = R.drawable.six;
        }
        if (i == 7) {
            i2 = R.drawable.seven;
        }
        if (i == 8) {
            i2 = R.drawable.eight;
        }
        if (i == 9) {
            i2 = R.drawable.nine;
        }
        if (i == 10) {
            i2 = R.drawable.ten;
        }
        if (i == 11) {
            i2 = R.drawable.eleven;
        }
        if (i == 12) {
            i2 = R.drawable.twelve;
        }
        if (i == 13) {
            i2 = R.drawable.thirteen;
        }
        if (i == 14) {
            i2 = R.drawable.fourteen;
        }
        if (i == 15) {
            i2 = R.drawable.fifteen;
        }
        if (i == 16) {
            i2 = R.drawable.sixteen;
        }
        if (i == 17) {
            i2 = R.drawable.seventeen;
        }
        if (i == 18) {
            i2 = R.drawable.eighteen;
        }
        if (i == 19) {
            i2 = R.drawable.nineteen;
        }
        if (i == 20) {
            i2 = R.drawable.twenty;
        }
        if (i == 21) {
            i2 = R.drawable.twenty_one;
        }
        if (i == 22) {
            i2 = R.drawable.twenty_two;
        }
        if (i == 23) {
            i2 = R.drawable.twenty_three;
        }
        if (i == 24) {
            i2 = R.drawable.twenty_four;
        }
        if (i == 25) {
            i2 = R.drawable.twenty_five;
        }
        if (i == 26) {
            i2 = R.drawable.twenty_six;
        }
        if (i == 27) {
            i2 = R.drawable.twenty_seven;
        }
        if (i == 28) {
            i2 = R.drawable.twenty_eight;
        }
        if (i == 29) {
            i2 = R.drawable.twenty_nine;
        }
        if (i == 30) {
            i2 = R.drawable.thirty;
        }
        return i == 31 ? R.drawable.thirty_one : i2;
    }

    public int getDayImagesFromRow(int i) {
        Integer valueOf = i == 111 ? Integer.valueOf(R.drawable.sunday_new) : null;
        if (i == 222) {
            valueOf = Integer.valueOf(R.drawable.monday_new);
        }
        if (i == 333) {
            valueOf = Integer.valueOf(R.drawable.tuesday_new);
        }
        if (i == 444) {
            valueOf = Integer.valueOf(R.drawable.wednesday_new);
        }
        if (i == 555) {
            valueOf = Integer.valueOf(R.drawable.thursday_new);
        }
        if (i == 666) {
            valueOf = Integer.valueOf(R.drawable.friday_new);
        }
        if (i == 777) {
            valueOf = Integer.valueOf(R.drawable.saturday_new);
        }
        return valueOf.intValue();
    }
}
