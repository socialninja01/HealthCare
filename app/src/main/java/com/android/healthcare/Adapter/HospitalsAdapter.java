package com.android.healthcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.healthcare.R;

import java.util.ArrayList;

public class HospitalsAdapter extends RecyclerView.Adapter<HospitalsAdapter.ViewHolder> {

    private ArrayList<Integer> test;

    public HospitalsAdapter(ArrayList<Integer> test){
        this.test=test;
    }

    @NonNull
    @Override
    public HospitalsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.hospital_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalsAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return test.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
