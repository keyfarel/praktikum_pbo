package com.example.praktikum_pbo.P_005_kuis_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Fakultas {
    private String namaFakultas;
    private int jumlahMahasiswa;
    private String dekan;

    public void cetakFakultas() {
        System.out.println("Nama Fakultas: " + namaFakultas);
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        System.out.println("Dekan: " + dekan);
    }
}
