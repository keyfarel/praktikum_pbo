package com.example.praktikum_pbo.P_001.tugas;

public class Snake {
    private String name;
    private double length;

    public Snake(String name, double length) {
        this.name = name;
        this.length = length;
    }

    void move(){
        System.out.println("The " + name + " is slithering");
    }

    void snakeEat(){
        System.out.println("The " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Snake [" +
                "length: " + length +
                ", name: " + name +
                ']';
    }
}
