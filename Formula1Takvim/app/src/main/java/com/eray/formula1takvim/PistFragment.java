package com.eray.formula1takvim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PistFragment extends Fragment {
    private RecyclerView rv;
    private ArrayList<Pistler> pistlerArrayList;
    private PistAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_pist, container, false);


        rv=rootView.findViewById(R.id.rv2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));

        pistlerArrayList=new ArrayList<>();


        Pistler p1=new Pistler("istanbul","İstanbul GP");
        Pistler p2=new Pistler("sud","Suudi Arabistan GP");
        Pistler p3=new Pistler("monaca","Monaco GP");
        Pistler p4=new Pistler("ita","İtalya GP");
        Pistler p5=new Pistler("baku","Azerbaycan GP");
        Pistler p6=new Pistler("bah","Bahrein GP");
        Pistler p7=new Pistler("sin","Singapur GP");
        Pistler p8=new Pistler("abu","Abu Dhabi GP");
        Pistler p9=new Pistler("abd","ABD GP");


        ;



        pistlerArrayList.add(p1);
        pistlerArrayList.add(p2);
        pistlerArrayList.add(p3);
        pistlerArrayList.add(p4);
        pistlerArrayList.add(p5);
        pistlerArrayList.add(p6);
        pistlerArrayList.add(p7);
        pistlerArrayList.add(p8);
        pistlerArrayList.add(p9);


        adapter=new PistAdapter(getActivity(),pistlerArrayList);

        rv.setAdapter(adapter);


        return rootView;
    }
}