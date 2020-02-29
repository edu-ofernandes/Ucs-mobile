package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> arrayPoke;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        criarPokemons();

        RecyclerView recyclerView = findViewById(R.id.rvPoke);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, arrayPoke);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Pokemon> criarPokemons(){
        arrayPoke = new ArrayList<Pokemon>();

        arrayPoke.add(new Pokemon("Bulbasauro", "Bulbasaur pode ser visto cochilando" +
            " sob a luz do sol. Há uma semente nas costas. Ao absorver os raios do sol, a semente" +
            " cresce progressivamente maior.", R.drawable.bulbasauro));

        arrayPoke.add(new Pokemon("Charizard", "Charizard voa pelo céu em busca de" +
            " oponentes poderosos. Respira fogo de tanto calor que derrete qualquer coisa.",
            R.drawable.charizard));

        return arrayPoke;
    }
}
