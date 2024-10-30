package com.example.praktikum_pbo.p1.tugas;

public class BilliardBall extends Ball{
    int number;
    String color;

    BilliardBall(String type, double diameter, int number, String color) {
        super(type, diameter);
        this.number = number;
        this.color = color;
    }

    @Override
    void roll(){
        System.out.println("Ball rolling in the pocket");
    }

    void pocket(){
        System.out.println("The ball is poked");
    }

    @Override
    public String toString() {
        return super.toString().replace("]"
                , "") + ", number: " + number
                + ", color:" + color + "]";

    }
}
