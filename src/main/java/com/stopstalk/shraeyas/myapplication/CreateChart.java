package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shraeyas on 12-06-2017.
 */

public class CreateChart extends AppCompatActivity
{
    ScreenResources ob = new ScreenResources();
    public CreateChart(Activity activity)
    {
        PieChart pieChart = (PieChart)activity.findViewById(R.id.pieChart);

        List<PieEntry> pieEntry = new ArrayList<>();

        int value[] = {7, 6, 2, 9, 4};
        String label[] = {"Accepted\n", "WA\n", "TLE\n", "SIGSEGV\n", "Partial\n"};

        for(int i=0;i<5;i++)
        {
            pieEntry.add(new PieEntry(value[i], label[i]));
        }

        PieDataSet dataSet = new PieDataSet(pieEntry, "");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData pieData = new PieData(dataSet);

        pieChart.setDrawSliceText(false);
        pieChart.setData(pieData);
        pieChart.getLegend().setPosition(Legend.LegendPosition.RIGHT_OF_CHART_CENTER);

        Description description = new Description();
        description.setText("Total Submissions");
        description.setPosition(ob.pxtodp(500), ob.pxtodp(150));
        description.setTextSize(ob.pxtodp(70));

        pieChart.setDescription(description);

        pieChart.setUsePercentValues(true);

        pieChart.invalidate();

    }
}
