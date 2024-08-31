package com.example.praktikum_pbo.p1.praktikum.sepeda_demo;

public class SepedaGunung extends Sepeda {
    private String typeSuspensi;

    public void setTypeSuspensi(String newValue) {
        this.typeSuspensi = newValue;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", type suspensi: " + typeSuspensi + "]";
    }
}