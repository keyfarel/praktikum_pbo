package com.example.praktikum_pbo.p4.praktikum.percobaan1;

public class Main {
    public static void main(String[] args) {
        var p = new Processor("Intel i5", 3);
        var l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        System.out.println(l);

        var p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        var l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        System.out.println(l1);
    }
}
