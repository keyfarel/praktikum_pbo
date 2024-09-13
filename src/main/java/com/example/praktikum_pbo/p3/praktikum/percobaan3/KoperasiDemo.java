package com.example.praktikum_pbo.p3.praktikum.percobaan3;

public class KoperasiDemo {
    public static void main(String[] args) {
        var anggota1 = new Anggota("Iwan", "Jalan Mawar", 0);
        System.out.println(anggota1);

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println(anggota1);

        anggota1.pinjam(5000);
        System.out.println(anggota1);
    }
}
