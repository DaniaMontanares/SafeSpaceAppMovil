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
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.dania.safespaceapp.Model.Tablero;
import com.example.dania.safespaceapp.R;
import com.example.dania.safespaceapp.Adaptadores.tableroAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TableroFragment extends Fragment {


    private RecyclerView recyclerView;
    private tableroAdapter TAdapter;

    private List<Tablero> tableroList;

    public TableroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tablero, container, false);

        tableroList = new ArrayList<>();

        recyclerView = (RecyclerView) v.findViewById(R.id.tablero_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        tableroList.add(new Tablero("Anónimo","04/03/1993", "No quiero volver a clases D: que siga el paro :D","10 comentarios",R.drawable.comentarios));
        tableroList.add(new Tablero("Anónimo","14/12/1993","Me salio malo el pc u.u pero lo cambiare :D","50 comentarios",R.drawable.comentarios));
        tableroList.add(new Tablero("Anónimo","05/05/1998","Quiero puro volver a clases flojos qlos :c","2 comentarios",R.drawable.comentarios));
        tableroList.add(new Tablero("Anónimo","30/12/1990","Odio a los innombrables :c","100 comentarios",R.drawable.comentarios));

        TAdapter = new tableroAdapter(getActivity(), tableroList);
        recyclerView.setAdapter(TAdapter);


        return v;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
