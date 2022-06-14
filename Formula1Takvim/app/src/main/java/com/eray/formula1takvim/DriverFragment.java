package com.eray.formula1takvim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class DriverFragment extends Fragment {

    private RecyclerView rv;
    private ArrayList<Suruculer> suruculerArrayList;
    private SurucuAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.fragment_driver, container, false);

        rv=rootView.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));


        suruculerArrayList =new ArrayList<>();


        Suruculer f1=new Suruculer("mercedes");
        Suruculer f2=new Suruculer("astonmartin");
        Suruculer f3=new Suruculer("redbull");
        Suruculer f4=new Suruculer("ferrari");
        Suruculer f5=new Suruculer("alfa");
        Suruculer f6=new Suruculer("pier");
        Suruculer f7=new Suruculer("mc");
        Suruculer f8=new Suruculer("hass");





        suruculerArrayList.add(f1);
        suruculerArrayList.add(f2);
        suruculerArrayList.add(f3);
        suruculerArrayList.add(f4);
        suruculerArrayList.add(f5);
        suruculerArrayList.add(f6);
        suruculerArrayList.add(f7);
        suruculerArrayList.add(f8);

        adapter=new SurucuAdapter(getActivity(),suruculerArrayList);

        rv.setAdapter(adapter);





        return rootView;
    }
}