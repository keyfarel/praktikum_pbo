package com.example.praktikum_pbo.P_004.praktikum.percobaan3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pegawai {
    private String nip;
    private String nama;

    @Override
    public String toString() {
        return  nama + ", nip: " + nip;
    }
}
