package com.tutorial;

public class Main {

    public static void main(String[] args) {
    
        int value1 = 5;
        int value2 = 4;
        boolean hasil;
		hasil = value1 == value2;

        System.out.println("Hasil 'value1 == value2' adalah " + hasil);
        System.out.println();
        System.out.println("tidak sama dengan..");

        hasil = value1 != value2;

        System.out.println("hasil 'value1 != value2' adalah " + hasil);
        System.out.println();
        System.out.println("lebih besar dari..");

        hasil = value1 > value2;

        System.out.println("Hasil 'value1 > value2' adalah " + hasil);
        System.out.println();
        System.out.println("sama atau lebih besar dari..");

        hasil = value1 >= value2;

        System.out.println("hasil 'value >= value2' adalah " + hasil);
        System.out.println();
        System.out.println("sama atau kurang dari dengan..");

        hasil = value1 <= value2;

        System.out.println("hasil 'value1 <= value2' adalah " + hasil);
        System.out.println();
        }
}