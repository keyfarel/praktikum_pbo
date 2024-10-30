package com.example.praktikum_pbo.P_003.praktikum.percobaan3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Anggota {
    private String nama;
    private String alamat;
    private  float simpanan;

    public void setor(float uang){
        simpanan += uang;
    }

    public void pinjam(float uang){
        simpanan -= uang;
    }

    @Override
    public String toString() {
        return "Anggota [" +
                "nama: " + nama
                + ", alamat: " + alamat
                + ", simpanan: Rp " + simpanan +
                ']';
    }
}
