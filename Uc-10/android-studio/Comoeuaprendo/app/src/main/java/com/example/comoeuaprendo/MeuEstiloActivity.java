package com.example.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        iniciarQuestionario();
    }

    public void iniciarQuestionario(){
        auditivo = 0;
        visual = 0;
        leitura = 0;
        cinestesico = 0;
        qtdPerguntas = 0;

//      tela
        TextView tvEnunciado = findViewById(R.id.tvEnunciado);
        Pergunta pArray = perguntaArray.get(0);
        tvEnunciado.setText(pArray.getEnunciado());
    }

    public void criaPergunta(){
        perguntaArray = new ArrayList<Pergunta>();

//      auditivo
        perguntaArray.add(new Pergunta("Você é bom ouvinte", "auditivo"));
        perguntaArray.add(new Pergunta("Você cantarola ou canta em voz alta frequência", "auditivo"));
        perguntaArray.add(new Pergunta("Você é um bom comunicador.", "auditivo"));
        perguntaArray.add(new Pergunta("Você costuma associar memórias com música.", "auditivo"));
        perguntaArray.add(new Pergunta("Você ouve música enquanto cozinha ou estuda.", "auditivo"));


//      leitura escrita
        perguntaArray.add(new Pergunta("Você lê tudo o que você tem na frente, desde jornais a caixas de cereais.", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você possui um vocabulário amplo.", "leitura escrita"));
        perguntaArray.add(new Pergunta("Muitas vezes, você rabisca quando tem caneta e papel à mão.", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você usa exemplos específicos quando expõe seus pontos de vista.", "leitura escrita"));
        perguntaArray.add(new Pergunta("Você consegue facilmente expressar o que está pensando.", "leitura escrita"));


//      cinestesico
        perguntaArray.add(new Pergunta("Você é cheio de energia, fisicamente ativo (pratica atividades físicas regularmente).", "cinestesico"));
        perguntaArray.add(new Pergunta("Você usa as mãos para falar.", "cinestesico"));
        perguntaArray.add(new Pergunta("Você gosta de estar sozinho quando se dedica a algum hobby.", "cinestesico"));
        perguntaArray.add(new Pergunta("Você tem ciência de seus pontos fortes e fracos.", "cinestesico"));
        perguntaArray.add(new Pergunta("Você gosta de atividades físicas, tais como jardinagem ou construção.", "cinestesico"));


//      visual
        perguntaArray.add(new Pergunta("Você aprecia realizar atividades em grupo, como jogos de tabuleiro.", "visual"));
        perguntaArray.add(new Pergunta("Você tem um bom senso de direção quando viaja.", "visual"));
        perguntaArray.add(new Pergunta("Você organiza suas atividades usando listas de tarefas pendentes.", "visual"));
        perguntaArray.add(new Pergunta("Você fica animado ao realizar orçamentos e metas financeiras.", "visual"));
        perguntaArray.add(new Pergunta("Você se sente revigorado quando tem um tempo sozinho.", "visual"));
        perguntaArray.add(new Pergunta("Você entende melhor as coisas com imagens ou diagramas.", "visual"));


        /*Pergunta p = new Pergunta();
        p.setEnunciado("Você é bom ouvinte");
        p.setClasse("AUDITVO");
        Pergunta.add(p);*/

    }
}
