package com.example.praktikum_pbo.p6.praktikum.tugas.part2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Laptop extends Komputer{
    private String jnsBaterai;

    public Laptop(String merk, int prosesor, int sizeMemory,
                  String jenisProsesor, String jnsBaterai) {
        super(merk, prosesor, sizeMemory, jenisProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\njenis baterai   :  " + jnsBaterai;
    }
}
