package com.example.praktikum_pbo.P_006.praktikum.percobaan.part2.percobaan1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Karyawan {
    private String nama;
    private String alamat;
    private String jk;
    private int umur;
    private int gaji;

    @Override
    public String toString() {
        return    "nama         :  " + nama
                + "\nalamat       :  " + alamat
                + "\njk           :  " + jk
                + "\numur         :  " + umur
                + "\ngaji         :  " + gaji;
    }
}
