package com.example.pokemon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnListenerPoke {

    private ArrayList<Pokemon> arrayPoke;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crierPokemon();

        RecyclerView recyclerView = findViewById(R.id.rvPoke);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, arrayPoke, this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private void crierPokemon(){
        arrayPoke = new ArrayList<Pokemon>();

        arrayPoke.add(new Pokemon("Bulbasauro", "Bulbasaur pode ser visto cochilando" +
            " sob a luz do sol. Há uma semente nas costas.", R.drawable.bulbasauro));

        arrayPoke.add(new Pokemon("Charizard", "Charizard voa pelo céu em busca de" +
            " oponentes poderosos.", R.drawable.charizard));

        arrayPoke.add(new Pokemon("Pikachu", "Whenever Pikachu comes across something" +
            " new, it blasts it with a jolt of electricity.", R.drawable.pikachu));

        arrayPoke.add(new Pokemon("Charmander", "The flame that burns at the tip of" +
            " its tail is an indication of its emotions. The flame wavers when Charmander is" +
            " enjoying itself.", R.drawable.charmander));

        arrayPoke.add(new Pokemon("Charmeleon", "Charmeleon mercilessly destroys its" +
            " foes using its sharp claws.", R.drawable.charmeleon));
    }

    @Override
    public void onClickPoke(int position) {
        Intent intent = new Intent(getApplicationContext(), InformacoesActivity.class);

        //obj tipo parcelable
        intent.putExtra("pokemon", arrayPoke.get(position));
        startActivity(intent);
    }

    ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT){

        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            arrayPoke.remove(viewHolder.getAdapterPosition());
            adapter.notifyDataSetChanged();
        }
    };
}
