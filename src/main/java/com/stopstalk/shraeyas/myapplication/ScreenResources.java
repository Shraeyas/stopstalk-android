package com.stopstalk.shraeyas.myapplication;

/**
 * Created by Shraeyas on 14-06-2017.
 */

import android.content.res.Resources;


public class ScreenResources
{

    public static int pxtodp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

}
