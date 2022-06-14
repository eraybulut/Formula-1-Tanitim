package com.eray.formula1takvim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PistAdapter extends RecyclerView.Adapter<PistAdapter.cardViewTutucuPist>{

    private Context mContext;
    private List<Pistler> pistlerList;

    public PistAdapter(Context mContext, List<Pistler> pistlerList) {
        this.mContext = mContext;
        this.pistlerList = pistlerList;
    }

    public class cardViewTutucuPist extends RecyclerView.ViewHolder{
        public ImageView pistResim;
        public TextView pistAd;

        public cardViewTutucuPist(@NonNull View itemView) {
            super(itemView);
           pistResim=itemView.findViewById(R.id.pistResim);
           pistAd=itemView.findViewById(R.id.pistAd);
        }
    }

    @NonNull
    @Override
    public cardViewTutucuPist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_pist,parent,false);
        return new cardViewTutucuPist(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewTutucuPist holder, int position) {
        Pistler pist=pistlerList.get(position);


        holder.pistResim.setImageResource(mContext.getResources()
                .getIdentifier(pist.getPistResim(),"drawable",mContext.getPackageName()));
        holder.pistAd.setText(pist.getPistAd());
    }

    @Override
    public int getItemCount() {
        return pistlerList.size();
    }
}
