package com.example.praktikum_pbo.P_004.praktikum.percobaan3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    @Override
    public String toString() {
        return "Kereta Api ["
                + "nama: " + nama
                + ", kelas: " + kelas
                + "\nmasinis: " + masinis
                + "\nasisten: " + asisten
                + ']';
    }
}
