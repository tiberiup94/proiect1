package com.sda.wrappers;

public class Main {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt + " <-> " + maxInt);

        float numarFloat1 = 6.14f; // primitiva
        Float numarFloat2 = 3.14f; // obiect - se face autoboxing

        System.out.println(numarFloat2);

        int comparare = numarFloat2.compareTo(numarFloat1);
        System.out.println(comparare);
        // 0 - egale
        // 1 - primul este mai mare (numarFloat2)
        // -1 - primul este mai mic (numarFloat2)

        int numarInt = 97;
        Long numarLong = (long) numarInt; // autoboxing de la primitiva (long) numarInt

        Double numarDouble = 89.78;
        // unboxing
        double numarDouble2 = numarDouble;
        int numarInt2 = numarDouble.intValue();
        System.out.println(numarDouble + " " + numarInt2);

        // wrapper -> sir de caractere
        String numarLongSir = numarLong.toString();
        String numarDobleSir = numarDouble.toString();
        System.out.println(numarLongSir + " " + numarDobleSir);

        // sir de caractere -> wrapper
        String numarString = "12345.67";
        // Integer numarDoubleFromSir = Integer.valueOf(numarString); // NumberFormatException
        Double numarDoubleFromSir = Double.valueOf(numarString); // NumberFormatException
        // valueOf() - returneaza Double (obiect) VS parseDouble() - returneaza double (primitiva)
        double numarDoubleFromSir2 = Double.parseDouble(numarString);

        System.out.println(numarDoubleFromSir2);

    }
}
