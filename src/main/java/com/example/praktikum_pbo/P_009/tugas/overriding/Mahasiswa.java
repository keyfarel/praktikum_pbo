package com.example.praktikum_pbo.P_009.tugas.overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur.");
    }
}
