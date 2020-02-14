package com.example.comoeuaprendo;

public class Pergunta {
    private String enunciado;
    private String classe;

    public String getEnunciado() {
        return enunciado;
    }

    public Pergunta(){
        this.setEnunciado("");
        this.setClasse("");
    }

    public Pergunta(String en, String cl){
        this.setClasse(cl);
        this.setEnunciado(en);
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
