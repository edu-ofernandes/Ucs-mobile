package com.example.appmultiuso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Par_imparActivity extends AppCompatActivity {

    TextView tvResposta;
    EditText etNumero;
    Button btParImparExecutar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_impar);

        tvResposta = findViewById(R.id.tvResposta);
        etNumero = findViewById(R.id.etNumero);
        btParImparExecutar = findViewById(R.id.btParImparExecutar);
    }

    public void parImparEecutar(View v){
        try {
            int i = Integer.parseInt(etNumero.getText().toString());
            tvResposta.setVisibility(View.VISIBLE);
            if(i%2==0){
                tvResposta.setText("Numero é Par");
            }else{
                tvResposta.setText("Numero é impar");
            }
        }catch (Exception e ){
            tvResposta.setText("Digite numeros");
            tvResposta.setVisibility(View.VISIBLE);
        }
    }
}
