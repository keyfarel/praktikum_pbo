package com.example.praktikum_pbo.P_006.praktikum.tugas.part2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pc extends Komputer {
    private int ukuranMonitor;

    public Pc(String merk, int prosesor, int sizeMemory,
              String jenisProsesor, int ukuranMonitor) {
        super(merk, prosesor, sizeMemory, jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nukuran monitor  :  " + ukuranMonitor + " inch";
    }
}
