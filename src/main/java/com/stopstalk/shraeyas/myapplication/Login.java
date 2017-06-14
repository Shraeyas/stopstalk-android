package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewStub;
import android.widget.RelativeLayout;

/**
 * Created by Shraeyas on 14-06-2017.
 */

public class Login extends AppCompatActivity
{
    public Login(Activity activity)
    {
        RelativeLayout relativeLayout = (RelativeLayout)activity.findViewById(R.id.content_main);
        relativeLayout.removeAllViews();

        ViewStub stub = new ViewStub(activity);

        relativeLayout.addView(stub);
        stub.setLayoutResource(R.layout.login);
        stub.inflate();
    }
}
