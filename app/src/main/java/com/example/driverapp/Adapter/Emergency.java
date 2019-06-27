package com.example.driverapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.driverapp.Model.ModelClass;
import com.example.driverapp.R;

import java.util.List;

public class Emergency extends RecyclerView.Adapter<ModelClass.MyViewHolder> {
    private List<ModelClass> dataSet;
    Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView patient_name, patient_location;



        public MyViewHolder(View itemView) {
            super(itemView);
            this.patient_name = itemView.findViewById(R.id.patient_name);
            this.patient_location = itemView.findViewById(R.id.patient_location);


        }


    }

    public Emergency(List<ModelClass> data, Context context) {
        this.dataSet = data;
        this.context = context;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pending_list_item, parent, false);
        Emergency.MyViewHolder myViewHolder = new Emergency.MyViewHolder(view);
        return myViewHolder;
    }





    @Override
    public void onBindViewHolder(final Emergency.MyViewHolder holder, final int listPosition) {
        final ModelClass modelClass= dataSet.get(listPosition);
        TextView patient_name = holder.patient_name;
        TextView patient_location = holder.patient_location;



        patient_name.setText(modelClass.getPatientName());
        patient_location.setText(modelClass.getLocation());


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
