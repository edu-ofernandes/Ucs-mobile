package com.example.somanumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void somarNumeros(View v){
        TextView num1 = findViewById(R.id.number1);
        TextView num2 = findViewById(R.id.number2);
        TextView resposta = findViewById(R.id.resposta);


        int numInt1 = Integer.parseInt(num1.getText().toString());
        int numInt2 = Integer.parseInt(num2.getText().toString());

        int total = numInt1 + numInt2;

        resposta.setText("Resposta: " + String.valueOf(total));
        num1.setText("");
        num2.setText("");
    }
}

