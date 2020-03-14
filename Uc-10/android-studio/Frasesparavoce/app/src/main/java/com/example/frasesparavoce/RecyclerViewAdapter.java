package com.example.frasesparavoce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolde> {

    private Context context;
    private ArrayList<Frase> frases;

    public RecyclerViewAdapter(Context context, ArrayList<Frase> frases) {
        this.context = context;
        this.frases = frases;
    }

    @NonNull
    @Override
    public ViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_frase, parent, false);
        return new RecyclerViewAdapter.ViewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolde holder, int position) {
        final Frase fraseItem = frases.get(position);
        holder.tvFrase.setText(fraseItem.getTexto());
    }

    @Override
    public int getItemCount() {
        return frases.size();
    }

    public class ViewHolde extends RecyclerView.ViewHolder {

        private TextView tvFrase;
        public ViewHolde(@NonNull View itemView) {
            super(itemView);

            tvFrase = itemView.findViewById(R.id.tvFrase);
        }
    }
}
