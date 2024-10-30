package com.example.praktikum_pbo.P_001.tugas;

public class Coffee extends Drink{
    String coffeeType;
    int sugarAmount;


    Coffee(String name, int volume, String coffeeType, int sugarAmount) {
        super(name, volume);
        this.coffeeType = coffeeType;
        this.sugarAmount = sugarAmount;
    }

    @Override
    void drinking(){
        volume -= 10;
        super.drinking();
    }

    void addSugar(){
        sugarAmount += 5;
        System.out.println("Adding sugar: " + sugarAmount + 'g');
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "")
                + ", Coffee type: " + coffeeType + ", Sugar amount: "
                + sugarAmount + "g]";
    }
}
