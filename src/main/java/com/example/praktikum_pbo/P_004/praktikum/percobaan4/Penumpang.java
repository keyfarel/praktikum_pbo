package com.example.praktikum_pbo.P_004.praktikum.percobaan4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Penumpang {
    private String ktp;
    private String nama;

    public String info() {
        return "ktp: " + ktp
                + ", nama: " + nama;
    }
}
