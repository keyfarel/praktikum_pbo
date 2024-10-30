package com.example.praktikum_pbo.p10.teori.excercise1;

public class Bayaran {
    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();

        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();
        } else if (pg instanceof Programmer) {
            uang += ((Programmer) pg).getBonus();
        }
        return uang;
    }
}
