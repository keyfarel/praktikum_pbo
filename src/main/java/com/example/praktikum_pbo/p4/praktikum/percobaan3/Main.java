package com.example.praktikum_pbo.p4.praktikum.percobaan3;

public class Main {
    public static void main(String[] args) {
        var masinis = new Pegawai("1234", "Spongebob Squarepants");
        var asisten = new Pegawai("1234", "Patrick Star");
        var keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi);
        System.out.println();

        var masinis2 = new Pegawai("1234", "Spongebob Squarepants");
        var keretaApi2 = new KeretaApi("Gaya Baru", "Bisnis", masinis2);
        System.out.println(keretaApi2);
    }
}
