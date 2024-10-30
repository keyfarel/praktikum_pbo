package com.example.praktikum_pbo.P_001.praktikum.sepeda_demo;

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