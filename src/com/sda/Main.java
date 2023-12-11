package com.sda;

import java.util.Scanner;

/*
Aceasta este clasa principala, unde avem metoda main - de intrare in program
*/
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello Alexandra!"); // afisam textul Hello Alexandra!
        // comentariu pe o singura linie - este ignorat de compilator
        /*
        comentariu
        pe mai multe
        linii
         */

        // citirea de la tastatura
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int numarCitit = scanner.nextInt();
        System.out.println("Numarul citit este: " + numarCitit);

        System.out.println("Introduceti un numar real: ");
        double numarCitit2 = scanner.nextDouble();
        System.out.println("Numarul citit este: " + numarCitit2);

        System.out.println("Introduceti un text: ");
        String text = scanner.next();
        System.out.println(text);

    }
}
