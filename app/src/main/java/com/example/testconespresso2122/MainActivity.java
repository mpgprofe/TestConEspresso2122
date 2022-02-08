package com.example.testconespresso2122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button reset, cambiar, aceptar;
EditText textoOriginal;
TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.button);
        cambiar = findViewById(R.id.buttonCambiar);
        aceptar = findViewById(R.id.buttonAceptar);
        resultado = findViewById(R.id.textViewResultado);
        textoOriginal = findViewById(R.id.editTextOriginal);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoOriginal.setText("Limpiado");
            }
        });
        cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(textoOriginal.getText());
            }
        });

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("texto", textoOriginal.getText().toString());
                startActivity(intent);
            }
        });
    }
}