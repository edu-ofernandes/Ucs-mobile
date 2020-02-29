package com.example.pokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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
    }

    @Override
    public int getItemCount() {
        return dadosPoke.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView descricao;

        public ViewHolder(@NonNull View nomeView) {
            super(nomeView);
            nome = nomeView.findViewById(R.id.tvNome);

        }
    }


}
