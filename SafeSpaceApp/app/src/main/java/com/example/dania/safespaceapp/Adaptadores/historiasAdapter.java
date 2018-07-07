package com.example.dania.safespaceapp.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dania.safespaceapp.Actividades.Historia;
import com.example.dania.safespaceapp.Actividades.TestPsicologicos;
import com.example.dania.safespaceapp.Model.Historias;
import com.example.dania.safespaceapp.R;

import java.util.List;

public class historiasAdapter extends RecyclerView.Adapter<historiasAdapter.historiasViewHolder> {



    private Context mCtx;
    private List<Historias> historiasList;



    public historiasAdapter(Context mCtx, List<Historias> historiasList) {
        this.mCtx = mCtx;
        this.historiasList = historiasList;

    }

    @NonNull
    @Override
    public historiasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.adapter_historias,null);
        historiasViewHolder holder = new historiasViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull historiasViewHolder holder, final int position) {
        Historias historias = historiasList.get(position);
        holder.textViewtitle.setText(historias.getTitle());
        holder.textViewauthor.setText(historias.getAutor());
        holder.textViewcontent.setText(historias.getContenido());
        holder.imageViewphoto.setImageDrawable(mCtx.getResources().getDrawable(historias.getImagen()));
        holder.imageViewphotocomentary.setImageDrawable(mCtx.getResources().getDrawable(historias.getImagen_comentarios()));
        holder.textViewcomentary.setText(historias.getComentarios());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mCtx, Historia.class);
                mCtx.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return historiasList.size();
    }

    public static class historiasViewHolder extends RecyclerView.ViewHolder{

        TextView textViewtitle, textViewauthor, textViewcontent, textViewcomentary;
        ImageView imageViewphoto, imageViewphotocomentary;
        RelativeLayout parentLayout;

        public historiasViewHolder(View itemView) {
            super(itemView);

            textViewtitle = (TextView) itemView.findViewById(R.id.title_text_history);
            textViewauthor = (TextView) itemView.findViewById(R.id.author_text_history);
            textViewcontent = (TextView) itemView.findViewById(R.id.content_text_history);
            imageViewphoto = (ImageView) itemView.findViewById(R.id.image_history);
            imageViewphotocomentary = (ImageView) itemView.findViewById(R.id.imagen_comentarios_history);
            textViewcomentary = (TextView) itemView.findViewById(R.id.comentarios_history);
            parentLayout = (RelativeLayout) itemView.findViewById(R.id.parent_layout_historias);
        }
    }
}
