package com.example.frasesparavoce;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DALfrase {

  private Context context;
  private FirebaseDatabase database;
  private DatabaseReference ref;
  public List<Frase> frases;

  public DALfrase(Context context){
    frases = new ArrayList<Frase>();
    this.context = context;
    this.iniciarBanco();
    this.lerDados();
  }

  public void criarFrase(Frase frase){
    frase.setId(UUID.randomUUID().toString());
    ref.child("frases").child(frase.getId()).setValue(frase);
  }

  public void alterarFrase(Frase frase){
    ref.child("frases").child(frase.getId()).setValue(frase);
  }

  public void deletarFrase(Frase frase){
    ref.child("frases").child(frase.getId()).removeValue();
  }

  public void lerDados() {
    ref.child("frases").addValueEventListener(new ValueEventListener() {
      @Override
      public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        frases.clear();
        for(DataSnapshot objSnapshot:dataSnapshot.getChildren()){
          Frase s = objSnapshot.getValue(Frase.class);
          frases.add(s);
        }
      }

      @Override
      public void onCancelled(@NonNull DatabaseError databaseError) {

      }
    });
  }


  public void iniciarBanco(){
    FirebaseApp.initializeApp(this.context);
    database = FirebaseDatabase.getInstance();
    database.setPersistenceEnabled(true);
    ref = database.getReference();
  }
}
