package com.example.listadeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter adapter;
    private ArrayList<String> nomes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, comporNomes());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<String> comporNomes(){
        nomes.add("Danilo");
        nomes.add("Nilo");
        nomes.add("Anderson");
        nomes.add("Adolfo");

        return nomes;
    }
}
