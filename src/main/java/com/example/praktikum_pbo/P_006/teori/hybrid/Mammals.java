package com.example.praktikum_pbo.P_006.teori.hybrid;

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
