package com.example.praktikum_pbo.p9.tugas.overriding;

public class Main {
    public static void main(String[] args) {
        var dosen = new Dosen();
        var mahasiswa = new Mahasiswa();

        dosen.bernafas();
        System.out.println();

        dosen.makan();
        dosen.lembur();

        System.out.println();
        mahasiswa.bernafas();

        System.out.println();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}