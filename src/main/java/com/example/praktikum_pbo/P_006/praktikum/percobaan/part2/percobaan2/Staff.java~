package com.example.praktikum_pbo.p6.praktikum.percobaan.part2.percobaan2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Staff extends Karyawan {
    private int lembur;
    private int potongan;

    public Staff(String nama, String alamat, String jk, int umur,
                 int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nlembur            :  " + lembur
                + "\npotongan          :  " + potongan
                + "\nTotal Gaji        :  " + (getGaji() + lembur - potongan);
    }
}
