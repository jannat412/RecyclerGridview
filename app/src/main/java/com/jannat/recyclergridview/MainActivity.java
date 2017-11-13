package com.jannat.recyclergridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        int numberOfColumns = 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, numberOfColumns);
        //gridLayoutManager.setReverseLayout(true);
        //gridLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        layoutManager.setReverseLayout(true);
//        layoutManager.setStackFromEnd(true);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.month.length; i++) {
            data.add(new DataModel(
                    MyData.month[i],
                    MyData.startDate[i],
                    MyData.endDate[i],
                    MyData.id[i]

            ));
        }
        adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);
    }

}
