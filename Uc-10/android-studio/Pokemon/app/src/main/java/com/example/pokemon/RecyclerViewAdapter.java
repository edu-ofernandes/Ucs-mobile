package com.example.pokemon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Pokemon> dadosPoke;
    private LayoutInflater minflate;
    private OnListenerPoke onMListenerPoke;
    private Context context;

    RecyclerViewAdapter(Context context, ArrayList<Pokemon> dado, OnListenerPoke onListenerPoke){
        this.dadosPoke = dado;
        this.onMListenerPoke = onListenerPoke;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon, parent, false);
        return new ViewHolder(view, onMListenerPoke);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nome.setText(dadosPoke.get(position).getNome());
        holder.descricao.setText(dadosPoke.get(position).getDescricao());
        holder.foto.setImageResource(dadosPoke.get(position).getFoto());

        holder.btInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InformacoesActivity.class);
                String nome = dadosPoke.get(position).getNome();
                String desc = dadosPoke.get(position).getDescricao();
                intent.putExtra("nome", "nome");
                intent.putExtra("desc", "desc");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dadosPoke.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nome;
        TextView descricao;
        ImageView foto;

        Button btInfo;
        OnListenerPoke onListenerPoke;

        public ViewHolder(@NonNull View view, OnListenerPoke onListenerPoke) {
            super(view);
            nome = view.findViewById(R.id.tvNome);
            descricao = view.findViewById(R.id.tvDescricao);
            foto = view.findViewById(R.id.ivPoke);
            btInfo = view.findViewById(R.id.btInfo);

            this.onListenerPoke = onListenerPoke;
            btInfo.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
           // this.
//            int i = getAdapterPosition();
            onListenerPoke.onClickPoke(getAdapterPosition());
        }
    }

    public interface OnListenerPoke{
        void onClickPoke(int position);
    }

}
