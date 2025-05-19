package com.example.havadurumuuygulamasi.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.havadurumuuygulamasi.Adapters.FutureAdapter;
import com.example.havadurumuuygulamasi.Domains.FuturesDomain;
import com.example.havadurumuuygulamasi.R;

import java.util.ArrayList;

public class FuturesActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTomorrow ;
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_futures);

        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FuturesActivity.this,MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<FuturesDomain> items = new ArrayList<>();

        items.add(new FuturesDomain("Pazartesi",10,25,"storm","Soğuk"));
        items.add(new FuturesDomain("Salı",10,25,"cloudy","Bulutlu"));
        items.add(new FuturesDomain("Çarşamba",10,25,"windy","Karlı"));
        items.add(new FuturesDomain("Perşembe",10,25,"Cloudy_sunny","Bulutlu_güneşli"));
        items.add(new FuturesDomain("Cuma",10,25,"Sunny","güneşli"));
        items.add(new FuturesDomain("Cumartesi",10,25,"Rainy","Yağmurlu"));

        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapterTomorrow=new FutureAdapter(items);
        recyclerView.setAdapter(adapterTomorrow);
    }
}