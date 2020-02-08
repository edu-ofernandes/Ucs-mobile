package com.example.appmultiuso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btImc;
    Button btParImpar;
    Button btVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btImc = findViewById(R.id.btImc);
        btParImpar = findViewById(R.id.btpar_impar);
        btVideo = findViewById(R.id.btVideo);
    }

    public void btImc(View v){
        Intent intentImc = new Intent(getApplicationContext(), ImcActivity.class);
        startActivity(intentImc);
    }

    public void btParImpar(View v){
        Intent intentParImpar = new Intent(getApplicationContext(), Par_imparActivity.class);
        startActivity(intentParImpar);
    }

    public void btVideo(View v){
        Intent intentVideo = new Intent(getApplicationContext(), VideoActivity.class);
        startActivity(intentVideo);
    }


}
