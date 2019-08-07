package com.example.a15fragments_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity
                          implements ListadoFragment.CorreosListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListadoFragment listadoFragment = (ListadoFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentListado);

        listadoFragment.setCorreoListener(this);

    }


    @Override
    public void onCorreoListener(Correo c) {
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle) != null);

        if (hayDetalle) {
            ((DetalleFragment)getSupportFragmentManager()
                    .findFragmentById(R.id.fragmentDetalle)).mostrarDetalle(c.getContenido());
        }
        else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.CONTENIDO, c.getContenido());
            startActivity(i);
        }
    }
}
