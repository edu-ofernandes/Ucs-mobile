package com.example.pokemon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Pokemon> dadosPoke;
    private LayoutInflater minflate;
    private OnListenerPoke onMListenerPoke;
    private Context context;

    public RecyclerViewAdapter(Context context, ArrayList<Pokemon> dado, OnListenerPoke onListenerPoke){
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
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        String nome = dadosPoke.get(position).getNome();
        String desc = dadosPoke.get(position).getDescricao();
        //Pokemon pokemon = dadosPoke.get(position);
        int foto = dadosPoke.get(position).getFoto();

        holder.nome.setText(nome);
        holder.descricao.setText(desc);
        holder.foto.setImageResource(foto);

        /*holder.btInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InformacoesActivity.class);

                intent.putExtra("pokemon", ( Parcelable) dadosPoke.get(position));
                context.startActivity(intent);
                Toast.makeText(context, holder.nome.getText(), Toast.LENGTH_SHORT).show();
            }
        });*/
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
            onListenerPoke.onClickPoke(getAdapterPosition());
        }
    }

   public interface OnListenerPoke{
        void onClickPoke(int position);
    }

}
