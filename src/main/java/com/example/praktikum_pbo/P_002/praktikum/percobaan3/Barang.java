package com.example.praktikum_pbo.P_002.praktikum.percobaan3;

public class Barang {
    public String namaBarang;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jenis Brg: " + jenisBrg);
        System.out.println("Stok: " + stok);
    }

    public int tambahStok(int barangMasuk){
        int stockMasuk = barangMasuk + stok;
        return stockMasuk;
    }

}
