package com.example.sangameswaran.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Sangameswaran on 04-05-2017.
 */

public class Adapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    Adapter(Context context)
    {
        this.context=context;
    }
    int layout[]={R.layout.registration_layout_1,R.layout.registration_layout_2,R.layout.registration_layout_3};
    @Override
    public int getCount() {
        return layout.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=layoutInflater.inflate(layout[position],container,false);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
