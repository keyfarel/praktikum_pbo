package com.example.praktikum_pbo.P_004.praktikum.percobaan2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Sopir {
    private String nama;
    private int biaya;

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
