package com.example.ruletarusa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        ImageButton bala1 = (ImageButton) findViewById(R.id.IbtnBala1);//Imagen de la bala 1
        ImageButton bala2 = (ImageButton) findViewById(R.id.IbtnBala2);//Imagen de la bala 2
        ImageButton bala3 = (ImageButton) findViewById(R.id.IbtnBala3);//Imagen de la bala 3
        ImageButton bala4 = (ImageButton) findViewById(R.id.IbtnBala4);//Imagen de la bala 4
        ImageButton bala5 = (ImageButton) findViewById(R.id.IbtnBala5);//Imagen de la bala 5
        ImageButton bala6 = (ImageButton) findViewById(R.id.IbtnBala6);//Imagen de la bala 6
        ImageView Final = (ImageView) findViewById(R.id.IvFinal);//TextView que aparece cuando el numero aleatorio coincide con la bala
        //TextView resultado = (TextView) findViewById(R.id.resultAleatorio);//TextView utilizado para comprobar el numero aleatorio


        int num1 = 1;
        int num2 = 6;
        int numAleatorio = (int) Math.floor(Math.random() * (num1 - (num2 + 1)) + (num2));//Me da un numero aleatorio entre el 0 y el 5
        // resultado.setText(String.valueOf(numAleatorio));//comprobacion en el textview del numero aleatorio

        bala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 0) {//Si el número alatorio coincide con la bala
                    Final.setVisibility(View.VISIBLE);//aparece la imagen
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {//y nos dirige a la activity final con la opciones de repetir o salir
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                } else {
                    bala1.setVisibility(View.INVISIBLE);//Si el numero aleatorio no coincide con la bala entonces desaparece la imagen

                }

            }

        });
        bala2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 1) {
                    Final.setVisibility(View.VISIBLE);
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                } else {
                    bala2.setVisibility(View.INVISIBLE);

                }

            }

        });
        bala3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 2) {
                    Final.setVisibility(View.VISIBLE);
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                } else {
                    bala3.setVisibility(View.INVISIBLE);

                }

            }

        });
        bala4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 3) {
                    Final.setVisibility(View.VISIBLE);
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                } else {
                    bala4.setVisibility(View.INVISIBLE);

                }

            }

        });
        bala5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 4) {
                    Final.setVisibility(View.VISIBLE);
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);
                } else {
                    bala5.setVisibility(View.INVISIBLE);

                }

            }

        });
        bala6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numAleatorio == 5) {
                    Final.setVisibility(View.VISIBLE);

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(Principal.this, FinalSeis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }
                    }, 1000);

                } else {
                    bala6.setVisibility(View.INVISIBLE);

                }

            }

        });


    }

}