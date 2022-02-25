package com.ak;

import java.util.Scanner;

public class MethodOverloadingExercise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER YOUR NAME AND AGE : ");
        System.out.println(inputName() +" "+  MethodOverloadingExercise.inputAge() );
        //System.out.println(inputName(sc.nextLine())); // We can also use this

    }

    private static String inputName() {
       // Scanner sc =new Scanner(System.in);
        return new Scanner(System.in).nextLine(); // If we have to use object only once than we can create just an instance of the class i.e there is not create a reference variable to call a method

    }


    private static double inputAge(){
        return new Scanner(System.in).nextDouble();
    }
}
