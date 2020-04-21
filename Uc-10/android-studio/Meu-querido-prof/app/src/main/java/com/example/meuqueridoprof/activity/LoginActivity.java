package com.example.meuqueridoprof.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.meuqueridoprof.R;
import com.example.meuqueridoprof.config.ConfigFirebase;
import com.example.meuqueridoprof.model.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

import static android.widget.Toast.LENGTH_LONG;

public class LoginActivity extends AppCompatActivity {

  private EditText et_email, et_senha;
  private Button logar;
  private FirebaseAuth auth;
  private Usuario usuario;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    auth = ConfigFirebase.getFirebaseAuth();

    et_email = findViewById(R.id.et_email);
    et_senha = findViewById(R.id.et_senha);
  }

  public void logar(View v){
    String email = et_email.getText().toString();
    String senha = et_senha.getText().toString();

    if (email.isEmpty() || senha.isEmpty()){
      Toast.makeText(LoginActivity.this, "Insira todos os campos!", LENGTH_LONG).show();
      limparCampos();
    }else {
      auth.signInWithEmailAndPassword(email, senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
          if (task.isSuccessful()){
            Toast.makeText(LoginActivity.this, "Bem vindo!", LENGTH_LONG).show();
            abrirTelaInicial();
          }else {
            String excecao = "";
            try {
              throw task.getException();
            } catch (FirebaseAuthInvalidUserException e) {
              excecao = "Usuario não cadastrado!";
            } catch (FirebaseAuthInvalidCredentialsException e) {
              excecao = "Por favor digite dados válidos!";
            }catch (Exception e) {
              excecao = "Erro ao cadastrar" + e.getMessage();
              e.printStackTrace();
            }
            Toast.makeText(LoginActivity.this, excecao, LENGTH_LONG).show();
          }
        }
      });

    }
  }

  public void abriCadastro(View view){
    Intent intent = new Intent(LoginActivity.this, CadastrarActivity.class);
    startActivity(intent);
  }

  public void abrirTelaInicial(){
    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
    startActivity(intent);
  }

  public void limparCampos(){
    et_email.setText("");
    et_senha.setText("");
  }

  @Override
  protected void onStart(){
    super.onStart();

    FirebaseUser userAtual = auth.getCurrentUser();
    if(userAtual != null){
      abrirTelaInicial();
    }

    limparCampos();
  }
}
