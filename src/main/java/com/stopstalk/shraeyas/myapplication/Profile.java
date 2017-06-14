package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Shraeyas on 14-06-2017.
 */

public class Profile extends AppCompatActivity
{
    ScreenResources ob = new ScreenResources();
    public Profile(Activity activity)
    {

        RelativeLayout relativeLayout = (RelativeLayout)activity.findViewById(R.id.content_main);
        relativeLayout.removeAllViews();

        ViewStub stub = new ViewStub(activity);

        relativeLayout.addView(stub);
        stub.setLayoutResource(R.layout.profile);
        stub.inflate();

        TableRow tableRow = new TableRow(activity);

        TextView tv;


        tableRow = (TableRow)activity.findViewById(R.id.dayStreak1);

        tv = new TextView(activity);
        tv.setText("\nCurrent");
        tv.setTextSize(ob.pxtodp(30));
        tv.setWidth(ob.pxtodp(250));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("\nMaximum");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);

        tableRow = (TableRow)activity.findViewById(R.id.dayStreak2);
        tv = new TextView(activity);
        tv.setText("15");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("32");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);





        tableRow = (TableRow)activity.findViewById(R.id.acceptedStreak1);

        tv = new TextView(activity);
        tv.setText("\nCurrent");
        tv.setWidth(ob.pxtodp(300));
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("\nMaximum");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);

        tableRow = (TableRow)activity.findViewById(R.id.acceptedStreak2);
        tv = new TextView(activity);
        tv.setText("15");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("32");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);





        tableRow = (TableRow)activity.findViewById(R.id.problem1);

        tv = new TextView(activity);
        tv.setText("\nSolved");
        tv.setWidth(ob.pxtodp(300));
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("\nTotal");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);

        tableRow = (TableRow)activity.findViewById(R.id.problem2);
        tv = new TextView(activity);
        tv.setText("15");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);
        tv = new TextView(activity);
        tv.setText("32");
        tv.setTextSize(ob.pxtodp(30));
        tableRow.addView(tv);



        CreateChart newChart = new CreateChart(activity);
    }
}
