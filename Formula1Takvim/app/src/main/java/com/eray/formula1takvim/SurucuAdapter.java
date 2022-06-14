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

public class SurucuAdapter extends RecyclerView.Adapter<SurucuAdapter.CardViewTutucu>{
    private Context mContex;
    private List<Suruculer> suruculerList;

    public SurucuAdapter(Context mContex, List<Suruculer> suruculerList) {
        this.mContex = mContex;
        this.suruculerList = suruculerList;
    }



    public class CardViewTutucu extends RecyclerView.ViewHolder{

        public ImageView soforResim;


        public CardViewTutucu(@NonNull View itemView) {
            super(itemView);
            soforResim=itemView.findViewById(R.id.soforResim);

        }
    }
    @NonNull
    @Override
    public CardViewTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_driver,parent,false);
        return new CardViewTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTutucu holder, int position) {
        Suruculer surucu=suruculerList.get(position);

        holder.soforResim.setImageResource(mContex.getResources()
                .getIdentifier(surucu.getSoforResim(),"drawable",mContex.getPackageName()));


    }

    @Override
    public int getItemCount() {
        return suruculerList.size();
    }

}
