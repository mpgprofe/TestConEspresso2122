package com.example.testconespresso2122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tvNuevo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle datosDeEntrada = getIntent().getExtras();

        String texto = datosDeEntrada.getString("texto");
        tvNuevo = findViewById(R.id.textViewNuevo);

        tvNuevo.setText(texto);


    }
}