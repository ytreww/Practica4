package com.uabc.lsc.a01128619.practica4;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    long timeWhenStopped = 0;
    Button btn_Inicio;
    Button btn_Parar;
    Button btn_Vuelta;
    ListView lista;
    String[] header = {"Numero\t","Inicio\t","Fin"};
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Chronometer myCrom;

        myCrom=(Chronometer)findViewById(R.id.chronometer3);
        btn_Inicio=(Button)findViewById((R.id.buttonInicio));
        btn_Parar=(Button)findViewById(R.id.buttonPausa);
        btn_Vuelta=(Button)findViewById(R.id.buttonVuelta);
        lista=(ListView)findViewById(R.id.listView);


        btn_Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCrom.setBase(SystemClock.elapsedRealtime()+timeWhenStopped);
                myCrom.start();
                btn_Inicio.setVisibility(View.INVISIBLE);
                btn_Parar.setVisibility(View.VISIBLE);
                btn_Vuelta.setVisibility(View.VISIBLE);
            }
        });


    }
}
