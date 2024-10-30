package com.example.praktikum_pbo.P_002.tugas.tugas4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Barang {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar * (1 - diskon));
    }

    public void tampilData() {
        String format = "%-15s: %s%n";
        System.out.printf(format, "Kode", kode);
        System.out.printf(format, "Nama Barang", namaBarang);
        System.out.printf(format, "Harga Dasar", "Rp " + hargaDasar);
        System.out.printf(format, "Diskon", diskon * 100 + "%");
        System.out.printf(format, "Harga Jual", "Rp " + hitungHargaJual());
    }
}
