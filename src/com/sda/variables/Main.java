package com.sda.variables;

public class Main {
    public static void main(String[] args) {
        // String
        // declarare variabila : tip de data + nume variabila
        // String - siruri de caractere
        String firstName;

        // initializare variabila (atribuirea initiala cu o valoare a variabilei)
        firstName = "Alexandra";

        System.out.println("Hello " + firstName);

        // atribuire valoare
        firstName = "Gigel";

        // declarare + initializare
        String message = "Java is cool.";

        // concatenarea intre 2 siruri de caractere se face cu operatorul +
        System.out.println("Hello " + firstName + " - " + message);

        // println afiseaza sirul de caractere si la final adauga un caracter new line - \n
        // print afiseaza sirul de caractere, dar nu adauga caracterul new line la final
        System.out.print("Print\n");
        // cand avem caractere speciale pe care vrem sa le afisam, folosim \
        System.out.print("\"Print 2\"");

        // primitive

        System.out.println(); // printeaza new line
        // byte
        byte numar = 10;
        System.out.println(numar);

        // short
        short numar2 = 100;
        System.out.println("Variabila short are valoarea: " + numar2);

        // int
        int height = 180;
        System.out.println("Inaltimea lui " + firstName + " este " + height + " cm");

        // float
        float temperature = 4.1F;
        System.out.println("Temperatura este de " + temperature + " grade Celsius");

        // double
        double temperature2 = 12.4;
        System.out.println("Temperatura ziua este de " + temperature2 + " grade Celsius");
        System.out.printf("Temperatura ziua este de %.2f grade Celsius, iar noaptea este de %.3f grade Celsius.\n", temperature2, temperature);

        // char
        char a = 'a'; // caracterul
        char b = 98; // codul ASCII corespunzator caracterului
        System.out.println(b);
        System.out.println(a+b); // + se comporta ca operatorul de adunare, nu ca cel de concatenare
        System.out.println(a + "" + b);

        // 2 variabile de tipuri diferite sau de acelasi tip nu pot avea acelasi nume
        char symbol = '\u00B0'; // codul unicode al caracterului
        System.out.println("Temperatura ziua este de " + temperature2 + symbol + "C, iar noaptea este de "
                + temperature + symbol + "C.");
        System.out.printf("Temperatura ziua este de %.2f%cC, iar noaptea este de %.3f%cC.\n", temperature2, symbol, temperature, symbol);

        // long
        long numarLong = 123456789; // conversie implicita de la int la long
        long numarLong2 = 12345678901234L; // da eroare daca nu specificam L deoarece il considera int pe care il converteste la long
        long numarLong3 = 12_345_678_901_234L;

        // boolean
        boolean isColdOutside = true;
        System.out.println(isColdOutside);
        // de completat la operatori cum am afisa "Este frig afara"
        System.out.println(isColdOutside ? "Este frig afara" : "Este cald afara");

        // String isHigherThan30String = (number > 30) ? "conditia este adevarata" : "conditia este falsa";

    }
}
