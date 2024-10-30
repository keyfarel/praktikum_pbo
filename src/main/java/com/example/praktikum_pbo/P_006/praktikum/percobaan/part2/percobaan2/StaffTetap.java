package com.example.praktikum_pbo.P_006.praktikum.percobaan.part2.percobaan2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StaffTetap extends Staff {
    private String golongan;
    private int asuransi;

    public StaffTetap(String nama, String alamat, String jk,
                      int umur, int gaji, int lembur, int potongan,
                      String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    @Override
    public String toString() {
        return strBlock()
                + super.toString()
                + "\nasuransi          :  " + asuransi
                + "\ngolongan          :  " + golongan
                + "\ngaji bersih       :  " + (getGaji() + getLembur()
                - getPotongan() - asuransi);
    }

    public String strBlock() {
        return """
                \n
                ------------------------------------------
                |            Data Staff Tetap            |
                ------------------------------------------""";
    }
}
