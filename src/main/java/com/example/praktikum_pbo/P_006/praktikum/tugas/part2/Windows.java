package com.example.praktikum_pbo.P_006.praktikum.tugas.part2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Windows extends Pc {
    private String fitur;

    public Windows(String merk, int prosesor, int sizeMemory,
                   String jenisProsesor, int ukuranMonitor, String fitur) {
        super(merk, prosesor, sizeMemory, jenisProsesor, ukuranMonitor);
        this.fitur = fitur;
    }

    @Override
    public String toString() {
        return strBlock()
                + super.toString()
                + "\nfitur           :  " + fitur;
    }

    public String strBlock() {
        return """
                \n
                ---------------------------------------------
                |                  Windows                  |
                ---------------------------------------------""";
    }
}
