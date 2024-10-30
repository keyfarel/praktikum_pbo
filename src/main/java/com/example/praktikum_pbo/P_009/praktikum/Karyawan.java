package com.example.praktikum_pbo.P_009.praktikum;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setGolongan(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                this.gaji = 3000000;
                break;
            case '3':
                this.gaji = 2000000;
                break;
            case '4':
                this.gaji = 1000000;
                break;
            case '5':
                this.gaji = 750000;
                break;
            default:
                this.gaji = 0;
                break;
        }
    }
}
