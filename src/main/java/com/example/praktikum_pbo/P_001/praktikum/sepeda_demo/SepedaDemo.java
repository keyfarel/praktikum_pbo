package com.example.praktikum_pbo.P_001.praktikum.sepeda_demo;

public class SepedaDemo {

    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerk("Poligon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        System.out.println(spd1);

        spd2.setMerk("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        System.out.println(spd2);

        spd3.setMerk("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTypeSuspensi("Gass suspensi");
        System.out.println(spd3);
    }
}
