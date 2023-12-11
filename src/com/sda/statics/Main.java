package com.sda.statics;

import static com.sda.oop.Dog.LIFE_EXPECTANCY;
import static com.sda.oop.Dog.printNumberOfDogs;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(LIFE_EXPECTANCY);
        printNumberOfDogs();

        // creati o metoda care sa calculeze aria unui cerc - PI * R^2
        double raza = 6d;
        System.out.println("Aria cercului este: " + ariaCercului(raza));

        // metoda pentru generarea unui numar aleatoriu
        System.out.println("Numar aleatoriu: " + Math.random());
        System.out.println("Numar aleatoriu: " + Math.random() * 100);
        // interval - formula nr * (max-min) + min
        int min = 5;
        int max = 67;
        double result = Math.random() * (max - min) + min;
        System.out.println("Numar aleatoriu din interval: " + result);

    }

    public static double ariaCercului(double r) {
        return PI * pow(r, 2);
    }

}
