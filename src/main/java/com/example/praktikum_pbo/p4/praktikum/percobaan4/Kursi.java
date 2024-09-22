package com.example.praktikum_pbo.p4.praktikum.percobaan4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
        this.penumpang = null;
    }

    public String info() {
        var info = "\nNomor kursi   : " + nomor;
        if (penumpang != null) {
            info += ", " + penumpang.info();
        } else {
            info += ", Kursi kosong";
        }
        return info;
    }
}
