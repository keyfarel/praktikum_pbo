package com.example.praktikum_pbo.p6.praktikum.percobaan.part2.percobaan1;

public class Main {
    public static void main(String[] args) {
        var m = new Manager();
        m.setNama("Vivin");
        m.setAlamat("Jl. Vinolia");
        m.setUmur(25);
        m.setJk("Perempuan");
        m.setGaji(3000000);
        m.setTunjangan(1000000);
        System.out.println(m);
        System.out.println();

        var s = new Staff();
        s.setNama("Lestari");
        s.setAlamat("Malang");
        s.setUmur(25);
        s.setJk("Perempuan");
        s.setGaji(2000000);
        s.setLembur(500000);
        s.setPotongan(250000);
        System.out.println(s);
    }
}
