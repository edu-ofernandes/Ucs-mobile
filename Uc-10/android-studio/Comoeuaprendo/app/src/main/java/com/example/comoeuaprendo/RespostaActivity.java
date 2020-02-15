package com.example.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);
        this.constroiTela();
    }

    public void constroiTela(){
        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        int estiloNome = params.getInt("estliNome");
        String estiloQtd = params.getString("estliloQtd");

        TextView tvResposta = findViewById(R.id.tvResposta2);
        tvResposta.setText("Parabens!! Seu estilo é: "+ estiloNome);
    }
}
