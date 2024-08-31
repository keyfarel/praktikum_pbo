package com.example.praktikum_pbo.p1.tugas;

public class SancaSnake extends Snake{
    boolean venomous;
    String skinColor;

    public SancaSnake(String name, double length, boolean venomous, String skinColor) {
        super(name, length);
        this.venomous = venomous;
        this.skinColor = skinColor;
    }

    @Override
    void move(){
        super.move();
    }

    void constrictPrey(){
if (venomous){
    System.out.println("The snake are constrict prey");
}else {
    System.out.println("The snake are safely constrict prey");
}
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", skinColor: " + skinColor + ", venomous: "
                + venomous + ']';
    }
}