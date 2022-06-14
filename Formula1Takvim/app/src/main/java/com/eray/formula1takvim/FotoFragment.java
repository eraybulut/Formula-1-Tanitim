package com.eray.formula1takvim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FotoFragment extends Fragment {
    private RecyclerView rv;
    private ArrayList<Fotolar> fotolarArrayList;
    private FotoAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_foto, container, false);


        rv=rootView.findViewById(R.id.rv3);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(1
                ,StaggeredGridLayoutManager.VERTICAL));

        fotolarArrayList=new ArrayList<>();

        Fotolar f1=new Fotolar("mersof1");
        Fotolar f2=new Fotolar("redf1");
        Fotolar f3=new Fotolar("astonf1");
        Fotolar f4=new Fotolar("ferrarif1");
        Fotolar f5=new Fotolar("alfaf1");
        Fotolar f6=new Fotolar("alpha");
        Fotolar f7=new Fotolar("mcf1");
        Fotolar f8=new Fotolar("hassf1");
        Fotolar f9=new Fotolar("micff1");
        Fotolar f10=new Fotolar("lotusf1");
        Fotolar f11=new Fotolar("sennaf1");


        fotolarArrayList.add(f1);
        fotolarArrayList.add(f2);
        fotolarArrayList.add(f3);
        fotolarArrayList.add(f4);
        fotolarArrayList.add(f5);
        fotolarArrayList.add(f6);
        fotolarArrayList.add(f7);
        fotolarArrayList.add(f8);
        fotolarArrayList.add(f9);
        fotolarArrayList.add(f10);
        fotolarArrayList.add(f11);

        adapter=new FotoAdapter(getActivity(),fotolarArrayList);
        rv.setAdapter(adapter);

        return rootView;
    }
}