package com.example.test;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.england, "England"));
        arr_bean.add(new ListViewBean(R.drawable.usa, "American"));
        arr_bean.add(new ListViewBean(R.drawable.vietnam,"Vietnamese"));
        arr_bean.add(new ListViewBean(R.drawable.phap, "French"));
        arr_bean.add(new ListViewBean(R.drawable.china, "Chinese"));
        arr_bean.add(new ListViewBean(R.drawable.italya, "Italya"));
        arr_bean.add(new ListViewBean(R.drawable.duc, "Germany"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);



    }
}