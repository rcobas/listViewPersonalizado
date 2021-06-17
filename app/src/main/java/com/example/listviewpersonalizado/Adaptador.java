package com.example.listviewpersonalizado;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context miContexto;
    private ArrayList<Planeta> miLista;

    public Adaptador(Context miContexto, ArrayList<Planeta> miLista) {
        this.miContexto = miContexto;
        this.miLista = miLista;
    }

    @Override
    public int getCount() {
        return miLista.size();
    }

    @Override
    public Object getItem(int i) {
        return miLista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return miLista.get(i).getSimbolo();
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(miContexto);
        view = layoutInflater.inflate(R.layout.item, null);

        TextView nombre = (TextView) view.findViewById(R.id.tvNombre);
        ImageView simbolo = (ImageView) view.findViewById(R.id.ivSimbolo);
        ImageView imagen = (ImageView) view.findViewById(R.id.ivImagen);

        nombre.setText(miLista.get(i).getNombre());
        simbolo.setImageResource(miLista.get(i).getSimbolo());
        imagen.setImageResource(miLista.get(i).getImagen());
        return view;
    }
}
