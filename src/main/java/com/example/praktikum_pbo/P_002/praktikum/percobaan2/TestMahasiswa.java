package com.example.praktikum_pbo.P_002.praktikum.percobaan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama ="Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "2C";
        mhs1.tampilData();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Key";
        mhs2.alamat = "Jl. Candi VI";
        mhs2.kelas = "2C";
        mhs2.tampilData();

        System.out.println();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Farel";
        mhs3.alamat = "Jl. Raya Blitar";
        mhs3.kelas = "2C";
        mhs3.tampilData();
    }
}
