package com.example.praktikum_pbo.p6.teori.hybrid;

public class Cat extends Mammals {
    private final String breed;

    public Cat(String nama, int age, String furColor, String breed) {
        super(nama, age, furColor);
        this.breed = breed;
    }


    public void meow() {
        System.out.println(getClass().getSimpleName()
                + " Meowing...");
    }

    public void scratch() {
        System.out.println(getClass().getSimpleName()
                + " Scratching...");
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", breed: " + breed
                + ']';
    }
}
