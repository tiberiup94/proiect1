package com.sda.oop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog(); // constructor default
//
//        System.out.println(dog);
//
//        // accesarea membrilor obiectului
////        dog.name = "Patrocle";
////        System.out.println(dog.name);
////        dog.bark();
////
////        Dog max = new Dog("Max");
////        System.out.println(max);
////        max.breed = "Pekinez";
////        System.out.println(max.breed);
//
//        // TEMA:
//        // puneti o verificare in setter astfel incat size sa nu poata lua valori negative
//        // procedati la fel pentru age
//
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        scanner.close();
//
//        Dog max = new Dog("Max");
//        System.out.println(max);
//        max.setBreed("Pechinez");
//        System.out.println(max.getBreed());
//        max.setAge(age);
//        System.out.println("Varsta este " + max.getAge());
//
//        // 2 variabile care refera aceeasi zona de memorie
//        Dog charlie = max;
//        System.out.println(charlie);
//        charlie.setName("Charlie");
//        System.out.println("Dupa modificarea numelui: ");
//        System.out.println(charlie);
//        System.out.println(max);
//        // ambele variabile charlie si max refera acelasi obiect
//
//        // copiem un obiect folosind constructorul de copiere
//        Dog fluffy = new Dog(charlie);
//        fluffy.setName("Fluffy");
//        System.out.println(fluffy);
//        System.out.println(charlie);
//
//        // variabile constante in Java:
//        final double freezing_temperature = 0;
//        // freezing_temperature = 1;
//        System.out.println(freezing_temperature);
//
//        // variabile statice
//        // dintr-un context static nu putem apela metode non-statice
//        // accesarea membrilor statici se face prin numele clasei, pe cand a membrilor non-statici se face prin numele obiectului
//        // static = camp ce tine de clasa, nu de obiect
//        System.out.println(Dog.numberOfDogs);
//        Dog.printNumberOfDogs();

        // exercitiu:
        // creati o metoda care sa calculeze media varstelor tuturor cateilor
        // o metoda statica care sa ne intoarca rezultatul
        // media = suma varstelor / numarul de obiecte (Dog.numberOfDogs)
        // sa calculam suma varstelor tuturor cateilor - variabila statica
        Dog max = new Dog("Max", "Ciobanesc","maro",4,15.7,true);
        Dog rex = new Dog("Rexx", "Maidanez","crem",6,10,false);
        rex.setAge(1);
        System.out.println(Dog.getTotalAge());
        System.out.println(Dog.averageAge());

        // creati o metoda care sa compare media varstelor cu speranta de viata a cateilor
        System.out.println(Dog.avgVsLifeExpectancy());

    }
}
