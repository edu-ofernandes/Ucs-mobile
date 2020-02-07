package com.example.qualonumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random Random = new Random();
    int numeroRandom;
    TextView tvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResposta = findViewById(R.id.inputNumero);
        setNumeroRandom();
    }

    public void setNumeroRandom(){
        numeroRandom = Random.nextInt(10);
    }

    public void verificaNumero(View v){
        if (tvResposta.getText().toString().equals("") ){
            Toast.makeText(getApplicationContext(), "Por favor insira um numero", Toast.LENGTH_SHORT).show();
        }else {
            int respostaInt = Integer.parseInt(tvResposta.getText().toString());
            if (numeroRandom == respostaInt){
                Toast.makeText(getApplicationContext(), "Parabens vc acertou", Toast.LENGTH_SHORT).show();
                setNumeroRandom();
                tvResposta.setText("");
            }if ( respostaInt > numeroRandom) {
                Toast.makeText(getApplicationContext(), "Tente outro numero menor", Toast.LENGTH_SHORT).show();
                tvResposta.setText("");
            }if(respostaInt < numeroRandom){
                Toast.makeText(getApplicationContext(), "Tente outro numero maior", Toast.LENGTH_SHORT).show();
                tvResposta.setText("");
            }
        }

    }
}
