package com.example.frasesparavoce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.UUID;

public class CURDFrasesActivity<fraseListener> extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;

    RecyclerViewAdapter adapter;

    EditText etTexto;
    EditText etAutor;
    Spinner spCategoria;
    String counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);

        iniciariViews();
        startBanco();

        RecyclerView recyclerView = findViewById(R.id.rcFrasesRecycler);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        
        lerDados();
    }

    private void lerDados() {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Frase fraseItem;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void startBanco(){
        FirebaseApp.initializeApp(CURDFrasesActivity.this);
        database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);
        reference = database.getReference();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.menu_new){
            startBanco();
            String fraseNome  = etTexto.getText().toString();
            String autorNome = etAutor.getText().toString();
            String categoriaNome = (String)spCategoria.getSelectedItem();
            Frase frase = new Frase(fraseNome, autorNome, categoriaNome, counter);
            reference.child("frases").child(frase.getId()).setValue(frase);

            iniciariViews();
        }

        if(id == R.id.menu_update){
            Toast.makeText(this, "Update", Toast.LENGTH_LONG).show();
        }

        if(id == R.id.menu_delete){
            Toast.makeText(this, "Delete", Toast.LENGTH_LONG).show();
        }

        if(id == R.id.menu_search){
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
        }

        return true;
    }

    private void iniciariViews(){
        etAutor = findViewById(R.id.etAutor);
        etTexto = findViewById(R.id.etTexto);
        spCategoria = findViewById(R.id.spCategoria);
        counter = UUID.randomUUID().toString();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.categoria_dados, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapter);

        etAutor.setText("");
        etTexto.setText("");
    }

}
