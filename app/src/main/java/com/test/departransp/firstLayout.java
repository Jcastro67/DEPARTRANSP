package com.test.departransp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class firstLayout extends AppCompatActivity implements View.OnClickListener {
    //TODO Agregar Toolbar o drawer layout para mejor navegacion
    Button btn2;
    Spinner lista1;
    Spinner lista2;
    String[] departamentos = {"Escoja su opcion","Boaco","Carazo","Chinandega","Chontales","Esteli","Granada","Jinotega","Leon","Madriz","Managua","Masaya","Matagalpa","Nueva Segovia","Region Atlantico Norte","Region Atlantico Sur","Rio San Juan","Rivas"};

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
    btn2 = (Button) findViewById(R.id.btnCont);
    btn2.setOnClickListener(this);


        lista1 = (Spinner) findViewById(R.id.spDepart1);
        lista2 = (Spinner) findViewById(R.id.spDepart2);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,departamentos);
        lista1.setAdapter(adaptador);
        lista2.setAdapter(adaptador);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, fHorarios.class);
        startActivity(intent);
    }


}
