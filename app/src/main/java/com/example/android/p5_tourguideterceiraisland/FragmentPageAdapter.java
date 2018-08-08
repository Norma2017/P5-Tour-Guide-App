package com.example.android.p5_tourguideterceiraisland;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link FragmentPageAdapter} is a {@link FragmentPageAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Attractions} objects.

 /**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     *  Create a new {@link FragmentPageAdapter} object.
     * @param context is the context of the app.
     * @param  fm is the fragment manager that will keep each fragment's state in the adapter across swipes.
     */

    public FragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem ( int position){
        if (position == 0) {
            return new NatureFragment();
        } else if (position == 1) {
            return new BeachFragment();
        } else if (position == 2) {
            return new GeositesFragment();
        } else {
            return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_nature);
        } else if (position == 1) {
            return mContext.getString(R.string.category_beach);
        } else if (position == 2) {
            return mContext.getString(R.string.category_geosites);
        } else {
            return mContext.getString(R.string.category_food);
        }
    }
}

