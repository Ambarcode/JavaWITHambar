package com.ak;

public class MethodOverload {
    public static void main(String[] args) {
        //System.out.println("hello world");
        overLoad("Ankit");
        overLoad("Hello");
       // System.out.println(MethodOverload.simple(3,2));  // In this the simple method will not be overloaded because compiler will not be available to know the type of parameter we are passing
       // System.out.println(MethodOverload.simple(3.0,2.0));


    }

     //static int simple(int a, int b) {
         //System.out.println("Value of a: "+a+ " and b: "+b);
   //      return a+b;
    //}
   // static double simple(int a,int b){ //In java, method overloading is not possible by changing the return type of the method
        // only because of ambiguity. Let's see how ambiguity may occur:
      //  return a+b;
    //}
//    static int simple(int a, int b) {
//         //System.out.println("Value of a: "+a+ " and b: "+b);
//        return a+b;
//    }

    static void overLoad(String name) {
         System.out.println("Hello "+ name);



    }
    static void overLoad(){
        System.out.println("Hello Ambar");
    }
}
