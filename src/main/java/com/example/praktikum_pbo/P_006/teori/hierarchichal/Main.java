package com.example.praktikum_pbo.P_006.teori.hierarchichal;

import com.example.praktikum_pbo.P_006.teori.hybrid.Animal;
import com.example.praktikum_pbo.P_006.teori.hybrid.Mammals;
import com.example.praktikum_pbo.P_006.teori.hybrid.Reptiles;

public class Main {
    public static void main(String[] args) {
        var anml = new Animal("Persian Cat", 20);
        System.out.println(anml);
        anml.eat();
        anml.move();
        System.out.println();

        var mml = new Mammals("Cat", 3, "Yellow");
        System.out.println(mml);
        mml.eat();
        mml.move();
        mml.nurse();
        System.out.println();


        var rptl = new Reptiles("Crocodile", 15, "Sharp", true);
        System.out.println(rptl);
        rptl.eat();
        rptl.move();
        rptl.crawl();
        rptl.shedSkin();
        System.out.println();

        var brd = new Birds("Love Bird", 5, 2.0, true);
        System.out.println(brd);
        brd.eat();
        brd.move();
        brd.fly();
        brd.eat();
    }
}
