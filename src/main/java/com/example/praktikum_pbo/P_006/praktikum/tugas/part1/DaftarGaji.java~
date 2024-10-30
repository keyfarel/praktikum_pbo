package com.example.praktikum_pbo.p6.praktikum.tugas.part1;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index = 0;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        } else {
            System.out.println("Daftar pegawai penuh!");
        }
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println("Nama: " + pegawai.getNama()
                        + ", Gaji: " + pegawai.getGaji());
            }
        }
    }
}
