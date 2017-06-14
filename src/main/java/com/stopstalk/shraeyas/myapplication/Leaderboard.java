package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.view.ViewStub;

/**
 * Created by Shraeyas on 14-06-2017.
 */

public class Leaderboard extends AppCompatActivity
{
    ScreenResources res = new ScreenResources();

    public Leaderboard(Activity activity)
    {
        RelativeLayout relativeLayout = (RelativeLayout)activity.findViewById(R.id.content_main);
        relativeLayout.removeAllViews();

        ViewStub stub = new ViewStub(activity);

        relativeLayout.addView(stub);
        stub.setLayoutResource(R.layout.leaderboard);
        stub.inflate();

        TableLayout tableLayout = (TableLayout)activity.findViewById(R.id.tableLayout);
        TextView tv;
        TableRow tableRow;

        header(tableLayout, activity);


        for(int i=0;i<10;i++)
        {
            tableRow = new TableRow(activity);
            tv = new TextView(activity);
            tv.setText("\n");
            tableRow.addView(tv);
            tableLayout.addView(tableRow);

            tableRow = new TableRow(activity);

            tv = new TextView(activity);
            tv.setText("   " + String.valueOf(i+1));
            tableRow.addView(tv);



            tv = new TextView(activity);
            tv.setText("Shreyas Singh\n\n@Shraeyas");
            tableRow.addView(tv);


            tv = new TextView(activity);
            tv.setText("India");
            tableRow.addView(tv);


            tv = new TextView(activity);
            tv.setText("IET Lucknow");
            tableRow.addView(tv);


            tv = new TextView(activity);

            String text = "<font>14326</font><br><font color='green'>+945</font><br><font color='red'>-32</font>";

            tv.setText(Html.fromHtml(text));
            tableRow.addView(tv);


            tableLayout.addView(tableRow);
        }
    }

    public  void header(TableLayout tableLayout, Activity activity)
    {
        TableRow tableRow = new TableRow(activity);
        TextView tv = new TextView(activity);

        tableRow = new TableRow(activity);

        tv = new TextView(activity);
        tv.setText("\n\n   #");
        tv.setWidth(res.pxtodp(60));

        tableRow.addView(tv);

        tv = new TextView(activity);
        tv.setText("\n\nName\nHandle");
        tv.setWidth(res.pxtodp(200));
        tableRow.addView(tv);


        tv = new TextView(activity);
        tv.setText("\n\nCountry");
        tv.setWidth(res.pxtodp(150));
        tableRow.addView(tv);


        tv = new TextView(activity);
        tv.setText("\n\nInstitute");
        tv.setWidth(res.pxtodp(230));
        tableRow.addView(tv);


        tv = new TextView(activity);
        tv.setText("\nRating\nChanges\nPer Day\n");
        tv.setWidth(res.pxtodp(200));
        tableRow.addView(tv);

        tableRow.setBackgroundColor(Color.LTGRAY);


        tableLayout.addView(tableRow);


    }
}
