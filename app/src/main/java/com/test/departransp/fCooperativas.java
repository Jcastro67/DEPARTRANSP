package com.test.departransp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class fCooperativas extends AppCompatActivity {
    //TODO Agregar Toolbar o drawer layout para mejor navegacion
    Spinner lista;
    String[] cooperativas = {"Escoja su opcion","cotrexma","cocibolca","union","Conductores Unidos","Masaya","Halo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_cooperativas);

        lista = (Spinner) findViewById(R.id.spCoop);


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,cooperativas);
        lista.setAdapter(adaptador);
    }
}

