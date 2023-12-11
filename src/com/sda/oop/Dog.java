package com.sda.oop;

 public class Dog {
    // variabile de instanta = campurile clasei = starea
    private String name;
    private String breed = "Maidanez";
    private String color;
    private int age;
    private double size;
    private boolean happy;
    public static int numberOfDogs = 0; // static = camp ce tine de clasa, nu de obiect
     private static int totalAge = 0;
     public static final int LIFE_EXPECTANCY = 17;

    // alt + insert ca sa generati constructorii, toString(), setterii, getterii
     // supraincarcare constructori
     // constructorul default
     public Dog() {
//         this.name = "No name";
//         this.breed = "Maidanez";
//         this.color = "N/A";
//         this.age = 0;
//         this.size = 0.0;
//         this.happy = true;
         numberOfDogs++;
         totalAge += age;
     }

     // constructorul cu un singur parametru - name
     public Dog(String name) {
//         this.name = name; // this = instanta/obiectul curent
//         this.breed = "Maidanez";
//         this.color = "N/A";
//         this.age = 0;
//         this.size = 0.0;
//         this.happy = true;

         // apelul constructorului cu toti parametrii
         this(name, "Maidanez", "N/A", 0, 0.0, true);
     }

     // constructorului cu toti parametrii
     public Dog(String name, String breed, String color, int age, double size, boolean happy) {
         this.name = name;
         this.breed = breed;
         this.color = color;
         this.age = age;
         this.size = size;
         this.happy = happy;
         numberOfDogs++;
         totalAge += age;
     }

     public Dog(Dog dog) {
         this.name = dog.getName();
         this.breed = dog.getBreed();
         this.color = dog.getColor();
         this.age = dog.getAge();
         this.size = dog.getSize();
         this.happy = dog.isHappy();
         numberOfDogs++;
         totalAge += age;
     }

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getBreed() {
         return breed;
     }

     public void setBreed(String breed) {
         this.breed = breed;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         if (age >= 0) {
             totalAge = totalAge - this.age + age;
             this.age = age;
         } else {
             System.out.println("Varsta nu e mai mare decat 0");
         }
     }

     public double getSize() {
         return size;
     }

     public void setSize(double size) {
         this.size = size;
     }

     public boolean isHappy() {
         return happy;
     }

     public void setHappy(boolean happy) {
         this.happy = happy;
     }

     // metode = comportamentul
    public void bark() {
        System.out.println(name + " latra : ham! ham!");
    }

    public static void printNumberOfDogs()
    {
        System.out.println("Numarul total de obiecte al clasei Dog: " + Dog.numberOfDogs);
    }

    public static int getTotalAge() {
         return totalAge;
    }

    public static double averageAge() {
         return (double)getTotalAge() / numberOfDogs;
    }

    public static String avgVsLifeExpectancy() {
         if(Dog.averageAge() > LIFE_EXPECTANCY) {
             return "Media varstelor este mai mare decat speranta de viata";
         } else {
             return "Media varstelor este mai mica sau egala decat speranta de viata";
         }
    }

     @Override
     public String toString() {
         return "Dog{" +
                 "name='" + name + '\'' +
                 ", breed='" + breed + '\'' +
                 ", color='" + color + '\'' +
                 ", age=" + age +
                 ", size=" + size +
                 ", happy=" + happy +
                 '}';
     }
 }
