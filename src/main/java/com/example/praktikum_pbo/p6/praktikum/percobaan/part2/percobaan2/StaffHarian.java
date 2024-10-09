package com.example.praktikum_pbo.p6.praktikum.percobaan.part2.percobaan2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StaffHarian extends Staff {
    private int jmlJamKerja;

    public StaffHarian(String nama, String alamat, String jk, int umur,
                       int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }

    @Override
    public String toString() {
        return strBlock()
                + super.toString()
                + "\njumlah jam kerja  :  " + jmlJamKerja
                + "\ngaji bersih       :  " + (getGaji() + getLembur()
                - getPotongan());
    }

    public String strBlock() {
        return """
                \n
                ---------------------------------------------
                |             Data Staff Harian             |
                ---------------------------------------------""";
    }
}
