package com.example.praktikum_pbo.p6.teori.hierarchichal;

import com.example.praktikum_pbo.p6.teori.hybrid.Animal;

public class Mammals extends Animal {

    private final String furColor;

    public Mammals(String nama, int age, String furColor) {
        super(nama, age);
        this.furColor = furColor;
    }

    public void nurse() {
        System.out.println(getClass().getSimpleName()
                + " Nursing a kitten...");
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", furColor: " + furColor
                + ']';
    }
}
