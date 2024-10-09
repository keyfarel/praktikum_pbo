package com.example.praktikum_pbo.p6.praktikum.tugas.part1;

public class Main {
    public static void main(String[] args) {
        var daftarGaji = new DaftarGaji(2);
        var d1 = new Dosen("001", "Dr. Ahmad", "Jl. Pendidikan 1");
        d1.setSKS(10);
        daftarGaji.addPegawai(d1);

        var d2 = new Dosen("002", "Dr. Tirta", "Jl. Pendidikan 2");
        d2.setSKS(8);
        daftarGaji.addPegawai(d2);
        daftarGaji.printSemuaGaji();
    }
}