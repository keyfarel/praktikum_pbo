package com.example.praktikum_pbo.p3.tugas.tugas1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EncapDemo {
    private String name;
    private int age;

    public void setAge(int newAge){
        this.age = Math.max(18, Math.min(newAge, 30)) ;
    }

    @Override
    public String toString() {
        return "Data ["
                + "name: " + name
                + ", age: " + age
                + ']';
    }
}
