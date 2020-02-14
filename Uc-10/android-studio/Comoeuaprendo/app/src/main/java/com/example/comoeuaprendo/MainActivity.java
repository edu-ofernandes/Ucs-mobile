package com.example.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btVisual ;
    Button btAuditivo ;
    Button btLeitura ;
    Button btCinestesico ;
    Button btResponder ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btVisual = findViewById(R.id.btVisual);
        btAuditivo = findViewById(R.id.btAuditivo);
        btLeitura = findViewById(R.id.btLeitura);
        btCinestesico = findViewById(R.id.btCinestesico);
        btResponder = findViewById(R.id.btResponder);

    }



    public void btResponderClick(View v){
        Intent responderIntent = new Intent(getApplicationContext(), MeuEstiloActivity.class);
        startActivity(responderIntent);
    }

    public void btVisualClick(View v){
        Intent visualIntent = new Intent(getApplicationContext(), EstiloVisualActivity.class);
        startActivity(visualIntent);
    }

    public void btAuditivolClick(View v){
        Intent auditivoIntent = new Intent(getApplicationContext(), EstiloAuditivoActivity.class);
        startActivity(auditivoIntent);
    }

    public void btCinestesioClick(View v){
        Intent cinestesicoIntent = new Intent(getApplicationContext(), EstiloCinestesicoActivity.class);
        startActivity(cinestesicoIntent);
    }

    public void btLeituraClick(View v){
        Intent leituraIntent = new Intent(getApplicationContext(), EstiloLeituraActivity.class);
        startActivity(leituraIntent);
    }
}
