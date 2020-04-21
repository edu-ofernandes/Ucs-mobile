package com.example.meuqueridoprof.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.meuqueridoprof.R;
import com.example.meuqueridoprof.config.ConfigFirebase;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

  private FirebaseAuth auth;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    auth = ConfigFirebase.getFirebaseAuth();

  }

  public void logOut(View view){
    auth.signOut();
    finish();
  }
}
