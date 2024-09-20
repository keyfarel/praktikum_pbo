package com.example.praktikum_pbo.p4.praktikum.percobaan1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Processor {
    private String merk;
    private double cache;

    @Override
    public String toString() {
        return "Processor ["
                + " merk: " + merk
                + ", cache: " + cache +
                ']';
    }
}
