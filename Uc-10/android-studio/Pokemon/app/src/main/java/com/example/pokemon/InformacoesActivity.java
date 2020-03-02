package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformacoesActivity extends AppCompatActivity {

  ImageView ivInfoFoto;
  TextView tvInfoNome, tvInfoDescricao;

  String infoNome, infoDescricao;
  int infoFoto;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_informacoes);

    ivInfoFoto = findViewById(R.id.ivInfoFoto);
    tvInfoNome = findViewById(R.id.tvInfoNome);
    tvInfoDescricao = findViewById(R.id.tvDescricao);

//    getDado();
//    setDado();
  }

  private void getDado(){
    if (getIntent().hasExtra("nome") && getIntent().hasExtra("desc")) {

      this.infoNome = getIntent().getParcelableExtra("nome");
      this.infoDescricao = getIntent().getParcelableExtra("desc");

    }
  }

  private void setDado(){
    tvInfoNome.setText(infoNome);
    tvInfoDescricao.setText(infoDescricao);
  }
}
