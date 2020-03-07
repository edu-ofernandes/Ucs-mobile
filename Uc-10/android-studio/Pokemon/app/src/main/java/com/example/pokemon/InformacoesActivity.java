package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformacoesActivity extends AppCompatActivity {

  ImageView ivInfoFoto;
  TextView tvInfoNome;
  TextView  tvInfoDescricao;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_informacoes);

    ivInfoFoto = findViewById(R.id.ivInfoFoto);
    tvInfoNome = findViewById(R.id.tvInfoNome);
    tvInfoDescricao = findViewById(R.id.tvInfoDescricao);


    Pokemon pokemonData = getIntent().getExtras().getParcelable("pokemon");

    tvInfoNome.setText(pokemonData.getNome());
    ivInfoFoto.setImageResource(pokemonData.getFoto());
    tvInfoDescricao.setText(pokemonData.getDescricao());
  }





}
