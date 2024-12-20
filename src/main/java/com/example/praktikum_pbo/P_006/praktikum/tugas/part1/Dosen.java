package com.example.praktikum_pbo.P_006.praktikum.tugas.part1;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
