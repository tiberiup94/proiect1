package com.sda.enums;

public class Main {
    public static void main(String[] args) {
        // ne cream o variabila de tip ZiSaptamana pe care sa o verificam in cadrul
        // unei structuri SWITCH si in functie de caz, sa afisam un mesaj (ex: Astazi este joi.)

        ZiSaptamana zi = ZiSaptamana.JOI;
        System.out.println(zi);

        switch (zi) {
            case LUNI:
                System.out.println("Astazi este luni.");
                break;
            case MARTI:
                System.out.println("Astazi este marti.");
                break;
            case MIERCURI:
                System.out.println("Astazi este miercuri.");
                break;
            case JOI:
                System.out.println("Astazi este joi.");
                break;
            case VINERI:
                System.out.println("Astazi este vineri.");
                break;
            case SAMBATA:
                System.out.println("Astazi este sambata.");
                break;
            case DUMINICA:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Valoare incorecta.");
                break;
        }

    }
}
