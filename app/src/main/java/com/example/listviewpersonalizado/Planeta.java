package com.example.listviewpersonalizado;

import java.io.Serializable;

public class Planeta implements Serializable {

    private String nombre;
    private double diametroKm;
    private String distanciaPromedioAlSolKm;
    private double distanciaPromedioAlSolUA;
    private int simbolo;
    private int imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametroKm() {
        return diametroKm;
    }

    public void setDiametroKm(double diametroKm) {
        this.diametroKm = diametroKm;
    }

    public String getDistanciaPromedioAlSolKm() {
        return distanciaPromedioAlSolKm;
    }

    public void setDistanciaPromedioAlSolKm(String distanciaPromedioAlSolKm) {
        this.distanciaPromedioAlSolKm = distanciaPromedioAlSolKm;
    }

    public double getDistanciaPromedioAlSolUA() {
        return distanciaPromedioAlSolUA;
    }

    public void setDistanciaPromedioAlSolUA(double distanciaPromedioAlSolUA) {
        this.distanciaPromedioAlSolUA = distanciaPromedioAlSolUA;
    }

    public int getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

