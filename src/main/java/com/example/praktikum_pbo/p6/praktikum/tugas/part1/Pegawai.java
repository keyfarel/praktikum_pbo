package com.example.praktikum_pbo.p6.praktikum.tugas.part1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;

    public int getGaji() {
        return 0;
    }
}
