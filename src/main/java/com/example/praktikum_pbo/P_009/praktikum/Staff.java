package com.example.praktikum_pbo.P_009.praktikum;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    @Override
    public double getGaji() {
        return getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP         :  " + this.getNip());
        System.out.println("Nama        :  " + this.getNama());
        System.out.println("Golongan    :  " + this.getGolongan());
        System.out.println("Jml Lembur  :  " + this.getLembur());
        System.out.println("Gaji Lembur :  " + this.getGajiLembur());
        System.out.println("Gaji Total  :  " + this.getGaji());
    }
}
