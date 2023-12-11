package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");
        String str3 = "Hello, World!";
        String str4 = str1;

        str1 = str1 + "-";

        // verificarea egalitatii referintelor
        if (str1 == str4) {
            System.out.println("Referinte egale");
        } else {
            System.out.println("Referinte diferite");
        }

        // verificarea egalitatii obiectelor
        if (str1.equals(str4)) {
            System.out.println("Obiecte egale");
        } else {
            System.out.println("Obiecte diferite");
        }

        char[] chars = {'S','a','l','u','t','!'};
        String str5 = new String(chars);
        System.out.println(str5);

        String str6 = new String(chars,0, chars.length - 1);
        System.out.println(str6);

        // comparare siruri de caractere
        String nume1 = "Alexandra";
        String nume2 = "Gigel";
        System.out.println(nume1.compareTo(nume2));
        // valori - => ordine alfabetica
        // valori + => ordine invers alfabetica

        char a = 'A', g = 'G';
        System.out.println((byte)a + " " + (byte)g);
        System.out.println(a - g);

        // alte metode ale clasei String
        String exemplu = "Exemplu";

        int lungime = exemplu.length();
        System.out.println("Lungimea: " + lungime);

        int index = exemplu.indexOf("em");
        System.out.println("Index \"em\": " + index);

        char caracter = exemplu.charAt(index);
        System.out.println("Caracterul de pe pozitia index: " + caracter);

        String subsir1 = exemplu.substring(index);
        System.out.println("Subsir 1 : " + subsir1);

        String subsir2 = exemplu.substring(index, exemplu.length()-1);
        System.out.println("Subsir 2 : " + subsir2);

        String mare = exemplu.toUpperCase();
        String mic = exemplu.toLowerCase();
        System.out.println(mare + " " + mic);

        String concatenat = exemplu.concat(" siruri de caractere");
        System.out.println(concatenat);
        System.out.println(exemplu + " siruri de caractere");

        String replaced = exemplu.replace('e','a');
        System.out.println("Replaced: " + replaced);

        boolean incepeCuEx = exemplu.startsWith("ex");
        System.out.println(incepeCuEx ? "Incepe cu Ex" : "Nu incepe cu Ex");

        // exercitiu: cum modificati exemplul de mai sus astfel incat sa nu tina cont de litere mici sau mari
        boolean incepeCuEx2 = exemplu.toUpperCase().startsWith("ex".toUpperCase());
        System.out.println(incepeCuEx2 ? "Incepe cu Ex" : "Nu incepe cu Ex");

        boolean seTerminaCuLu = exemplu.toUpperCase().endsWith("Lu".toUpperCase());
        System.out.println(seTerminaCuLu ? "Se termina cu lu" : "Nu se termina cu lu");

        String[] cuvinte = concatenat.split(" ");
        for (String cuvant:
             cuvinte) {
            System.out.println(cuvant);
        }

        // instanceof
        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println("Obiectul este o instanta a clasei String");
        }

        int val = 6; // primitiva
        Object obj2 = 6;
        if (obj2 instanceof Integer) {
            System.out.println("Obiectul este o instanta a clasei Integer");
        }
    }
}
