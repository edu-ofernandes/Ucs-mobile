package com.example.frasesparavoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CURDFrasesActivity extends AppCompatActivity {

    EditText etTexto;
    EditText etAutor;
    Spinner spCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);
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
            Toast.makeText(this, "Create", Toast.LENGTH_LONG).show();
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

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categorias_dados, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapter);
    }
}
