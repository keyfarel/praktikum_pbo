package com.example.praktikum_pbo.P_010.teori.excercise1;

import lombok.Getter;

@Getter
public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
}
