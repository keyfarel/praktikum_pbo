package com.example.praktikum_pbo.P_002.tugas.tugas3;

public class Lingkaran {
    public double phi = 3.14 ;
    public double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas(){
        return phi * r * r;
    }

    public double hitungKeliling(){
        return 2 * phi * r;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()
                + " [ r: " + r
                + ", luas: " + String.format("%.2f", hitungLuas())
                + ", keliling: " + String.format("%.2f", hitungKeliling())
                + ']';
    }
}
