package com.android.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.healthcare.Adapter.HospitalsAdapter;

import java.util.ArrayList;

public class BloodBanks extends AppCompatActivity {

    ArrayList<Integer> test;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bloodbanks_screen);

        recyclerView=findViewById(R.id.bloodBanksRecyclerView);
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


        HospitalsAdapter adapter=new HospitalsAdapter(test);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}