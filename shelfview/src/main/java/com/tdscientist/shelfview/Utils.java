package com.tdscientist.shelfview;

import android.content.Context;

/**
 * Copyright (c) 2017 Adediji Adeyinka(tdscientist)
 * All rights reserved
 * Created on 11-Feb-2017
 */

public class Utils {

    Context mContext;

    public Utils(Context mContext) {
        this.mContext = mContext;
    }

    public int dpToPixels(int dp) {
        float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    public int pixelsToDp(int pixels) {
        float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (pixels / scale + 0.5f);
    }

}
