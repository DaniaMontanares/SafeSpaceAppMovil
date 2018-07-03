package com.example.dania.safespaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vistaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistaprincipal);
        //btnISVP: botón de inicio de sesión vista principal
        Button btnISVP = (Button) findViewById(R.id.iniciarSesionBTN);
        btnISVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),vistahistorias.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
