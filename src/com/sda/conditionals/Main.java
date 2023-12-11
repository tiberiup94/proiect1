package com.sda.conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IF");

        double temperature = 6;
        if (temperature <= 0) {
            // ce se executa daca conditia este adevarata
            // putem elimina acoladele, dar ATENTIE - se va executa doar prima instructiune
            // de regula, chiar daca avem o singura instructiune in if, PUNEM ACOLADE
            System.out.println("Afara este frig");
        }
        System.out.println("Temperatura este " + temperature);

        if (temperature <= 0) {
            System.out.println("Afara este frig");
        } else {
            // ce se executa daca conditia este falsa (adica temperatura este > 0)
            System.out.println("Afara este decent");
        }

        // verificati daca un numar este par sau impar
        // %2 - restul impartirii la 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introduceti un numar intreg: ");
//        int numarCitit = scanner.nextInt();
//        if(numarCitit %2==0){
//            System.out.println("Numarul citit este par:" +numarCitit);
//        }
//        else{
//            System.out.println("Numarul citit este impar:" +numarCitit);
//        }

        temperature = 20;
        if (temperature <= 0) {
            // ce se executa daca temperatura este <= 0
            System.out.println("Afara este frig");
        } else if (temperature <= 20) {
            // ce se executa daca temperatura este > 0 si <= 20
            // (0,20]
            System.out.println("Afara este decent");
        } else {
            // ce se executa daca temperatura este > 20
            System.out.println("Afara este cald");
        }

        System.out.println("SWITCH");
        Scanner scanner1 = new Scanner(System.in);
        String zi = scanner1.next();

        System.out.println("Ziua saptamanii este " + zi);

        switch (zi) {
            case "L":
                System.out.println("Luni");
                break; // iese din structura switch
            case "M":
                System.out.println("Marti");
                break;
            case "Mi":
                System.out.println("Miercuri");
                break;
            case "J":
                System.out.println("Joi");
                break;
            case "V":
                System.out.println("Vineri");
                break;
            case "S":
                System.out.println("Sambata");
                break;
            case "D":
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Valoarea introdusa nu corespunde unei zile a saptamanii");
        }

    }
}
