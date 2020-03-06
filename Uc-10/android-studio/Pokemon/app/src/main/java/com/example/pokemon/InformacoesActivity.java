package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformacoesActivity extends AppCompatActivity {

  ImageView ivInfoFoto;
  TextView tvInfoNome, tvInfoDescricao;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_informacoes);

    ivInfoFoto = findViewById(R.id.ivInfoFoto);
    tvInfoNome = findViewById(R.id.tvInfoNome);
    tvInfoDescricao = findViewById(R.id.tvDescricao);


    String data1 = getIntent().getExtras().getString("nome");
    String data2 = getIntent().getExtras().getString("desc");

    tvInfoNome.setText(data1);
    tvInfoDescricao.setText(data2);
  }





}
