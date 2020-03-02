package com.example.pokemon;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {

    private String nome;
    private String descricao;
    private int foto;

    public Pokemon(String nome, String descricao, int foto){
        this.setDescricao(descricao);
        this.setFoto(foto);
        this.setNome(nome);
    }

    protected Pokemon(Parcel in) {
        nome = in.readString();
        descricao = in.readString();
        foto = in.readInt();
    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(descricao);
        dest.writeInt(foto);
    }
}
