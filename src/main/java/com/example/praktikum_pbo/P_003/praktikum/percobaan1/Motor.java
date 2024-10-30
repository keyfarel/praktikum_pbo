package com.example.praktikum_pbo.P_003.praktikum.percobaan1;

public class Motor {
    private int kecepatan;
    private boolean kontakOn = false;
    private final int MAX_KECEPATAN = 100;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan (){
        if(kontakOn) {
            if (kecepatan + 1 > MAX_KECEPATAN) {
                System.out.println("Kecepatan sudah maksimal!!\n");
            } else {
                kecepatan += 100;
            }
        }else{
                System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");
         }
    }

    public void kurangiKecepatan(){
        if(kontakOn){
            kecepatan -= 5;
        }else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");
        }
    }

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
