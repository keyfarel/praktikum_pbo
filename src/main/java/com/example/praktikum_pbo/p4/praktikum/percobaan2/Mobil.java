package com.example.praktikum_pbo.p4.praktikum.percobaan2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Mobil {
    private String merk;
    private int biaya;

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
