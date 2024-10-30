package com.example.praktikum_pbo.P_001.tugas;

public class FriedRice extends Food{
    int spicyLevel;
    boolean topping;


    FriedRice(String name, int calories,boolean topping) {
        super(name, calories);
        this.topping = topping;
    }

    void addSpicyLevel(){
        if(spicyLevel <= 0 || spicyLevel > 5){
            spicyLevel ++;
            System.out.println("Spicy level: lv-"+spicyLevel);
        }else {
            System.out.println("Maximum level");
        }
    }

    void addTopping(){
            System.out.println("Topping egg added");
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", Spicy level: " + spicyLevel
                + ", Add Topping: " + topping
                + "]";
    }
}