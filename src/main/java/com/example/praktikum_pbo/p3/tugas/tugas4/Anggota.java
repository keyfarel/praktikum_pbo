package com.example.praktikum_pbo.p3.tugas.tugas4;

import lombok.Getter;

@Getter
public class Anggota {
    private String noKtp;
    private String name;
    private int jumlahPinjaman;
    private int limitPinjaman;

    public Anggota(String noKtp, String name, int limitPinjaman) {
        this.noKtp = noKtp;
        this.name = name;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public void pinjam(int jumlah) {
        if ((jumlahPinjaman + jumlah) > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah){
        if (jumlah >= (0.1 * jumlahPinjaman)){
            jumlahPinjaman -= jumlah;
        }else{
            System.out.println("Maaf, anguran harus 10% dari jumlah pinjaman.");
        }
    }
}
