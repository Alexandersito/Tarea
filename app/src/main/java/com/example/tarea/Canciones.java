package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Canciones extends AppCompatActivity {

    Button btnMusica1,btnMusica2,btnMusica3,btnMusica4,btnMusica5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canciones);

        String genero = getIntent().getStringExtra("genero");

        btnMusica1 = findViewById(R.id.btnMusica1);
        btnMusica2 = findViewById(R.id.btnMusica2);
        btnMusica3 = findViewById(R.id.btnMusica3);
        btnMusica4 = findViewById(R.id.btnMusica4);
        btnMusica5 = findViewById(R.id.btnMusica5);

        if (genero.equals("rock")) {
            btnMusica1.setText("rock1");
            btnMusica2.setText("rock2");
            btnMusica3.setText("rock3");
            btnMusica4.setText("rock4");
            btnMusica5.setText("rock5");
        }else if (genero.equals("pop")){
            btnMusica1.setText("pop1");
            btnMusica2.setText("pop2");
            btnMusica3.setText("pop3");
            btnMusica4.setText("pop4");
            btnMusica5.setText("pop5");
        }else if (genero.equals("bachata")){
            btnMusica1.setText("bachata1");
            btnMusica2.setText("bachata2");
            btnMusica3.setText("bachata3");
            btnMusica4.setText("bachata4");
            btnMusica5.setText("bachata5");
        }else if (genero.equals("salsa")){
            btnMusica1.setText("salsa1");
            btnMusica2.setText("salsa2");
            btnMusica3.setText("salsa3");
            btnMusica4.setText("salsa4");
            btnMusica5.setText("salsa5");
        }else if (genero.equals("kpop")){
            btnMusica1.setText("kpop1");
            btnMusica2.setText("kpop2");
            btnMusica3.setText("kpop3");
            btnMusica4.setText("kpop4");
            btnMusica5.setText("kpop5");
        }

        btnMusica1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reproductor = new Intent(Canciones.this, Reproductor.class);
                reproductor.putExtra("genero",genero);
                reproductor.putExtra("posicion","0");
                startActivity(reproductor);
            }
        });

        btnMusica2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reproductor = new Intent(Canciones.this, Reproductor.class);
                reproductor.putExtra("genero",genero);
                reproductor.putExtra("posicion","1");
                startActivity(reproductor);
            }
        });
        btnMusica3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reproductor = new Intent(Canciones.this, Reproductor.class);
                reproductor.putExtra("genero",genero);
                reproductor.putExtra("posicion","2");
                startActivity(reproductor);
            }
        });
        btnMusica4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reproductor = new Intent(Canciones.this, Reproductor.class);
                reproductor.putExtra("genero",genero);
                reproductor.putExtra("posicion","3");
                startActivity(reproductor);
            }
        });
        btnMusica5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reproductor = new Intent(Canciones.this, Reproductor.class);
                reproductor.putExtra("genero",genero);
                reproductor.putExtra("posicion","4");
                startActivity(reproductor);
            }
        });

    }
}