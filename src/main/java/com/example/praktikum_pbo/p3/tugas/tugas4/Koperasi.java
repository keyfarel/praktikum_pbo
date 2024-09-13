package com.example.praktikum_pbo.p3.tugas.tugas4;

import java.util.Scanner;

public class Koperasi {

    private Anggota anggota;

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(templateMenu());
            System.out.print("Pilihan anda: ");
            int masuk = sc.nextInt();
            sc.nextLine();
            
            switch (masuk){
                case 1 -> subMenu(sc);
                case 0 ->{
                    System.out.println("Keluar dari aplikasi.");
                    System.exit(0);
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private void subMenu(Scanner sc) {
        while (true) {
            System.out.println(pilihanMenu());
            System.out.print("Pilihan anda: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> angsur(sc);
                case 2 -> pinjam(sc);
                case 3 -> tampilData();
                case 0 -> {
                    System.out.println("Kembali ke menu utama.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid."
                        + " Silakan coba lagi.");
            }
        }
    }

    private void angsur(Scanner sc) {
        if (anggota == null) {
            System.out.println("Anda belum membuat akun pinjaman."
                    + " Silakan pilih menu pinjam terlebih dahulu.");
            return;
        }
        System.out.print("Masukkan jumlah angsuran: ");
        int angsuran = sc.nextInt();
        sc.nextLine();
        anggota.angsur(angsuran);
    }

    private void pinjam(Scanner sc) {
        System.out.print("Masukkan nama anda: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan no KTP anda: ");
        String noKtp = sc.nextLine();

        System.out.print("Masukkan jumlah limit yang anda inginkan: ");
        int limitPinjaman = sc.nextInt();
        sc.nextLine();

        anggota = new Anggota(noKtp, nama, limitPinjaman);

        System.out.print("Masukkan jumlah pinjaman: ");
        int pinjaman = sc.nextInt();
        sc.nextLine();
        anggota.pinjam(pinjaman);
    }

    public String templateMenu() {
        return """
                Silahkan Pilih Menu
                1. Masuk ke aplikasi
                0. Keluar""";
    }

    public String pilihanMenu() {
        return """
                \nSilahkan pilih menu
                1. Angsur
                2. Pinjam
                3. Tampil Data
                0. Kembali ke menu utama""";
    }

    public void tampilData() {
        if (anggota == null) {
            System.out.println("Data anggota belum tersedia."
                    + " Silakan pilih menu pinjam terlebih dahulu.");
            return;
        }

        System.out.println("\nData Anggota");
        System.out.printf("Nama: %s%n", anggota.getName());
        System.out.printf("No KTP: %s%n", anggota.getNoKtp());
        System.out.printf("Limit Pinjaman: Rp %,d%n", anggota.getLimitPinjaman());
        System.out.printf("Jumlah Pinjaman Saat Ini: Rp %,d%n", anggota.getJumlahPinjaman());
        System.out.println();
    }

}
