package com.example.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MeuEstiloActivity extends AppCompatActivity {

    ArrayList<Pergunta> perguntaArray;
    int auditivo;
    int visual;
    int leitura;
    int cinestesico;
    int qtdPerguntas;
    int posPergunta;

    TextView btSim;
    TextView btNao;
    TextView tvResposta;
    TextView tvEnunciado;
    TextView tvReiniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_estilo);
        this.criaPergunta();
        this.iniciarQuestionario();

        btSim = findViewById(R.id.btIdentifico);
        btNao = findViewById(R.id.btNaoIdentifico);
        tvResposta = findViewById(R.id.tvResposta);
        tvEnunciado = findViewById(R.id.tvEnunciado);
        tvReiniciar = findViewById(R.id.btReiniciar);
    }

    public void btReiniciar(View v){
        iniciarQuestionario();


        btSim.setVisibility(View.VISIBLE);
        btNao.setVisibility(View.VISIBLE);
        tvEnunciado.setVisibility(View.VISIBLE);
        tvReiniciar.setVisibility(View.INVISIBLE);

        tvResposta.setVisibility(View.INVISIBLE);
    }

    public void  btResponder(View v){
        String btTexto = ((Button)v).getText().toString();
        Pergunta p = perguntaArray.get(this.posPergunta);

        if((btTexto.equals("Me identifico")== true)){
            switch (p.getClasse()){
                case "visual":
                    this.visual++;
                    break;
                case "auditivo":
                    this.auditivo++;
                    break;
                case "cinestesico":
                    this.cinestesico++;
                    break;
                case "leitura escrita":
                    this.leitura++;
                    break;

            }
        }
        this.posPergunta++;
        if (this.posPergunta < this.qtdPerguntas){
            p = perguntaArray.get(this.posPergunta);

            TextView tvEnunciado = findViewById(R.id.tvEnunciado);
            tvEnunciado.setText(p.getEnunciado());
        }else {
//                Toast.makeText(this, "Funcionou", Toast.LENGTH_LONG).show();
            int[] arr1 ={this.auditivo, this.visual, this.cinestesico, this.leitura};
            String[] arr2 = {"auditivo", "visual", "cinestesico", "leitura"};
            for (int j=0; j<3; j++){
                for (int i=0; i<3; i++){
                    if (arr1[i] < arr1[i + 1]){
                        int valor = arr1[i];
                        arr1[i] = arr1[i + 1];
                        arr1[i + 1] = valor;

                        String valor2 = arr2[i];
                        arr2[i] = arr2[i + 1];
                        arr2[i + 1] = valor2;
                    }
                }
            }

            ((Button)v).setVisibility(View.INVISIBLE);

            btSim.setVisibility(View.INVISIBLE);
            btNao.setVisibility(View.INVISIBLE);
            tvEnunciado.setVisibility(View.INVISIBLE);
            tvReiniciar.setVisibility(View.VISIBLE);
            tvResposta.setVisibility(View.VISIBLE);

            tvResposta.setText("Segue a pontuaçao: Visual: " + this.visual +", Cinestesico: " + this.cinestesico +", Leitura: "+ this.leitura +", Auditivo: "+ this.auditivo +
                    ". Voce é : " + arr2[0]);

            String estiloNome = arr2[0];
            int estiloQtd = arr1[0];

            Intent intentResposta = new Intent(getApplicationContext(), RespostaActivity.class);

            intentResposta.putExtra("estiloNome", estiloNome);
            intentResposta.putExtra("estiloQtd", estiloQtd);

            startActivity(intentResposta);
        }
    }

    public void iniciarQuestionario(){
        auditivo = 0;
        visual = 0;
        leitura = 0;
        cinestesico = 0;
        qtdPerguntas = perguntaArray.size();
        posPergunta = 0;

//      tela
        TextView tvEnunciado = findViewById(R.id.tvEnunciado);
        Pergunta pArray = perguntaArray.get(0);
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


    }
}
