package com.example.frasesparavoce;

public class Frase {
    private String texto;
    private String autor;
    private String categoria;
    private String id;

    public Frase(String texto, String autor, String categoria, String id) {
        this.texto = texto;
        this.autor = autor;
        this.categoria = categoria;
        this.id = id;
    }

    public Frase() {
        this.setId("");
        this.autor = "";
        this.categoria = "";
        this.texto = "";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
