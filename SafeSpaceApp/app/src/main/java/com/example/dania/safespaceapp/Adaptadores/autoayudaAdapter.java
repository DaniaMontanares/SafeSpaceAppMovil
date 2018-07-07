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

import com.example.dania.safespaceapp.Actividades.FengChui;
import com.example.dania.safespaceapp.Actividades.PlantasMedicinales;
import com.example.dania.safespaceapp.Actividades.RecetasSaludables;
import com.example.dania.safespaceapp.Actividades.TestPsicologicos;
import com.example.dania.safespaceapp.Model.Autoayuda;
import com.example.dania.safespaceapp.R;

import java.util.List;

public class autoayudaAdapter extends RecyclerView.Adapter<autoayudaAdapter.autoayudaViewHolder>{

    private Context mCtx;
    private List<Autoayuda> autoayudaList;

    public autoayudaAdapter(Context mCtx, List<Autoayuda> autoayudaList) {
        this.mCtx = mCtx;
        this.autoayudaList = autoayudaList;
    }

    @NonNull
    @Override
    public autoayudaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.adapter_autoayuda,null);
        autoayudaViewHolder holder = new autoayudaViewHolder(view);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull autoayudaViewHolder holder, int position) {
        final Autoayuda autoayuda = autoayudaList.get(position);
        holder.textViewtitle.setText(autoayuda.getTitle());
        holder.textViewcontent.setText(autoayuda.getContent());
        holder.imageViewtitle.setImageDrawable(mCtx.getResources().getDrawable(autoayuda.getTitle_image()));
        holder.imageViewtopic.setImageDrawable(mCtx.getResources().getDrawable(autoayuda.getTopic_image()));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(autoayuda.getTitle() == "Test Psicologicos"){
                    Intent intent = new Intent(mCtx, TestPsicologicos.class);
                    mCtx.startActivity(intent);
                }
                if(autoayuda.getTitle() == "Feng Shui"){
                    Intent intent = new Intent(mCtx, FengChui.class);
                    mCtx.startActivity(intent);
                }
                if(autoayuda.getTitle() == "Recetas saludables"){
                    Intent intent = new Intent(mCtx, RecetasSaludables.class);
                    mCtx.startActivity(intent);
                }
                if (autoayuda.getTitle() == "Plantas medicinales"){
                    Intent intent = new Intent(mCtx, PlantasMedicinales.class);
                    mCtx.startActivity(intent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return autoayudaList.size();
    }

    public static class autoayudaViewHolder extends RecyclerView.ViewHolder{

        TextView textViewtitle, textViewcontent;
        ImageView imageViewtitle, imageViewtopic;
        RelativeLayout parentLayout;

        public autoayudaViewHolder(View itemView) {
            super(itemView);

            textViewtitle = (TextView) itemView.findViewById(R.id.text_title_autoayuda);
            textViewcontent = (TextView) itemView.findViewById(R.id.text_content_autoayuda);
            imageViewtitle = (ImageView) itemView.findViewById(R.id.imagen_title_autoayuda);
            imageViewtopic = (ImageView) itemView.findViewById(R.id.image_autoayuda);
            parentLayout = (RelativeLayout) itemView.findViewById(R.id.parent_layout_autoayuda);
        }
    }
}
