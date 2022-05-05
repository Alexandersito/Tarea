package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Descripcion extends AppCompatActivity {
    ImageView img;
    TextView txtAnimal,txtDescripcion;

    int posicion;

    String animales [] = new String[10];
    String animalesDescripcion [] = new String[10];
    int animalesImg [] = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        img = findViewById(R.id.imageView);
        txtAnimal = findViewById(R.id.txtNombre);
        txtDescripcion = findViewById(R.id.txtDescripcion);

        //ANIMALES
        animales[0]="Perro";
        animales[1]="Leon";
        animales[2]="Elefante";
        animales[3]="Tigre";
        animales[4]="Mono";
        animales[5]="Gato";
        animales[6]="Tucan";
        animales[7]="Aguila";
        animales[8]="Vaca";
        animales[9]="Hipopotamo";

        //ANIMALES DESCRIPCION
        animalesDescripcion[0]="Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas" +
                "El perro es un animal mamífero y cuadrúpedo que fue domesticado hace unos 10.000 años y que, actualmente, convive con el hombre como una mascota";
        animalesDescripcion[1]="Un león es un animal mamífero originario de África que se caracteriza por su cabeza de gran tamaño (coronada por una melena en el" +
                " caso de los machos), sus dientes fuertes, sus garras y su cola extensa que finaliza en un fleco.";
        animalesDescripcion[2]="Son animales mamíferos, exclusivamente herbívoros cuya característica principal –además del gran tamaño– es su larga trompa y sus" +
                " enormes orejas. Se organizan en manadas de unos 20 miembros, miden casi 4 metros, pesan más de 6.000 kilos.";
        animalesDescripcion[3]="Es un animal solitario y territorial que generalmente suele habitar bosques densos, pero también áreas abiertas, como sabanas. Normalmente, " +
                "el tigre caza animales de tamaño medio o grande, generalmente ungulados.";
        animalesDescripcion[4]="Se llama mono a un animal mamífero y primate, que acompaña al ser humano en su clasificación zoológica (taxón) y se le asemeja física y conductualmente" +
                " más que cualquier otro animal del mundo. Es pariente cercanos de nuestra especie.";
        animalesDescripcion[5]="Mamífero de la familia de los félidos , digitígrado , doméstico , de unos 50 cm de largo desde la cabeza hasta el arranque de la cola , que por sí sola mide unos " +
                "20 cm, de cabeza redonda , lengua muy áspera , patas cortas y generalmente pelaje suave y espeso.";
        animalesDescripcion[6]="Los tucanes son aves de plumas y pico de colores muy llamativos. Miden 65 centímetros y pesan de 130 hasta 680 g. Su pico es largo con una longitud aproximada de 20" +
                " cm y alcanzando su talla definitiva después de varios meses.";
        animalesDescripcion[7]="El águila real es un ave de gran tamaño. La hembra es más grande que el macho, ya que puede medir hasta 95 cm de largo y llegar a alcanzar hasta los 5 Kg. de peso, mientras" +
                " el macho puede medir 87 cm. de largo y alcanza un peso de 3 Kg. como máximo.";
        animalesDescripcion[8]="Se trata de un animal mamífero que pertenece a la familia de los bóvidos. La vaca, que forma parte de los artiodáctilos (ya que sus extremidades culminan en una cantidad par" +
                " de dedos), es herbívora.";
        animalesDescripcion[9]="Son animales voluminosos, cuadrúpedos, con cuerpo rechoncho, en forma de barril, y una cabeza grande de boca ancha y morro grueso." +
                " Poseen una piel lisa y sin pelo, que carece de glándulas sebáceas, de modo que fuera del agua se deshidratan con facilidad.";

        //ANIMALES FOTOS
        animalesImg[0]= R.drawable.animal1;
        animalesImg[1]=R.drawable.animal2;
        animalesImg[2]=R.drawable.animal3;
        animalesImg[3]=R.drawable.animal4;
        animalesImg[4]=R.drawable.animal5;
        animalesImg[5]=R.drawable.animal6;
        animalesImg[6]=R.drawable.animal7;
        animalesImg[7]=R.drawable.animal8;
        animalesImg[8]=R.drawable.animal9;
        animalesImg[9]=R.drawable.animal10;

        Bundle bundle = this.getIntent().getExtras();
        posicion = Integer.parseInt(bundle.getString("posicion"));

        //ANIMAL - FOTO - DESCRIPCION DINAMICO
        for (int i=0;i<10;i++){
            if (posicion==i){
                txtAnimal.setText(animales[i]);
                img.setImageResource(animalesImg[i]);
                txtDescripcion.setText(animalesDescripcion[i]);

            }
        }

    }
}