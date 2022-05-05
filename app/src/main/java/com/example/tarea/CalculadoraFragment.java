package com.example.tarea;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class CalculadoraFragment extends Fragment {

    public CalculadoraFragment() {
        // Required empty public constructor
    }

    //Declarando variables
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnLimpiar, btnResultado, btnBorrar;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView txtVista;
    float numero1=0.0f;
    float numA;
    float numB;
    float numero2=0.0f;
    String operacion ="";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_calculadora, container, false);

        //=========================================================
        //              Asignando botones a las variables
        //=========================================================

        //=================Botones Operaciones=============
        btnSumar = view.findViewById(R.id.btnSumar);
        btnRestar = view.findViewById(R.id.btnRestar);
        btnMultiplicar = view.findViewById(R.id.btnMultiplicar);
        btnDividir = view.findViewById(R.id.btnDividir);
        btnLimpiar = view.findViewById(R.id.btnLimpiar);
        btnResultado = view.findViewById(R.id.btnResultado);
        btnBorrar = view.findViewById(R.id.btnBorrar);

        //=================Botones Numeros=============
        btn0 = view.findViewById(R.id.btn0);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);

        //=================  Textos  =============
        txtVista = view.findViewById(R.id.vista);
        txtVista.setText("0");

        //=========================================================
        //              Asignando metodos a cada boton
        //=========================================================

        //0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("0");
                }else {
                    txtVista.setText(txtVista.getText()+"0");
                }
            }
        });
        //1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("1");
                }else {
                    txtVista.setText(txtVista.getText()+"1");
                }
            }
        });
        //2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("2");
                }else {
                    txtVista.setText(txtVista.getText()+"2");
                }
            }
        });
        //3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("3");
                }else {
                    txtVista.setText(txtVista.getText()+"3");
                }
            }
        });
        //4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("4");
                }else {
                    txtVista.setText(txtVista.getText()+"4");
                }
            }
        });
        //5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("5");
                }else {
                    txtVista.setText(txtVista.getText()+"5");
                }
            }
        });
        //6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("6");
                }else {
                    txtVista.setText(txtVista.getText()+"6");
                }
            }
        });
        //7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("7");
                }else {
                    txtVista.setText(txtVista.getText()+"7");
                }
            }
        });
        //8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("8");
                }else {
                    txtVista.setText(txtVista.getText()+"8");
                }
            }
        });
        //9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1=Float.parseFloat(txtVista.getText().toString());
                if (numero1 == 0.0f){
                    txtVista.setText("9");
                }else {
                    txtVista.setText(txtVista.getText()+"9");
                }
            }
        });

        //=========================================================
        //             Asignando metodos a las operaciones
        //=========================================================

        //Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVista.setText("0");
                numero1=0.0f;
                numero2=0.0f;
                operacion ="";
            }
        });

        //Sumar
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numA=Float.parseFloat(txtVista.getText().toString());
                operacion="+";
                txtVista.setText("0");
            }
        });
        //Restar
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numA=Float.parseFloat(txtVista.getText().toString());
                operacion="-";
                txtVista.setText("0");
            }
        });
        //Multiplicar
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numA=Float.parseFloat(txtVista.getText().toString());
                operacion="*";
                txtVista.setText("0");
            }
        });
        //Dividir
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numA=Float.parseFloat(txtVista.getText().toString());
                operacion="/";
                txtVista.setText("0");
            }
        });

        //Mostrar Resultado Vista
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numB=Float.parseFloat(txtVista.getText().toString());
                if (operacion.equals("+")){
                    float result = numA+numB;
                    txtVista.setText(result+"");

                }else if(operacion.equals("-")){
                    float result = numA-numB;
                    txtVista.setText(result+"");

                }else if(operacion.equals("*")){
                    float result = numA*numB;
                    txtVista.setText(result+"");

                }else if(operacion.equals("/")){
                    if (numB==0.0f){
                        txtVista.setText("");
                    }else {
                        float result = numA/numB;
                        txtVista.setText(result+"");
                    }
                }

                numero1 = 0.0f;
                numero2 = 0.0f;
                numB = 0.0f;
                numA = 0.0f;
                operacion ="";
            }
        });

        return view;
    }

}