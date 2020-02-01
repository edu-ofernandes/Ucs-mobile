package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Dice dado;
    int qtdJogadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dado = new Dice();
        qtdJogadas = 0;
    }

    public void btPlayDice(View v){
        TextView tv = findViewById(R.id.textView3);
        qtdJogadas++;
        tv.setText(String.valueOf(qtdJogadas));
        ImageView img;
        img = (ImageView) findViewById(R.id.imageView2);

        dado.jogarDado();
        int numero = dado.getNumero();
        String texto = String.valueOf(numero);

        switch (numero){
            case 1: img.setImageResource(R.drawable.die1);
                break;
            case 2: img.setImageResource(R.drawable.die2);
                break;
            case 3: img.setImageResource(R.drawable.die3);
                break;
            case 4: img.setImageResource(R.drawable.die4);
                break;
            case 5: img.setImageResource(R.drawable.die5);
                break;
            case 6: img.setImageResource(R.drawable.die6);
                Toast.makeText(getApplicationContext(), "Parabens vc acertou com:"+ qtdJogadas + "Jogadas", Toast.LENGTH_LONG).show();
                this.qtdJogadas = 0;

                break;
        }

    }
}
