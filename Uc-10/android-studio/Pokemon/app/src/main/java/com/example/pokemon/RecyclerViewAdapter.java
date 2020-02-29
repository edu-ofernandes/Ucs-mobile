package com.example.pokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Pokemon> dadosPoke;
    private LayoutInflater minflate;

    RecyclerViewAdapter(Context context, ArrayList<Pokemon> dado){
        this.minflate = LayoutInflater.from(context);
        this.dadosPoke = dado;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = minflate.inflate(R.layout.pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nome = dadosPoke.get(position).getNome();
        holder.nome.setText(nome);
        String descricao = dadosPoke.get(position).getDescricao();
        holder.descricao.setText(descricao);
        int foto = dadosPoke.get(position).getFoto();
        holder.foto.setImageResource(foto);
    }

    @Override
    public int getItemCount() {
        return dadosPoke.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView descricao;
        ImageView foto;

        public ViewHolder(@NonNull View view) {
            super(view);
            nome = view.findViewById(R.id.tvNome);
            descricao = view.findViewById(R.id.tvDescricao);
            foto = view.findViewById(R.id.ivPoke);

        }
    }


}
