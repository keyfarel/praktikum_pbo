package com.example.praktikum_pbo.P_004.praktikum.percobaan2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari)
                + sopir.hitungBiayaSopir(hari);
    }
}
