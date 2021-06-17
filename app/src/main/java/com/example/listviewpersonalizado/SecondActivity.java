package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvNombre;
    private ImageView ivPlaneta;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetadetalle);

        tvNombre = (TextView) findViewById(R.id.tvNombrePlaneta);
        ivPlaneta = (ImageView) findViewById(R.id.ivPlaneta);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcionPlaneta);

        Planeta planeta = (Planeta) getIntent().getSerializableExtra("planeta");
        tvNombre.setText(planeta.getNombre());
        ivPlaneta.setImageResource(planeta.getImagen());
        tvDescripcion.setText("DiámetroKm: " + planeta.getDiametroKm() + "\n" +
                "Distancia Promedio al Sol (Km): " + planeta.getDistanciaPromedioAlSolKm() + "\n" +
                "Diámetro Promedio al Sol (UA): " + planeta.getDistanciaPromedioAlSolUA());

    }
}