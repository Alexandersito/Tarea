package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Presentacion extends AppCompatActivity {
    Animation presentacionAnimation;
    ImageView imgPresentacion;

    int posicion;
    String animal;
    int animales [] =new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        //ANIMALES IN ARRAY
        animales[0]=R.drawable.present1;
        animales[1]=R.drawable.present2;
        animales[2]=R.drawable.present3;
        animales[3]=R.drawable.present4;
        animales[4]=R.drawable.present5;
        animales[5]=R.drawable.present6;
        animales[6]=R.drawable.present7;
        animales[7]=R.drawable.present8;
        animales[8]=R.drawable.present9;
        animales[9]=R.drawable.present10;

        Bundle bundle = this.getIntent().getExtras();
        posicion = Integer.parseInt(bundle.getString("posicion"));
        animal = bundle.getString("animal");
        imgPresentacion = findViewById(R.id.imgPresentacion);

        //IMAGEN DINAMICA
        for (int i=0;i<10;i++){
            if (posicion==i){
                imgPresentacion.setImageResource(animales[i]);
            }
        }

        //Animacion
        presentacionAnimation = AnimationUtils.loadAnimation(this,R.anim.presentacion_animation);

        //Animar
        imgPresentacion.setAnimation(presentacionAnimation);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Presentacion.this, Descripcion.class);
                intent.putExtra("posicion",String.valueOf(posicion));
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea,1720);
    }
}