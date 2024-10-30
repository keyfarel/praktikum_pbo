package com.example.praktikum_pbo.P_010.teori.excercise2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvJadul = (TelevisiJadul) perangkat;
            tvJadul.setModeInput("DVI");
            System.out.println("Nyalakan televisi jadul dengan input: " + tvJadul.getModeInput());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvModern = (TelevisiModern) perangkat;
            tvModern.setModeInput("HDMI");
            System.out.println("Nyalakan televisi modern dengan input: " + tvModern.getModeInput());
        }
        System.out.println("Voltase televisi: " + perangkat.getVoltase());
    }
}
