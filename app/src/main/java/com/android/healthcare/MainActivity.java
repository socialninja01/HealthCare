package com.android.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.healthcare.Adapter.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> test;
    private RecyclerView recyclerView,recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        recyclerView=findViewById(R.id.menu_doc_rv);
        recyclerView2=findViewById(R.id.menu_hospital_rv);
        test=new ArrayList<>(14);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);
        test.add(0);


        Adapter adapter=new Adapter(test);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        Adapter adapter1=new Adapter(test);
        RecyclerView.LayoutManager layoutManager1=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView2.setLayoutManager(layoutManager1);
        recyclerView2.setAdapter(adapter1);


    }
}