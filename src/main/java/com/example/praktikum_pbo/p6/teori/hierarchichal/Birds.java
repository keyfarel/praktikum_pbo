package com.example.praktikum_pbo.p6.teori.hierarchichal;

public class Birds extends Animal {

    private final Double wingSpan;
    private final Boolean canFly;

    public Birds(String name, int age, Double wingSpan, Boolean canFly) {
        super(name, age);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println(getClass().getSimpleName()
                    + " can flying...");
        } else {
            System.out.println(getClass().getSimpleName()
                    + " can not flying...");
        }
    }

    public void layEggs() {
        System.out.println("lay Egg...");
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", wing span: " + wingSpan
                + ", can fly: " + canFly
                + ']';
    }

}
