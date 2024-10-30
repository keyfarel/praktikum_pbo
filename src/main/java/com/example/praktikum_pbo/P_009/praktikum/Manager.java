package com.example.praktikum_pbo.P_009.praktikum;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Manager extends Karyawan {
    private Double tunjangan;
    private String bagian;
    private Staff staff[];

    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }

    public void viewStaff() {
        int i;
        System.out.println("---------------------------------");
        for (i = 0; i < staff.length; i++) {
            staff[i].lihatInfo();
        }
        System.out.println("---------------------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager     :  " + this.getBagian());
        System.out.println("NIP         :  " + this.getNip());
        System.out.println("Nama        :  " + this.getNama());
        System.out.println("Tunjangan   :  " + this.getTunjangan());
        System.out.println("Golongan    :  " + this.getGolongan());
        System.out.println("Gaji Total  :  " + this.getGaji());
        System.out.println("Bagian      :  " + this.getBagian());
    }
}
