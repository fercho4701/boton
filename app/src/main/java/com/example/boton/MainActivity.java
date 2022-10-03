package com.example.boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView tv1;




    Button suma,resta,multiplica,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma= (Button) findViewById(R.id.suma);
        resta= (Button) findViewById(R.id.resta);
        multiplica= (Button) findViewById(R.id.multiplica);
        divide= (Button) findViewById(R.id.divide);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                et1=findViewById(R.id.et1);
                et2=findViewById(R.id.et2);
                tv1=findViewById(R.id.tv1);




                String valor1 = et1.getText().toString();
                String valor2 = et2.getText().toString();
                int nro1 = Integer.parseInt(valor1);
                int nro2 = Integer.parseInt(valor2);
                int suma = nro1 + nro2;
                String resu = String.valueOf(suma);
                tv1.setText(resu);




            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                et1=findViewById(R.id.et1);
                et2=findViewById(R.id.et2);
                tv1=findViewById(R.id.tv1);




                String valor1 = et1.getText().toString();
                String valor2 = et2.getText().toString();
                int nro1 = Integer.parseInt(valor1);
                int nro2 = Integer.parseInt(valor2);
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                tv1.setText(resu);




            }
        });

       multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                et1=findViewById(R.id.et1);
                et2=findViewById(R.id.et2);
                tv1=findViewById(R.id.tv1);




                String valor1 = et1.getText().toString();
                String valor2 = et2.getText().toString();
                int nro1 = Integer.parseInt(valor1);
                int nro2 = Integer.parseInt(valor2);
                int multiplica = nro1 * nro2;
                String resu = String.valueOf(multiplica);
                tv1.setText(resu);




            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                et1=findViewById(R.id.et1);
                et2=findViewById(R.id.et2);
                tv1=findViewById(R.id.tv1);




                String valor1 = et1.getText().toString();
                String valor2 = et2.getText().toString();
                double nro1 = Integer.parseInt(valor1);
                double nro2 = Integer.parseInt(valor2);
                double divide = nro1 / nro2;
                String resu = String.valueOf(divide);
                tv1.setText(resu);

            }
        });


    }
}