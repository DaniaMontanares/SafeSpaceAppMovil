package com.example.dania.safespaceapp.Fragmentos;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dania.safespaceapp.Model.Historias;
import com.example.dania.safespaceapp.R;
import com.example.dania.safespaceapp.Adaptadores.historiasAdapter;

import java.util.ArrayList;
import java.util.List;


public class HistoriasFragment extends Fragment {


    private  RecyclerView recyclerView;
    private  historiasAdapter Hadapter;

    private List<Historias> historiasList;

    public HistoriasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_historias, container, false);

        historiasList = new ArrayList<>();

        recyclerView = (RecyclerView) v.findViewById(R.id.history_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        historiasList.add(new Historias("Titulo1","ElliFoster","Hace mucho tiempo que me siento mal nose porque", R.drawable.logo, R.drawable.comentarios, "12 comentarios"));
        historiasList.add(new Historias("Titulo2", "Shona", "Nose porque tengo tanta mala suerte, yo soy una wena persona pero aun asi no entiend porque yo, alguno de ustedes ha vivido lo mismo que yo? es decir alguno siente lo que estoy pasando? por favor necesito apoyo estoy desesperado", R.drawable.logo, R.drawable.comentarios, "5 comentarios"));
        historiasList.add(new Historias("Titulo3", "Aristoteles", "La amistad es un alma que habita en dos cuerpos; un corazón que habita en dos almas.", R.drawable.logo, R.drawable.comentarios, "200 comentarios"));
        historiasList.add(new Historias("Titulo4", "JBrown", "lalalaalalal", R.drawable.logo, R.drawable.comentarios, "2 comentarios"));

        Hadapter = new historiasAdapter(getActivity(), historiasList);

        recyclerView.setAdapter(Hadapter);

        return v;


    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
