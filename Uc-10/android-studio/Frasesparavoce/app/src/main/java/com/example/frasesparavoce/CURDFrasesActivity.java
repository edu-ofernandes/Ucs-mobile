package com.example.frasesparavoce;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;

public class CURDFrasesActivity extends AppCompatActivity {

    private DALfrase daLfrase;
    private MyAdapter myAdapter;
    private RecyclerView rvFraseRecycler;
    private Frase frase;

    private FirebaseAuth mFirebaseAuth; //controlar a autenticação
    private FirebaseAuth.AuthStateListener mAuthStateListener; //listener
    private static final int RC_SIGN_IN = 1;
    private FirebaseUser user;

    private EditText etTexto;
    private EditText etAutor;
    private Spinner spCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);

        etTexto = findViewById(R.id.etTexto);
        etAutor = findViewById(R.id.etAutor);
        spCategoria = findViewById(R.id.spCategoria);

        daLfrase = new DALfrase(getApplicationContext());
        rvFraseRecycler = findViewById(R.id.rvFrasesRecycler);
        rvFraseRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myAdapter = new MyAdapter(getApplicationContext(), daLfrase.frases);
        rvFraseRecycler.setAdapter(myAdapter);
        rvFraseRecycler.addOnItemTouchListener(new RecyclerItemClickListener(
            this,
            rvFraseRecycler,
            new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    frase = daLfrase.frases.get( position );
                    etAutor.setText(frase.getAutor());
                    etTexto.setText(frase.getTexto());
                    spCategoria.setSelection(((ArrayAdapter)spCategoria.getAdapter()).getPosition(frase.getCategoria()));
                }

                @Override
                public void onLongItemClick(View view, int position) {
                    //clique longo
                    //deletar
                }

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            }
        ));
        mFirebaseAuth = FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                user = firebaseAuth.getCurrentUser();
                if (user!=null){
                    Toast.makeText(getApplicationContext(),"Bem Vindo "+user.getDisplayName(),Toast.LENGTH_LONG).show();
                }else{
                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setIsSmartLockEnabled(false)
                                    .setAvailableProviders(Arrays.asList(
                                            new AuthUI.IdpConfig.GoogleBuilder().build(),
                                            new AuthUI.IdpConfig.EmailBuilder().build()))
                                    .build(),
                            RC_SIGN_IN);
                }
            }
        };
        //login


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        String texto = etTexto.getText().toString();
        String autor = etAutor.getText().toString();
        String categoria = spCategoria.getSelectedItem().toString();


        if(texto.equals("") || autor.equals("") || categoria.equals("") ){
            Toast.makeText(this, "inserer um texto ae viado", Toast.LENGTH_LONG).show();
            return false;
        }

        if(id == R.id.menu_new){
            Frase frase = new Frase();
            frase.setTexto(texto);
            frase.setAutor(autor);
            frase.setCategoria(categoria);
            daLfrase.criarFrase(frase);

            iniciariViews();
        }

        if(id == R.id.menu_update){
            Frase frase = new Frase();
            frase.setId(this.frase.getId());
            frase.setTexto(texto);
            frase.setAutor(autor);
            frase.setCategoria(categoria);
            daLfrase.alterarFrase(frase);

            iniciariViews();
//            Toast.makeText(this, "Update", Toast.LENGTH_LONG).show();
        }

        if(id == R.id.menu_delete){
            Frase frase = new Frase();
            frase.setId(this.frase.getId());
            frase.setTexto(texto);
            frase.setAutor(autor);
            frase.setCategoria(categoria);
            daLfrase.deletarFrase(frase);

            iniciariViews();

//            Toast.makeText(this, "Delete", Toast.LENGTH_LONG).show();
        }

        if(id == R.id.menu_search){
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
        }
        myAdapter.notifyDataSetChanged();
        return true;
    }

    private void iniciariViews(){
        etAutor = findViewById(R.id.etAutor);
        etTexto = findViewById(R.id.etTexto);
        spCategoria = findViewById(R.id.spCategoria);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.categoria_dados, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapter);

        etAutor.setText("");
        etTexto.setText("");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

}
