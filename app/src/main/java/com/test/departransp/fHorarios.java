package com.test.departransp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class fHorarios extends AppCompatActivity implements View.OnClickListener{
    //TODO Agregar Toolbar o drawer layout para mejor navegacion
    Button btnR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_horarios);

        btnR = (Button) findViewById(R.id.btnR);
        btnR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, fReservaciones.class);
        startActivity(intent);
    }
}
