package com.example.praktikum_pbo.P_009.tugas.overrloading;

public class Main {
    public static void main(String[] args) {
        var segitiga = new Segitiga();

        System.out.println("Sudut ketiga (dari sudut 60 dan 50) :  "
                + segitiga.totalSudut(60, 50));
        System.out.println("Sudut ketiga (dari sudut 70)        :  "
                + segitiga.totalSudut(70));

        System.out.println("Keliling (sisi 3, 4, 5)             :  "
                + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (sisi 3, 4)                :  "
                + segitiga.keliling(3, 4));

    }
}