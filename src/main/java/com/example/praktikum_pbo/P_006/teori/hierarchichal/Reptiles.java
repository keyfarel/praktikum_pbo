package com.example.praktikum_pbo.P_006.teori.hierarchichal;

import com.example.praktikum_pbo.P_006.teori.hybrid.Animal;

public class Reptiles extends Animal {
    private final String scaleType;
    private final String shedSkin;

    public Reptiles(String nama, int age, String scaleType, Boolean shedskin) {
        super(nama, age);
        this.scaleType = scaleType;
        this.shedSkin = shedskin.toString();
    }

    public void crawl() {
        System.out.println(getClass().getSimpleName()
                + " Crawling prey...");
    }

    public void shedSkin() {
        System.out.println(getClass().getSimpleName()
                + " Shed skin...");
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", scaleType: "
                + scaleType
                + ", shedSkin: " + shedSkin
                + ']';
    }
}
