package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView = findViewById(R.id.recyclyerView);

    String s1[], s2[];
    int images[] = {R.drawable.jan, R.drawable.feb, R.drawable.mar, R.drawable.apr,R.drawable.may,R.drawable.jun};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclyerView);

        s1=getResources().getStringArray(R.array.Calendar);
        s2=getResources().getStringArray(R.array.Description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter((myAdapter));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}