package com.example.havadurumuuygulamasi.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.havadurumuuygulamasi.Adapters.HourlyAdapters;
import com.example.havadurumuuygulamasi.Domains.Hourly;
import com.example.havadurumuuygulamasi.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        setVaribla();
    }

    private void setVaribla() {
        TextView next7daysBtn = findViewById(R.id.nextBtn);
        next7daysBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,FuturesActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<Hourly> items = new ArrayList<>();

        items.add(new Hourly("09:00",28,"cloudy"));
        items.add(new Hourly("11:00",29,"sun"));
        items.add(new Hourly("12:00",30,"wind"));
        items.add(new Hourly("13:00",28,"rain"));
        items.add(new Hourly("13:00",26,"strom"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly=new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
    }
}