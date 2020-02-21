package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Giroscopio giroscopio;
    private ImageView ivFoto;
    private int i;
    private TextView tvResult;
    private String[] msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 0;
        ivFoto = findViewById(R.id.ivFoto);
        tvResult = findViewById(R.id.tvResult);
       geraMensagens();

        giroscopio = new Giroscopio(this);

        giroscopio.setListener(new Giroscopio.Listener() {
            @Override
            public void OnRotation(float rx, float ry, float rz) {
                Drawable img;
                i++;
                if (rx > 1.0f){
                    img = getResources().getDrawable(R.drawable.mafic8ballfrente);
                    ivFoto.setImageDrawable(img);

                    if(i > 0) {
                        img = getResources().getDrawable(R.drawable.magi8ballverso);
                        ivFoto.setImageDrawable(img);
                        tvResult.setText(sorteio());
                    }


                }/*else if(rx < -1.0f){

                }*/
            }
        });


    }

    @Override
    protected void onResume(){
        super.onResume();

        giroscopio.register();
    }

    public String sorteio() {
        Random gerador = new Random();
        return(msg[gerador.nextInt(6)]);
    }

    public void geraMensagens() {
        msg = new String[20];

        msg[0] = "É certo";
        msg[1] = "É decididamente que sim.";
        msg[2] = "sem dúvida.";
        msg[3] = "Sim - definitivamente.";
        msg[4] = "Você pode contar com ele.";
        msg[5] = "Pelo que vejo, sim.";
        msg[6] = "Provavelmente.";
        msg[7] = "Outlook bom.";
        msg[8] = "sim.";
        msg[9] = "sinais apontam para sim";
        msg[10] = "Responder nebuloso, tente novamente.";
        msg[11] = "Pergunte novamente mais tarde.";
        msg[12] = "Melhor não contar agora.";
        msg[13] = "Não é possível prever agora.";
        msg[14] = "Concentre-se e pergunte novamente.";
        msg[15] = "Não conte com isso.";
        msg[16] = "Minha resposta é não.";
        msg[17] = "Minhas fontes dizem não.";
        msg[18] = "Outlook não é tão bom.";
        msg[19] = " muito duvidoso.";
    }

}
