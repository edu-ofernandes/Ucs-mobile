package com.example.frasesparavoce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

  private Context context;
  private List<Frase> data;

  public MyAdapter(Context context, List<Frase> data){
    this.context = context;
    this.data = data;

  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.activity_frase, parent, false);
    return new ViewHolder(view) ;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.tvFrase.setText(data.get(position).getTexto());
  }

  @Override
  public int getItemCount() {
    return this.data.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    TextView tvFrase;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      tvFrase = itemView.findViewById(R.id.tvFrase);
    }
  }
}
