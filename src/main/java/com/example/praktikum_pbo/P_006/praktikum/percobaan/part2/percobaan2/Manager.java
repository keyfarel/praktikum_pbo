package com.example.praktikum_pbo.P_006.praktikum.percobaan.part2.percobaan2;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Manager extends Karyawan {
    private int tunjangan;

    @Override
    public String toString() {
        return super.toString()
                + "\nTunjangan    :  " + tunjangan
                + "\nTotal Gaji   :  " + (super.getGaji() + tunjangan);
    }
}
