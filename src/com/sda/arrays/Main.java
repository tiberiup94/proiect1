package com.sda.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array unidimensional");

        // declarare + initializare
        int[] numere = new int[3]; // 0 1 2

        // accesarea elementului de pe o anumita pozitie
        System.out.println("Elementul de pe pozitia 1: " + numere[1]);

        numere[1] = 5;
        numere[0] = 10;

        // parcurgere
        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }
        System.out.println("\nParcurgere cu FOREACH: ");

        // parcurgere cu foreach
        for (int numar :
             numere) {
            System.out.print(numar + " ");
        }
        System.out.println();

        // declarare + initializare
        long[] array = {5L, 7L, 9L, 15L, 4L};

        // vrem sa modificam ultimul element din array
        array[4] = 100L;

        for (long element :
                array) {
            System.out.print(element + " ");
        }
        System.out.println();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti lungimea array-ului: ");
//
//        int n = scanner.nextInt();
//        String[] sir = new String[n];
//
//        for (int i = 0; i < sir.length; i++) {
//            System.out.println("Introduceti elementul  de pe pozitia " + i);
//            sir[i] = scanner.next();
//        }
//
//        scanner.close();
//
//        for (String element :
//                sir) {
//            System.out.print(element + " ");
//        }
//        System.out.println();


        System.out.println("Array bidimensional");
        double[][] matrice = new double[2][3];

        matrice[0][0] = 5;
        matrice[1][2] = 10;

        for (int i = 0; i < matrice.length; i++) { // parcurgere randuri
            for (int j = 0; j< matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = {{"Ion", "Ana"},{"Marius","Ioana", "Teodora"}};

        for (String[] rand :
             names) {
            for (String name:
                 rand) {
                System.out.print(name + "; ");
            }
            System.out.println();
        }

        //System.out.println(names[0][2]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti numarul de randuri: ");
        int n = scanner1.nextInt();
        System.out.println("Introduceti numarul de coloane: ");
        int m = scanner1.nextInt();

        int[][] array2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduceti valoarea elementului de pe randul " + i
                + " si coloana " + j);
                array2[i][j] = scanner1.nextInt();
            }
        }

        scanner1.close();

        System.out.println("Array-ul bidimensional citit este: ");

        for (int[] rand :
                array2) {
            for (int element :
                    rand) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // suma elementelor unui array unidimensional
        // varibila in care sa stocati rezultatul final - suma
        // parcurgeti array-ul unidimensional
        // adunati fiecare element la rezultat
        // TEMA

    }
}
