package com.example.calculadoraejercicio4m4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Se conecta xml con Java por medio de findViewById
        TextView rst1= findViewById(R.id.Rst1);
        TextView editText1= findViewById(R.id.edit1);
        TextView editText2= findViewById(R.id.edit2);
        TextView rst2= findViewById(R.id.Rst2);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);

        // Proceso Principal

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE PRIMER VALOR",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                else {

                    String num2 = editText2.getText().toString();
                    if(editText2.getText().toString().isEmpty()){
                        Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE SEGUNDO VALOR",Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                        mytoast.show();
                    }
                    else {

                        int resul = Integer.parseInt(num1)+Integer.parseInt(num2);
                        rst2.setText("Resultado : "+resul);
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE PRIMER VALOR",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                else {

                    String num2 = editText2.getText().toString();
                    if(editText2.getText().toString().isEmpty()){
                        Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE SEGUNDO VALOR",Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                        mytoast.show();
                    }
                    else {

                        int resul = Integer.parseInt(num1)-Integer.parseInt(num2);
                        rst2.setText("Resultado : "+resul);
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE PRIMER VALOR",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                else {

                    String num2 = editText2.getText().toString();
                    if(editText2.getText().toString().isEmpty()){
                        Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE SEGUNDO VALOR",Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                        mytoast.show();
                    }
                    else {

                        int resul = Integer.parseInt(num1)/Integer.parseInt(num2);
                        rst2.setText("Resultado : "+resul);
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = editText1.getText().toString();
                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE PRIMER VALOR",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                else {

                    String num2 = editText2.getText().toString();
                    if(editText2.getText().toString().isEmpty()){
                        Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE SEGUNDO VALOR",Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                        mytoast.show();
                    }
                    else {

                        int resul = Integer.parseInt(num1)*Integer.parseInt(num2);
                        rst2.setText("Resultado : "+resul);
                        editText1.setText("");
                        editText2.setText("");
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}