package com.example.pokemon;

public class Pokemon {

    private String nome;
    private String descricao;
    private int foto;

    public Pokemon(String nome, String descricao, int foto){
        this.setDescricao(descricao);
        this.setFoto(foto);
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
