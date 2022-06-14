package com.eray.formula1takvim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FotoAdapter extends RecyclerView.Adapter<FotoAdapter.carViewTutucuFoto>{

    private Context mContext;
    private List<Fotolar> fotolarList;

    public FotoAdapter(Context mContext, List<Fotolar> fotolarList) {
        this.mContext = mContext;
        this.fotolarList = fotolarList;
    }

    public class carViewTutucuFoto extends RecyclerView.ViewHolder{
        public ImageView foto;

        public carViewTutucuFoto(@NonNull View itemView) {
            super(itemView);
            foto=itemView.findViewById(R.id.foto);
        }
    }
    @NonNull
    @Override
    public carViewTutucuFoto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_foto,parent,false);
        return new carViewTutucuFoto(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull carViewTutucuFoto holder, int position) {
        Fotolar foto=fotolarList.get(position);

        holder.foto.setImageResource(mContext.getResources().getIdentifier(foto.getFoto(),"drawable",mContext.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return fotolarList.size();
    }
}
