package com.ak;

public class Greeting {
    public static void main(String[] args) {
        Greet();
        Greeting.Greet1();
        // Greeting.Greet2(); It is showing an  error as the method Greet2() is not static , so we are not able to access it
        // Greet2(); It is also showing error ,as we always have to put a static method inside a main method

    }

    public static void Greet() {
        System.out.println("HELLO WORLD MY NAME IS AMBAR Kansal");
              
    }

    private static void Greet1() {
        System.out.println("HELLO WORLD! THIS IS A EXAMPLE OF STATIC ACCESS MODIFIER");
    }

    private void Greet2() {
        System.out.println("HELLO WORLD! THIS IS A EXAMPLE OF STATIC ACCESS MODIFIER");
    }
}
