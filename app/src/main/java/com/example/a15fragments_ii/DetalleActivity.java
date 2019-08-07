package com.example.a15fragments_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetalleActivity extends AppCompatActivity {

    public static final String CONTENIDO = "CONTENIDO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        DetalleFragment detalle = (DetalleFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle);

        detalle.mostrarDetalle(getIntent().getStringExtra(CONTENIDO));
    }
}
