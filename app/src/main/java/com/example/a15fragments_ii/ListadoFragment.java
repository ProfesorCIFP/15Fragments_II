package com.example.a15fragments_ii;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoFragment extends Fragment {

    private ArrayList<Correo> listaCorreos;
    private ListView lvListado;

    public ListadoFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listaCorreos = creaListaCorreos();

        lvListado = getView().findViewById(R.id.lvListado);

        AdaptadorCorreos adaptadorCorreos = new AdaptadorCorreos(getContext(), listaCorreos);

        lvListado.setAdapter(adaptadorCorreos);
    }

    private ArrayList<Correo> creaListaCorreos () {
        ArrayList<Correo> listaCorreos;

        listaCorreos = new ArrayList<>();

        listaCorreos.add(new Correo("Persona 1", "Asunto 1", "Texto del correo 1"));
        listaCorreos.add(new Correo("Persona 2", "Asunto 2", "Texto del correo 2"));
        listaCorreos.add(new Correo("Persona 3", "Asunto 3", "Texto del correo 3"));
        listaCorreos.add(new Correo("Persona 4", "Asunto 4", "Texto del correo 4"));
        listaCorreos.add(new Correo("Persona 5", "Asunto 5", "Texto del correo 5"));
        listaCorreos.add(new Correo("Persona 6", "Asunto 6", "Texto del correo 6"));
        listaCorreos.add(new Correo("Persona 7", "Asunto 7", "Texto del correo 7"));
        listaCorreos.add(new Correo("Persona 8", "Asunto 8", "Texto del correo 8"));

        return listaCorreos;
    }
}
