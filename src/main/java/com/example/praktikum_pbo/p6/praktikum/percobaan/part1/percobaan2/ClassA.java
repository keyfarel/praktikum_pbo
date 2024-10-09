package com.example.praktikum_pbo.p6.praktikum.percobaan.part1.percobaan2;

import lombok.Setter;

@Setter
public class ClassA {
    public int x;
    public int y;

    public void getNilai() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }
}