package com.android.healthcare;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.healthcare.Adapter.HospitalsAdapter;

import java.util.ArrayList;

public class Hospitals extends AppCompatActivity {
    private ArrayList<Integer> test;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospitals_screen);

        recyclerView=findViewById(R.id.hospitalRecyclerView);
        test=new ArrayList<>(14);


        HospitalsAdapter adapter=new HospitalsAdapter(test);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
