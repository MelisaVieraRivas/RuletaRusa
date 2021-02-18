package com.example.ruletarusa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalSeis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_seis);

        Button Repetir=(Button)findViewById(R.id.btnRepetir);
        Button Salir=(Button)findViewById(R.id.btnSalir);

        Repetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r= new Intent(FinalSeis.this, Principal.class);//REpetimos juego, la pantalla vuelve a la principal
                startActivity(r);
            }
        });

        Salir.setOnClickListener(new View.OnClickListener() {//salimos de la aplicación
            @Override
            public void onClick(View v) {
                finishAffinity();

            }
        });
    }
}