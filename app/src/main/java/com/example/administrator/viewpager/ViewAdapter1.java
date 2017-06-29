package com.example.administrator.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Administrator on 2017/6/29.
 */

public class ViewAdapter1 extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
