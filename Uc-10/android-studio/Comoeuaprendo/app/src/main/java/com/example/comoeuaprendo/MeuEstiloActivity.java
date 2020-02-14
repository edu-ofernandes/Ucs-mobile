package com.example.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MeuEstiloActivity extends AppCompatActivity {

    ArrayList<Pergunta> perguntaArray;
    int auditivo;
    int visual;
    int leitura;
    int cinestesico;
    int qtdPerguntas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_estilo);
        this.criaPergunta();
        this.iniciarQuestionario();
    }

    public void responder(View v){
        if(qtdPerguntas == perguntaArray.size()){
            this.iniciarQuestionario();
        }else {
            this.qtdPerguntas++;
            TextView tvEnunciado = findViewById(R.id.tvEnunciado);
            Pergunta pArray = perguntaArray.get(qtdPerguntas);
            tvEnunciado.setText(pArray.getEnunciado());
        }

    }

    public void iniciarQuestionario(){
        auditivo = 0;
        visual = 0;
        leitura = 0;
        cinestesico = 0;
        this.qtdPerguntas = 0;

//      tela
        TextView tvEnunciado = findViewById(R.id.tvEnunciado);
        Pergunta pArray = perguntaArray.get(qtdPerguntas);
        tvEnunciado.setText(pArray.getEnunciado());
    }

    public void criaPergunta(){
        perguntaArray = new ArrayList<Pergunta>();

//      auditivo
        perguntaArray.add(new Pergunta("Você é bom ouvinte - 1", "auditivo"));
        perguntaArray.add(new Pergunta("Você lê tudo o que você tem na frente, desde jornais a caixas de cereais. - 2", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você é cheio de energia, fisicamente ativo (pratica atividades físicas regularmente). - 3", "cinestesico"));
        perguntaArray.add(new Pergunta("Você cantarola ou canta em voz alta frequência - 4", "auditivo"));
        perguntaArray.add(new Pergunta("Você possui um vocabulário amplo. - 5", "leitura escrita"));
        perguntaArray.add(new Pergunta("Muitas vezes, você rabisca quando tem caneta e papel à mão. - 6", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você aprecia realizar atividades em grupo, como jogos de tabuleiro. - 7", "visual"));
        perguntaArray.add(new Pergunta("Você usa exemplos específicos quando expõe seus pontos de vista. - 8", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você tem um bom senso de direção quando viaja. - 9", "visual"));
        perguntaArray.add(new Pergunta("Você é um bom comunicador. - 10", "auditivo"));
        perguntaArray.add(new Pergunta("Você consegue facilmente expressar o que está pensando. - 11", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você organiza suas atividades usando listas de tarefas pendentes. - 12", "visual"));
        perguntaArray.add(new Pergunta("Você usa as mãos para falar. - 13", "cinestesico"));
        perguntaArray.add(new Pergunta("Você gosta de estar sozinho quando se dedica a algum hobby. - 14", "cinestesico"));
        perguntaArray.add(new Pergunta("Você fica animado ao realizar orçamentos e metas financeiras. - 15", "visual"));
        perguntaArray.add(new Pergunta("Você tem ciência de seus pontos fortes e fracos. - 16", "cinestesico"));
        perguntaArray.add(new Pergunta("Você costuma associar memórias com música. - 17", "auditivo"));
        perguntaArray.add(new Pergunta("Você se sente revigorado quando tem um tempo sozinho. - 18", "visual"));
        perguntaArray.add(new Pergunta("Você gosta de atividades físicas, tais como jardinagem ou construção. - 19", "cinestesico"));
        perguntaArray.add(new Pergunta("Você entende melhor as coisas com imagens ou diagramas. - 20", "visual"));
        perguntaArray.add(new Pergunta("Você ouve música enquanto cozinha ou estuda. - 21", "auditivo"));



        /*Pergunta p = new Pergunta();
        p.setEnunciado("Você é bom ouvinte");
        p.setClasse("AUDITVO");
        Pergunta.add(p);*/

    }
}
