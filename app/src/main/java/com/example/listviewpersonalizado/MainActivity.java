package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);


        ArrayList<Planeta> listaPlanetas = new ArrayList<Planeta>();
        Planeta p1 = new Planeta();
        p1.setNombre("Mercurio");
        p1.setDiametroKm(4.879);
        p1.setDistanciaPromedioAlSolKm("57.909.175");
        p1.setDistanciaPromedioAlSolUA(0.387);
        p1.setSimbolo(R.drawable.mercurio_icono);
        p1.setImagen(R.drawable.mercurio);

        Planeta p2 = new Planeta();
        p2.setNombre("Venus");
        p2.setDiametroKm(12103.6);
        p2.setDistanciaPromedioAlSolKm("108.208.930");
        p2.setDistanciaPromedioAlSolUA(0.723332);
        p2.setSimbolo(R.drawable.venus_icono);
        p2.setImagen(R.drawable.venus);

        listaPlanetas.add(p1);
        listaPlanetas.add(p2);

        adaptador = new Adaptador(this, listaPlanetas);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Planeta p = (Planeta) adaptador.getItem(position);
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("planeta", p);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}




