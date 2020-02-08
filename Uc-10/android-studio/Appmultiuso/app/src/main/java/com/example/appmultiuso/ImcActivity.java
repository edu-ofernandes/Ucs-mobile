package com.example.appmultiuso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImcActivity extends AppCompatActivity {

    Button btImcExecutar;
    TextView altura;
    TextView peso;
    TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        btImcExecutar = findViewById(R.id.btImcExecutar);
        altura = findViewById(R.id.altura);
        peso = findViewById(R.id.peso);
        resposta = findViewById(R.id.resposta);
    }

    public void btImcExecutar(View v){
        double alturaDouble = Double.parseDouble(altura.getText().toString());
        double pesoDouble = Double.parseDouble(peso.getText().toString());

        double imc = pesoDouble / (alturaDouble * alturaDouble);

        resposta.setText(String.valueOf(imc));
    }
}
