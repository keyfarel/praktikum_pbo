package com.example.praktikum_pbo.P_006.praktikum.tugas.part2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Mac extends Laptop{
    private String security;

    public Mac(String merk, int prosesor, int sizeMemory,
               String jenisProsesor, String jnsBaterai, String security) {
        super(merk, prosesor, sizeMemory, jenisProsesor, jnsBaterai);
        this.security = security;
    }

    @Override
    public String toString() {
        return strBlock()
                + super.toString()
                + "\nsecurity        :  " + security;
    }

    public String strBlock() {
        return """
                \n
                ---------------------------------------------
                |                    Mac                    |
                ---------------------------------------------""";
    }
}