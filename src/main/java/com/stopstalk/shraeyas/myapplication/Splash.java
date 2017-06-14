package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.view.Menu;
import android.view.ViewStub;
import android.widget.RelativeLayout;

/**
 * Created by Shraeyas on 14-06-2017.
 */

public class Splash extends AppCompatActivity
{
    public Splash(Activity activity)
    {
        RelativeLayout relativeLayout = (RelativeLayout)activity.findViewById(R.id.content_main);
        relativeLayout.removeAllViews();

        ViewStub stub = new ViewStub(activity);

        relativeLayout.addView(stub);
        stub.setLayoutResource(R.layout.splash);
        stub.inflate();

    }
}
