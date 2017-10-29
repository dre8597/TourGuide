package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by demondrelivingston on 10/25/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mcontext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new HistoryFragment();
        } else {
            return new MiscFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
