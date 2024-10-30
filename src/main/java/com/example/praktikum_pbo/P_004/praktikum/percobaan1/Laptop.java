package com.example.praktikum_pbo.P_004.praktikum.percobaan1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    private String merk;
    private Processor proc;

    @Override
    public String toString() {
        return "Laptop [" +
                "merk: " + merk
                + ", " + proc.toString()
                + ']';
    }
}
