package com.example.dania.safespaceapp.Fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dania.safespaceapp.Model.Autoayuda;
import com.example.dania.safespaceapp.R;
import com.example.dania.safespaceapp.Adaptadores.autoayudaAdapter;

import java.util.ArrayList;
import java.util.List;


public class AutoayudaFragment extends Fragment {

    private RecyclerView recyclerView;
    private autoayudaAdapter ayAdapter;

    private List<Autoayuda> autoayudaList;

    public AutoayudaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_autoayuda, container, false);

        autoayudaList = new ArrayList<>();

        recyclerView = (RecyclerView) v.findViewById(R.id.autoayuda_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        autoayudaList.add(new Autoayuda("Test Psicologicos","Aqui puede encontrar un monton de material relacional a Test Psicológicos",R.drawable.texto,R.drawable.logo));
        autoayudaList.add(new Autoayuda("Feng Shui","Esta cuestion no tengo idea que es",R.drawable.texto,R.drawable.logo));
        autoayudaList.add(new Autoayuda("Recetas saludables","Aqui encontrara muchas recetas saludables (aguante la comida chatarra! :x)",R.drawable.texto,R.drawable.logo));
        autoayudaList.add(new Autoayuda("Plantas medicinales","Aqui encontrara mucha información respecto a las plantitas medicinales",R.drawable.texto,R.drawable.logo));

        ayAdapter = new autoayudaAdapter(getActivity(),autoayudaList);
        recyclerView.setAdapter(ayAdapter);

        return v;
    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
