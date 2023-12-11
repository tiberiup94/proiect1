package com.sda.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar intreg: ");
        int numarCitit = scanner.nextInt();

        // sa se afiseze toate cifrele - numarCitit sa ia valoarea 10
        System.out.println("FOR");

        for (int i = 0; i < numarCitit; i++) {
            System.out.println(i);
        }

        System.out.println("WHILE");
        int i = 0;
        while (i < numarCitit) {
            System.out.println(i);
            i++;
        }

        System.out.println("Valoare lui i = " + i);
        //i = 0;
        System.out.println("DO-WHILE");
        do {
            System.out.println(i);
            i++;
        } while (i < numarCitit);

        System.out.println("BREAK");
        // sa extragem primul numar divizibil cu 3 dintr-un interval [7,25]
        int minNumber = 7, maxNumber = 25;
        int numarExtras = 0;
        for (int j = minNumber; j <= maxNumber; j++) {
            if (j % 3 == 0) {
                numarExtras = j;
                break;
            }
            System.out.println(j);
        }
        System.out.println("Numarul gasit este: " + numarExtras);

        // TEMA: cum s-ar scrie exercitiul de mai sus folosind WHILE?
        numarExtras = 0;
        int k = minNumber;
        while (minNumber <= k && k <= maxNumber) {
            if (k%3 == 0) {
                numarExtras = k;
                break;
            }
            System.out.println(k);
            k++;
        }
        System.out.println("Numarul nou gasit este: " + numarExtras);

        System.out.println("CONTINUE");
        // sa extragem toate numerele divizibile cu 5 dintr-un interval [7,25]
        for (int j = minNumber; j <= maxNumber; j++) {
            if(j % 5 != 0) {
                continue; // sare peste iteratia curenta
            }
            System.out.println(j);
        }

        // while
        int j = minNumber;
        while (j <= maxNumber) {
            j++;
            if((j-1) % 5 != 0) {
                continue;
            }
            System.out.println(j-1);
        }

        j = minNumber - 1;
        while (j < maxNumber) {
            j++;
            if(j % 5 != 0) {
                continue;
            }
            System.out.println(j);
        }

        /*
        int j = minNumber;
        while(j<=maxNumber)
        {
            if(j % 5 != 0)
            {
                j++;
                continue;
            }
            j++;
            System.out.println(j - 1);
        }

        // cu do-while
        int intMin=5;
        j=intMin;
        int intMax=25;
        do {
            if (j % 5 !=0){
                j++;
                continue;
            }
            System.out.println("j=:"+j);
            j++;
        } while (j<intMax);
*/



    }
}
