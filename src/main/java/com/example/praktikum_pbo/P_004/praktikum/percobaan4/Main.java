package com.example.praktikum_pbo.P_004.praktikum.percobaan4;

public class Main {
    public static void main(String[] args) {
        var p = new Penumpang("12345", "Mr. Krab");
        var g = new Gerbong("A", 10);
        g.setPenumpang(p, 1);

        System.out.println(g.info());
        System.out.println();

        g.setPenumpang(new Penumpang("12212", "Budi"), 1);
        System.out.println(g.info());
    }
}
