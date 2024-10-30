package com.example.praktikum_pbo.P_002.tugas.tugas2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Peminjaman {
    private String id;
    private String namaMember;
    private String namaGame;
    private int hargaPerHari;
    private int lamaSewa;

    public int hitungHargaBayar(){
        return hargaPerHari * lamaSewa;
    }

    public void tampilkanData(){
        String format = "%-15s: %s%n";
        System.out.printf(format, "ID", id);
        System.out.printf(format, "Nama Member", namaMember);
        System.out.printf(format, "Nama Game", namaGame);
        System.out.printf(format, "Harga Per Hari", "Rp " + hargaPerHari);
        System.out.printf(format, "Lama Sewa ", lamaSewa + " Hari");
        System.out.printf(format, "Harga Bayar", "Rp " + hitungHargaBayar());
    }
}
