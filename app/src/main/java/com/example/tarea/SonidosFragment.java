package com.example.tarea;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SonidosFragment extends Fragment {



    public SonidosFragment() {
        // Required empty public constructor
    }

    String genero;
    Button btnMusica1,btnMusica2,btnMusica3,btnMusica4,btnMusica5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_sonidos, container, false);

        btnMusica1 = view.findViewById(R.id.btnMusica1);
        btnMusica2 = view.findViewById(R.id.btnMusica2);
        btnMusica3 = view.findViewById(R.id.btnMusica3);
        btnMusica4 = view.findViewById(R.id.btnMusica4);
        btnMusica5 = view.findViewById(R.id.btnMusica5);

        btnMusica1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canciones = new Intent(view.getContext(), Canciones.class);
                genero="rock";
                canciones.putExtra("genero",genero);
                startActivity(canciones);
            }
        });

        btnMusica2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canciones = new Intent(view.getContext(), Canciones.class);
                genero="pop";
                canciones.putExtra("genero",genero);
                startActivity(canciones);
            }
        });

        btnMusica3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canciones = new Intent(view.getContext(), Canciones.class);
                genero="bachata";
                canciones.putExtra("genero",genero);
                startActivity(canciones);
            }
        });

        btnMusica4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canciones = new Intent(view.getContext(), Canciones.class);
                genero="salsa";
                canciones.putExtra("genero",genero);
                startActivity(canciones);
            }
        });

        btnMusica5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canciones = new Intent(view.getContext(), Canciones.class);
                genero="kpop";
                canciones.putExtra("genero",genero);
                startActivity(canciones);
            }
        });

        return view;
    }
}