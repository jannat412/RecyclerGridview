package com.jannat.recyclergridview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jannat Mostafiz on 11/14/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    private ArrayList<DataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewMonth;
        TextView textViewStartDate;
        TextView textViewEndDate;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewMonth = (TextView) itemView.findViewById(R.id.month);
            this.textViewStartDate = (TextView) itemView.findViewById(R.id.startDate);
            this.textViewEndDate = (TextView) itemView.findViewById(R.id.endDate);
        }
    }

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewMonth = holder.textViewMonth;
        TextView textViewStartDate = holder.textViewStartDate;
        TextView textViewEndDate = holder.textViewEndDate;

        textViewMonth.setText(dataSet.get(listPosition).getMonth());
        textViewStartDate.setText(dataSet.get(listPosition).getStartDate());
        textViewEndDate.setText(dataSet.get(listPosition).getEndDate());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
