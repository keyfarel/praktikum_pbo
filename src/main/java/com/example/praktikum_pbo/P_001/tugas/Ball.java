package com.example.praktikum_pbo.P_001.tugas;

public class Ball {
    String type;
    double diameter;

    Ball(String type, double diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    void roll(){
        System.out.println("Ball rolling.");
    }

    void bounce(){
        System.out.println("Ball bouncing.");
    }

    @Override
    public String toString() {
        return "Ball [" +
                "diameter: " + diameter +
                "cm, type: " + type +
                ']';
    }
}
