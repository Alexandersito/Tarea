package com.example.tarea;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    Animation topAnimation,bottonAnimation,leftAnimation,rightAnimation;
    ImageButton imgbPerro,imgbLeon,imgbElefante,imgbTigre,imgbMono,imgbGato,imgbTucan,imgbAguila,imgbVaca,imgbHipopotamo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imgbPerro = view.findViewById(R.id.imgbPerro);
        imgbLeon = view.findViewById(R.id.imgbLeon);
        imgbElefante = view.findViewById(R.id.imgbElefante);
        imgbTigre = view.findViewById(R.id.imgbTigre);
        imgbMono = view.findViewById(R.id.imgbMono);
        imgbGato = view.findViewById(R.id.imgbGato);
        imgbTucan = view.findViewById(R.id.imgbTucan);
        imgbAguila = view.findViewById(R.id.imgbAguila);
        imgbVaca = view.findViewById(R.id.imgbVaca);
        imgbHipopotamo = view.findViewById(R.id.imgbHipopotamo);

        //Animacion
        topAnimation = AnimationUtils.loadAnimation(view.getContext(),R.anim.top_animation);
        bottonAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.botton_animation);
        leftAnimation = AnimationUtils.loadAnimation(view.getContext(),R.anim.left_animation);
        rightAnimation = AnimationUtils.loadAnimation(view.getContext(),R.anim.right_animation);

        //Animar
        imgbPerro.setAnimation(rightAnimation);
        imgbLeon.setAnimation(leftAnimation);
        imgbElefante.setAnimation(rightAnimation);
        imgbTigre.setAnimation(leftAnimation);
        imgbMono.setAnimation(rightAnimation);
        imgbGato.setAnimation(leftAnimation);
        imgbTucan.setAnimation(rightAnimation);
        imgbAguila.setAnimation(leftAnimation);
        imgbVaca.setAnimation(rightAnimation);
        imgbHipopotamo.setAnimation(leftAnimation);

        imgbPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","0");
                startActivity(intent);
            }
        });

        imgbLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","1");
                startActivity(intent);
            }
        });

        imgbElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","2");
                startActivity(intent);
            }
        });

        imgbTigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","3");
                startActivity(intent);
            }
        });

        imgbMono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","4");
                startActivity(intent);
            }
        });

        imgbGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","5");
                startActivity(intent);
            }
        });

        imgbTucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","6");
                startActivity(intent);
            }
        });

        imgbAguila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","7");
                startActivity(intent);
            }
        });

        imgbVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","8");
                startActivity(intent);
            }
        });

        imgbHipopotamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Presentacion.class);
                intent.putExtra("posicion","9");
                startActivity(intent);
            }
        });

        return view;
    }
}