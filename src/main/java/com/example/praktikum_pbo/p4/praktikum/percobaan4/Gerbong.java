package com.example.praktikum_pbo.p4.praktikum.percobaan4;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi nomor " + nomor + " sudah ditempati!");
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            System.out.println("Penumpang berhasil duduk di kursi nomor " + nomor);
        }
    }
    public void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String info() {
        var info = "";
        info += "Kode Gerbong  : " + kode ;
        for (Kursi kursi : arrayKursi) {

            info += kursi.info();
        }
        return info;
    }
}
