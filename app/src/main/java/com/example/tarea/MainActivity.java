package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Animation topAnimation,bottonAnimation,leftAnimation,rightAnimation;
    ImageView img, nombre, apellido;
//    TextView titulo1,titulo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animacion
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnimation = AnimationUtils.loadAnimation(this,R.anim.botton_animation);
        leftAnimation = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightAnimation = AnimationUtils.loadAnimation(this,R.anim.right_animation);

        //Variables
        img = findViewById(R.id.imgTigre);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);
//        titulo1 = findViewById(R.id.txtTitulo1);
//        titulo2 = findViewById(R.id.txtTitulo2);

        //Animar
        img.setAnimation(bottonAnimation);
        nombre.setAnimation(topAnimation);
        apellido.setAnimation(topAnimation);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea,2000);
    }
}