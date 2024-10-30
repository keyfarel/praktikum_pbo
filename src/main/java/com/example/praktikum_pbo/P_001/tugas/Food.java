package com.example.praktikum_pbo.P_001.tugas;

public class Food {
    String foodName;
    int calories;

    Food(String foodName, int calories) {
        this.foodName = foodName;
        this.calories = calories;
    }

    void eat(){
        System.out.println("Eating " + foodName);
    }

    void caloriesCount(){
        System.out.println("Total calories: " + calories);
    }

    @Override
    public String toString() {
        return "Food [" + "calories: "
                + calories + "kkal , name: "
                + foodName + ']';
    }
}
