package com.example.praktikum_pbo.p10.teori.excercise1;

import lombok.Getter;

@Getter
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }
}
