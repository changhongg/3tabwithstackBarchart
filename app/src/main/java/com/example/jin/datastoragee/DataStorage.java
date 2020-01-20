package com.example.jin.datastoragee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class DataStorage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        setupTabs();

        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(8f, 0));
        entries.add(new BarEntry(2f, 1));
        entries.add(new BarEntry(5f, 2));
        entries.add(new BarEntry(20f, 3));
        entries.add(new BarEntry(15f, 4));
        entries.add(new BarEntry(19f, 5));


        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("June");


        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of labels into chart
        barChart.setDescription("Add your Desccription here");  // set the description
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);



       // super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_data_storage);
        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
        ArrayList value = new ArrayList();

        value.add(new Entry(45f, 0));
        value.add(new Entry(10f, 1));
        value.add(new Entry(33f, 2));
        value.add(new Entry(24f, 3));
        value.add(new Entry(69f, 4));
        value.add(new Entry(14f, 5));
        value.add(new Entry(50f, 6));

        PieDataSet dataSet = new PieDataSet(value, "Earn");


        ArrayList month = new ArrayList();

        month.add("Jan");
        month.add("Feb");
        month.add("Mar");
        month.add("Apr");
        month.add("May");
        month.add("Jun");
        month.add("Jul");

        PieData data1 = new PieData(month, dataSet);
        dataSet.setValueTextSize(15);
        pieChart.setData(data1);
        pieChart.setDescription("Pie Chart");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateXY(2000, 2000);


        }




    private void setupTabs(){

        TabHost tabs =(TabHost) this.findViewById(R.id.DStabhost);
        tabs.setup();


        //Tab #1 SharedPreferences Example
        TabHost.TabSpec ts1 = tabs.newTabSpec("Chart");
        ts1.setIndicator("Chart");
        ts1.setContent(R.id.content1);
        tabs.addTab(ts1);

        //Tab #2 SQLiteDatabase Example
        TabHost.TabSpec ts2 = tabs.newTabSpec("Test");
        ts2.setIndicator("Test");
        ts2.setContent(R.id.content2);
        tabs.addTab(ts2);


    }
}
