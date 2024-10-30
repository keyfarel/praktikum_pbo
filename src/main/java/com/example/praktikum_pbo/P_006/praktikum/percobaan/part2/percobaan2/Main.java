package com.example.praktikum_pbo.P_006.praktikum.percobaan.part2.percobaan2;

public class Main {
    public static void main(String[] args) {
        var st = new StaffTetap("Budi", "Malang",
                "Laki-Laki", 20, 2000000, 250000,
                200000, "2A", 100000);
        System.out.println(st);

        var sh = new StaffHarian("Indah", "Malang",
                "Perempuan", 27, 10000, 100000,
                50000, 100);
        System.out.println(sh);
    }
}
