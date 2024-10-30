package com.example.praktikum_pbo.P_009.tugas.overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur.");
    }
}
