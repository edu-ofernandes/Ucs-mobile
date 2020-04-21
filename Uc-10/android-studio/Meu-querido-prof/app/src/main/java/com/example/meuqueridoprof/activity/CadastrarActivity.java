package com.example.meuqueridoprof.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.meuqueridoprof.R;
import com.example.meuqueridoprof.config.ConfigFirebase;
import com.example.meuqueridoprof.helper.Base64custom;
import com.example.meuqueridoprof.model.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

import static android.widget.Toast.LENGTH_LONG;

public class CadastrarActivity extends AppCompatActivity {

  private Button btnCadastrar;
  private EditText etNome, etEmail, etSenha;
  private FirebaseAuth auth;
  private Usuario usuario;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cadastrar);

    etEmail = findViewById(R.id.etEmail);
    etNome = findViewById(R.id.etNome);
    etSenha = findViewById(R.id.etSenha);
  }

  public void irParaLogar(View view){
    Intent intent = new Intent(CadastrarActivity.this, LoginActivity.class);
    startActivity(intent);
  }

  public void cadastraUsuario(View view){
    String nome = etNome.getText().toString();
    String email = etEmail.getText().toString();
    String senha = etSenha.getText().toString();

    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
      Toast.makeText(CadastrarActivity.this, "Insira todos os campos!", LENGTH_LONG).show();
      limparCampos();
    }else {

      usuario = new Usuario();
      usuario.setNome(nome);
      usuario.setEmail(email);
      usuario.setSenha(senha);

      auth = ConfigFirebase.getFirebaseAuth();
      auth.createUserWithEmailAndPassword(usuario.getEmail(), usuario.getSenha())
        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
          @Override
          public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
              //exibir msg/log de sucesso etc etc
              Toast.makeText(CadastrarActivity.this, "Cadastro com sucesso!", LENGTH_LONG).show();

              limparCampos();

              try {
                String idUsuario = Base64custom.codificarBase64(usuario.getEmail());

                usuario.setId(idUsuario);
                usuario.salvar();
              } catch (Exception e) {

              }
              finish();
            } else {
              String excecao = "";
              try {
                throw task.getException();
              } catch (FirebaseAuthWeakPasswordException e) {
                excecao = "Digite uma senha mais forte!";
              } catch (FirebaseAuthInvalidCredentialsException e) {
                excecao = "Por favor digite dados válidos!";
              } catch (FirebaseAuthUserCollisionException e) {
                excecao = "Essa conta ja foi cadastrada!";
              } catch (Exception e) {
                excecao = "Erro ao cadastrar" + e.getMessage();
                e.printStackTrace();
              }

              Toast.makeText(CadastrarActivity.this, excecao, LENGTH_LONG).show();
            }
          }
        });
    }
  }

  public void limparCampos(){
    etEmail.setText("");
    etNome.setText("");
    etSenha.setText("");
  }
}
