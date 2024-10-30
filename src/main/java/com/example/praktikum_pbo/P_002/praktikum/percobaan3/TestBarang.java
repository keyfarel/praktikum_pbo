package com.example.praktikum_pbo.P_002.praktikum.percobaan3;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBarang = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 0;
        brg1.tampilBarang();
        System.out.println("Stok baru adalah: "
                + brg1.tambahStok(20));
    }
}
