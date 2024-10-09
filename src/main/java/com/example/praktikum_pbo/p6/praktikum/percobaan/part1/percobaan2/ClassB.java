package com.example.praktikum_pbo.p6.praktikum.percobaan.part1.percobaan2;

import lombok.Setter;

@Setter
public class ClassB extends ClassA {
    public int z;

    public void getNilaiz(){
        System.out.println("Nilai z: "+z);
    }

    public void getJumlah(){
        System.out.println("Jumlah: "+(x+y+z));
    }
}