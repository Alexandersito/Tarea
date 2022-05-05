package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Reproductor extends AppCompatActivity {

    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    TextView txtGenero;
    int repetir = 2;
    int posicion;
    String genero;
    TextView autor;
    MediaPlayer vectormp [] = new MediaPlayer [5];
    String rock [] = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        autor = findViewById(R.id.tvwAutor);

        txtGenero = findViewById(R.id.txtGenero);

        play_pause = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_repetir);
        iv = (ImageView)findViewById(R.id.imageView);

        Bundle bundle = this.getIntent().getExtras();
        posicion = Integer.parseInt(bundle.getString("posicion"));
        genero = bundle.getString("genero");

        if (genero.equals("bachata")){

            txtGenero.setText("BACHATA");

            vectormp[0] = MediaPlayer.create(this, R.raw.bachata1);
            vectormp[1] = MediaPlayer.create(this, R.raw.bachata2);
            vectormp[2] = MediaPlayer.create(this, R.raw.bachata3);
            vectormp[3] = MediaPlayer.create(this, R.raw.bachata4);
            vectormp[4] = MediaPlayer.create(this, R.raw.bachata5);

        }else if (genero.equals("kpop")){

            txtGenero.setText("KPOP");
            iv.setImageResource(R.drawable.kpop);
            rock[0]="BOF - Introducing";
            rock[1]="Dream High - Ataraxia";
            rock[2]="Where are you - Otuo";
            rock[3]="Because Im Stupid - Yumpio";
            rock[4]="Tell Me Why - Yandi";
            autor.setText(rock[posicion]);
            vectormp[0] = MediaPlayer.create(this, R.raw.kpop1);
            vectormp[1] = MediaPlayer.create(this, R.raw.kpop2);
            vectormp[2] = MediaPlayer.create(this, R.raw.kpop3);
            vectormp[3] = MediaPlayer.create(this, R.raw.kpop4);
            vectormp[4] = MediaPlayer.create(this, R.raw.kpop5);
        }else if (genero.equals("rock")){

            txtGenero.setText("ROCK");
            iv.setImageResource(R.drawable.rock);
            rock[0]="Amorfoda - Bad Bunny";
            rock[1]="Im Okey - Romance";
            rock[2]="Without Me - Halsey";
            rock[3]="Mil Noches - Airbag";
            rock[4]="Cae El Sol - Airbag";
            autor.setText(rock[posicion]);

            vectormp[0] = MediaPlayer.create(this, R.raw.rock1);
            vectormp[1] = MediaPlayer.create(this, R.raw.rock2);
            vectormp[2] = MediaPlayer.create(this, R.raw.rock3);
            vectormp[3] = MediaPlayer.create(this, R.raw.rock4);
            vectormp[4] = MediaPlayer.create(this, R.raw.rock5);
        }else if (genero.equals("pop")){

            txtGenero.setText("POP");

            vectormp[0] = MediaPlayer.create(this, R.raw.pop1);
            vectormp[1] = MediaPlayer.create(this, R.raw.pop2);
            vectormp[2] = MediaPlayer.create(this, R.raw.pop3);
            vectormp[3] = MediaPlayer.create(this, R.raw.pop4);
            vectormp[4] = MediaPlayer.create(this, R.raw.pop5);
        }else if (genero.equals("salsa")){

            txtGenero.setText("SALSA");

            vectormp[0] = MediaPlayer.create(this, R.raw.salsa1);
            vectormp[1] = MediaPlayer.create(this, R.raw.salsa2);
            vectormp[2] = MediaPlayer.create(this, R.raw.salsa3);
            vectormp[3] = MediaPlayer.create(this, R.raw.salsa4);
            vectormp[4] = MediaPlayer.create(this, R.raw.salsa5);
        }

    }

    //Método para el botón PlayPause
    public void PlayPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {
            vectormp[posicion].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    //Método para el botón Stop
    public void Stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            if (genero.equals("bachata")){
                vectormp[0] = MediaPlayer.create(this, R.raw.bachata1);
                vectormp[1] = MediaPlayer.create(this, R.raw.bachata2);
                vectormp[2] = MediaPlayer.create(this, R.raw.bachata3);
                vectormp[3] = MediaPlayer.create(this, R.raw.bachata4);
                vectormp[4] = MediaPlayer.create(this, R.raw.bachata5);
            }else if (genero.equals("kpop")){
                vectormp[0] = MediaPlayer.create(this, R.raw.kpop1);
                vectormp[1] = MediaPlayer.create(this, R.raw.kpop2);
                vectormp[2] = MediaPlayer.create(this, R.raw.kpop3);
                vectormp[3] = MediaPlayer.create(this, R.raw.kpop4);
                vectormp[4] = MediaPlayer.create(this, R.raw.kpop5);
            }else if (genero.equals("rock")){
                vectormp[0] = MediaPlayer.create(this, R.raw.rock1);
                vectormp[1] = MediaPlayer.create(this, R.raw.rock2);
                vectormp[2] = MediaPlayer.create(this, R.raw.rock3);
                vectormp[3] = MediaPlayer.create(this, R.raw.rock4);
                vectormp[4] = MediaPlayer.create(this, R.raw.rock5);
            }else if (genero.equals("pop")){
                vectormp[0] = MediaPlayer.create(this, R.raw.pop1);
                vectormp[1] = MediaPlayer.create(this, R.raw.pop2);
                vectormp[2] = MediaPlayer.create(this, R.raw.pop3);
                vectormp[3] = MediaPlayer.create(this, R.raw.pop4);
                vectormp[4] = MediaPlayer.create(this, R.raw.pop5);
            }else if (genero.equals("salsa")){
                vectormp[0] = MediaPlayer.create(this, R.raw.salsa1);
                vectormp[1] = MediaPlayer.create(this, R.raw.salsa2);
                vectormp[2] = MediaPlayer.create(this, R.raw.salsa3);
                vectormp[3] = MediaPlayer.create(this, R.raw.salsa4);
                vectormp[4] = MediaPlayer.create(this, R.raw.salsa5);
            }
            posicion = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.txt);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    //Método repetir una pista
    public void Repetir(View view){
        if(repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        } else {
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }
    }

    //Método para saltar a la siguiente canción.
    public void Siguiente(View view){
        if(posicion < vectormp.length -1){

            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                autor.setText(rock[posicion]);
//                if(posicion == 0){
//                    iv.setImageResource(R.drawable.eunel);
//                } else if(posicion == 1){
//                    iv.setImageResource(R.drawable.romeo);
//                }else if(posicion == 2){
//                    iv.setImageResource(R.drawable.romeos);
//                }else if(posicion == 3){
//                    iv.setImageResource(R.drawable.prince);
//                }else if(posicion == 4){
//                    iv.setImageResource(R.drawable.enrique);
//                }

            } else {
                posicion++;

                autor.setText(rock[posicion]);
//                if(posicion == 0){
//                    iv.setImageResource(R.drawable.eunel);
//                } else if(posicion == 1){
//                    iv.setImageResource(R.drawable.romeo);
//                }else if(posicion == 2){
//                    iv.setImageResource(R.drawable.romeos);
//                }else if(posicion == 3){
//                    iv.setImageResource(R.drawable.prince);
//                }else if(posicion == 4){
//                    iv.setImageResource(R.drawable.enrique);
//                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }


    //Método para regresar a la canción anterior
    public void Anterior(View view){
        if(posicion >= 1){

            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                if (genero.equals("bachata")){
                    vectormp[0] = MediaPlayer.create(this, R.raw.bachata1);
                    vectormp[1] = MediaPlayer.create(this, R.raw.bachata2);
                    vectormp[2] = MediaPlayer.create(this, R.raw.bachata3);
                    vectormp[3] = MediaPlayer.create(this, R.raw.bachata4);
                    vectormp[4] = MediaPlayer.create(this, R.raw.bachata5);
                }else if (genero.equals("kpop")){
                    vectormp[0] = MediaPlayer.create(this, R.raw.kpop1);
                    vectormp[1] = MediaPlayer.create(this, R.raw.kpop2);
                    vectormp[2] = MediaPlayer.create(this, R.raw.kpop3);
                    vectormp[3] = MediaPlayer.create(this, R.raw.kpop4);
                    vectormp[4] = MediaPlayer.create(this, R.raw.kpop5);
                }else if (genero.equals("rock")){
                    vectormp[0] = MediaPlayer.create(this, R.raw.rock1);
                    vectormp[1] = MediaPlayer.create(this, R.raw.rock2);
                    vectormp[2] = MediaPlayer.create(this, R.raw.rock3);
                    vectormp[3] = MediaPlayer.create(this, R.raw.rock4);
                    vectormp[4] = MediaPlayer.create(this, R.raw.rock5);
                }else if (genero.equals("pop")){
                    vectormp[0] = MediaPlayer.create(this, R.raw.pop1);
                    vectormp[1] = MediaPlayer.create(this, R.raw.pop2);
                    vectormp[2] = MediaPlayer.create(this, R.raw.pop3);
                    vectormp[3] = MediaPlayer.create(this, R.raw.pop4);
                    vectormp[4] = MediaPlayer.create(this, R.raw.pop5);
                }else if (genero.equals("salsa")){
                    vectormp[0] = MediaPlayer.create(this, R.raw.salsa1);
                    vectormp[1] = MediaPlayer.create(this, R.raw.salsa2);
                    vectormp[2] = MediaPlayer.create(this, R.raw.salsa3);
                    vectormp[3] = MediaPlayer.create(this, R.raw.salsa4);
                    vectormp[4] = MediaPlayer.create(this, R.raw.salsa5);
                }
                posicion--;

                autor.setText(rock[posicion]);
//                if(posicion == 0){
//                    iv.setImageResource(R.drawable.eunel);
//                } else if(posicion == 1){
//                    iv.setImageResource(R.drawable.romeo);
//                }else if(posicion == 2){
//                    iv.setImageResource(R.drawable.romeos);
//                }else if(posicion == 3){
//                    iv.setImageResource(R.drawable.prince);
//                }else if(posicion == 4){
//                    iv.setImageResource(R.drawable.enrique);
//                }

                vectormp[posicion].start();

            } else {
                posicion--;

                autor.setText(rock[posicion]);
//                if(posicion == 0){
//                    iv.setImageResource(R.drawable.eunel);
//                } else if(posicion == 1){
//                    iv.setImageResource(R.drawable.romeo);
//                }else if(posicion == 2){
//                    iv.setImageResource(R.drawable.romeos);
//                }else if(posicion == 3){
//                    iv.setImageResource(R.drawable.prince);
//                }else if(posicion == 4){
//                    iv.setImageResource(R.drawable.enrique);
//                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }
}