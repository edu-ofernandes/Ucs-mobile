package com.example.frasesparavoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CURDFrasesActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;

    EditText etTexto;
    EditText etAutor;
    Spinner spCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);

        iniciariViews();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void addFrase(View v){
        String fraseNome  = etTexto.getText().toString();
        String autorNome = etAutor.getText().toString();
        String categoriaNome = "teste";

//        Frase frase = new Frase(fraseNome, autorNome, categoriaNome, "1");
        myRef.child("tarefas").child("nome").setValue(fraseNome);
        myRef.child("tarefas").child("autor").setValue(autorNome);
        myRef.child("tarefas").child("categoria").setValue(categoriaNome);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.menu_new){
            Toast.makeText(this, "Create", Toast.LENGTH_LONG).show();
            myRef.setValue("Hello, World!");
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

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoria_dados, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapter);

    }
}
