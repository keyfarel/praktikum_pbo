package com.example.praktikum_pbo.P_010.teori.excercise1;

public class Main {
    public static void main(String[] args) {
        var man = new Manajer("Agus", 800, 50);
        var prog = new Programmer("Budi", 600, 30);
        var hr = new Bayaran();

        System.out.println("Bayaran manajer     : "+hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer  : "+hr.hitungBayaran(prog));
    }
}
