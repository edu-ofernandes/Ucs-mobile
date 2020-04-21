package com.example.meuqueridoprof.model;

import com.example.meuqueridoprof.config.ConfigFirebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Usuario implements Serializable {
  private String id;
  private String nome;
  private String email;
  private String senha;

  public Usuario() {
  }

  public void salvar(){
    DatabaseReference firebaseref = ConfigFirebase.getFirebaseReference();
    DatabaseReference usuarioRef = firebaseref.child("usuarios")
            .child(getId());
    usuarioRef.setValue(this);
  }

  @Exclude
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Exclude
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
