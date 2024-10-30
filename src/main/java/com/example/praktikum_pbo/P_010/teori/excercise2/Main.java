package com.example.praktikum_pbo.P_010.teori.excercise2;

public class Main {
    public static void main(String[] args) {
        var indro = new Manusia();
        var tvJadul = new TelevisiJadul();
        var tvModern = new TelevisiModern();

        indro.nyalakanPerangkat(tvJadul);
        System.out.println();
        indro.nyalakanPerangkat(tvModern);
    }
}
