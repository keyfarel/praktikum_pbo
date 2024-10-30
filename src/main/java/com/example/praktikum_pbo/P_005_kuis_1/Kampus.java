package com.example.praktikum_pbo.P_005_kuis_1;

import java.util.ArrayList;
import java.util.List;

public class Kampus {
    private String namaKampus;
    private String lokasiKampus;
    private String akreditasi;
    private List<Fakultas> fakultasList;

    public Kampus(String namaKampus, String lokasiKampus, String akreditasi) {
        this.namaKampus = namaKampus;
        this.lokasiKampus = lokasiKampus;
        this.akreditasi = akreditasi;
        this.fakultasList = new ArrayList<>();
    }

    public void tambahFakultas(Fakultas fakultas) {
        fakultasList.add(fakultas);
    }

    public void cetakProfil() {
        System.out.println("Nama Kampus: " + namaKampus);
        System.out.println("Lokasi: " + lokasiKampus);
        System.out.println("Akreditasi: " + akreditasi);
        System.out.println("Daftar Fakultas:");
        for (Fakultas fakultas : fakultasList) {
            fakultas.cetakFakultas();
            System.out.println("------------------------");
        }
    }
}
