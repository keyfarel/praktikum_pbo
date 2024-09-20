package com.example.praktikum_pbo.p4.praktikum.percobaan2;

public class Main {
    public static void main(String[] args) {
        var m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        var s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        var p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya total: "
                + p.hitungBiayaTotal());
    }
}
