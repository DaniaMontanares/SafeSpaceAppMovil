package com.example.dania.safespaceapp.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dania.safespaceapp.Actividades.Tableros;
import com.example.dania.safespaceapp.Model.Tablero;
import com.example.dania.safespaceapp.R;


import java.util.HashMap;
import java.util.List;

public class tableroAdapter extends RecyclerView.Adapter<tableroAdapter.tableroViewHolder>{

    private Context mCtx;
    private List<Tablero> tableroList;

    public tableroAdapter(Context mCtx, List<Tablero> tableroList) {
        this.mCtx = mCtx;
        this.tableroList = tableroList;
    }

    @NonNull
    @Override
    public tableroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.adapter_tablero,null);
        tableroAdapter.tableroViewHolder holder = new tableroAdapter.tableroViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull tableroViewHolder holder, int position) {
        Tablero tablero = tableroList.get(position);
        holder.textViewuser.setText(tablero.getUser());
        holder.textViewdate.setText(tablero.getDate());
        holder.textViewcontent.setText(tablero.getContent());
        holder.textViewcomentary.setText(tablero.getComentary());
        holder.imageViewcomentary.setImageDrawable(mCtx.getResources().getDrawable(tablero.getImage_comentary()));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCtx, Tableros.class);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tableroList.size();
    }


    public static class tableroViewHolder extends RecyclerView.ViewHolder{

        TextView textViewuser, textViewdate, textViewcontent, textViewcomentary;
        ImageView imageViewcomentary;
        RelativeLayout parentLayout;


        public tableroViewHolder(View itemView) {
            super(itemView);

            textViewuser = (TextView) itemView.findViewById(R.id.text_anonimo_tablero);
            textViewdate = (TextView) itemView.findViewById(R.id.text_fecha_tablero);
            textViewcontent = (TextView) itemView.findViewById(R.id.text_content_tablero);
            textViewcomentary = (TextView) itemView.findViewById(R.id.text_comentarios_tablero);
            imageViewcomentary = (ImageView) itemView.findViewById(R.id.imagen_comentarios_tablero);
            parentLayout = (RelativeLayout) itemView.findViewById(R.id.parent_layout_tablero);
        }
    }


}
