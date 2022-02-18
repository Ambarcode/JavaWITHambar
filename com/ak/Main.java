package com.ak;

import java.util.Scanner;

//
//   class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[6]);
//        Greeting.Greet();
//        //Note: 1. Due to the method Greet() been public in Greeting class we are able to access it easily
//        //      2. If the method Greet() was private in the Greeting.java class we will not be able to access it
//        //      3. We can access the private method Greet() in the same class even if it is private
//
//        // STRING CLASS
//        String s="ADVANCE JAVA";
//        s.length();
//        System.out.println(s.length());
//        s.concat(" Programming");
//        System.out.println(s.concat(" Programming"));
//        s.toUpperCase();
//        System.out.println(s.toUpperCase());
//        s.toLowerCase();
//        System.out.println(s.toLowerCase());
//        s.substring(0,6);
//        System.out.println(s.substring(0 , 6));
//        s.indexOf('J');
//        System.out.println(s.indexOf('J'));
//        s.charAt(9);
//        System.out.println(s.charAt(9));
//
//        //STRING BUFFER
//        StringBuffer s1=new StringBuffer("ADVANCE JAVA");
//        s1.append(" PROGRAMMING");
//        System.out.println(s1);
//        s1.reverse();
//        System.out.println(s1);
//        s1.charAt(7);
//        System.out.println(s1.charAt(7));
//        s1.indexOf("PRO");
//        System.out.println(s1.indexOf("PRO"));
//        s1.insert(8 ,"HELLO");
//        System.out.println(s1);
//        s1.substring(1,5);
//        System.out.println(s1);
//        s1.replace(4 ,8,"FOR");
//        System.out.println(s1);
//        s1.capacity();
//        System.out.println(s1.capacity());
//        String Orig="AMBAR";
//        String NewStr="";
//        char ch;
//        for (int i = 0; i < Orig.length(); i++) {
//
//            ch=Orig.charAt(i);
//            NewStr=ch+NewStr;
//        }
//        System.out.println(Orig);
//        System.out.println(NewStr);
//        if (Orig.equals(NewStr)) {
//            System.out.println("THE GIVEN STRING IS A PALINDROME");
//        }
//            else
//            {
//                System.out.println("Not a Palindrome");
//            }
//
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Circle r1 = new Circle();
//        Circle r2 = new Circle(10.0);
//        r1.printData();
//        r1.printArea();
//        r1.printPerimeter();
//        r2.printData();
//        r2.printArea();
//        r2.printPerimeter();
//
//    }
//}
// class Circle {
//        Double Radius;
//
//
//    public Circle() {
//        Radius = 0.0;
//    }
//
//    public Circle(Double Radius) {
//        this.Radius = Radius;
//    }
//
//    public void printData() {
//        System.out.println("Radius: " + Radius);
//    }
//
//    public void printArea() {
//        System.out.println("Area: " + 3.14 * Radius * Radius);
//    }
//
//    public void printPerimeter() {
//        System.out.println("Perimeter: " + 2*3.14*Radius);
//    }
//}
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import java.time.Instant;
//import java.util.Date;
//
//public class Main {
//    public static void main(String[] args) {
//        RightangleTriangle rt = new RightangleTriangle(3, 4, "red", Date.from(Instant.now()));
//        System.out.println("Area: " + rt.getArea());
//        rt.printData();
//    }
//}
// class GeometricObject {
//     String color;
//    private Date dateCreated;
//
//     GeometricObject() {
//        color = "white";
//        dateCreated = Date.from(Instant.now());
//    }
//
//    GeometricObject(String color, Date dateCreated) {
//        this.color = color;
//        this.dateCreated = dateCreated;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public Date getDateCreated() {
//        return dateCreated;
//    }
//}
//
//
//class RightangleTriangle extends GeometricObject {
//     double baze;
//     double hite;
//
//     RightangleTriangle() {
//        baze = 3.0;
//        hite = 5.0;
//    }
//
//     RightangleTriangle(double base, double height, String color, Date createDate) {
//        super(color, createDate);
//        baze = base;
//        hite = height;
//    }
//
//
//    public double getArea() {
//        return (baze * hite) / 2;
//    }
//
//    public void printData() {
//        System.out.println("Base: " + baze + " \nHeight: " + hite + " \nColor: " + getColor() + " \nCreated date: " + getDateCreated());
//    }
//}
//public class Main {
//    public static void main(String args[]) {
//        Person person = new Person("Elon Musk");
//        Person student = new Student("Sundar Pichai");
//        Person employee = new Employee("Ratan TATA");
//        Person faculty = new Faculty("GEN. BIPIN RAWAT");
//        Person staff = new Staff("Steve jobs");
//        Person[] people = { person, student, employee, faculty, staff };
//        for (Person p : people) {
//                System.out.println(p);
//            }
//    }
//
//
//
//
//    static class Person {
//        String name, address, phoneNumber, email;
//
//
//        Person(String n) {
//            name = n;
//        }
//
//
//
//        public String toString() {
//            return "Person " + name;
//        }
//    }
//
//
//    static class Student extends Person {
//        Student(String n) {
//            super(n);
//        }
//
//
//        enum Status {
//            freshman, sophomore, junior, senior
//        }
//
//
//        Status classStatus;
//
//
//
//        public String toString() {
//            return "Student " + name;
//        }
//
//
//    }
//
//
//    static class Employee extends Person {
//        Employee(String n) {
//            super(n);
//        }
//
//
//        String office, hireDate;
//        double salary;
//
//
//
//        public String toString() {
//            return "Employee " + name;
//        }
//    }
//
//
//    static class Faculty extends Employee {
//        Faculty(String n) {
//            super(n);
//        }
//
//
//        String officeHours, rank;
//
//
//        public String toString() {
//            return "Faculty " + name;
//        }
//    }
//
//
//    static class Staff extends Employee {
//        Staff(String n) {
//            super(n);
//        }
//
//
//        String title;
//
//
//
//        public String toString() {
//            return "Staff " + name;
//        }
//    }}
// class Lab2{
//    public static void main(String[] args) {
//        Lab2 obj=new Lab2();
//        System.out.println("Enter the number of Elements(Only Even):");
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int[] arr=new int[N];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter Element No"+(i+1)+":");
//            arr[i]=sc.nextInt();
//            System.out.println();
//
//        }
//        int elem=obj.minValueToBalance(arr,N);
//
//        System.out.println("Element to be Added: "+elem);
//        int[] newArr=new int[N+1];
//        for (int i = 0; i < N; i++) {
//            newArr[i]=arr[i];
//
//        }
//        newArr[N]=elem;
//        System.out.println("OLD ARRAY: "+Arrays.toString(arr));
//        System.out.println("NEW ARRAY: "+Arrays.toString(newArr));
//
//
//    }
//
//      public int minValueToBalance(int[] arr, int N) {
//        int sum1=0;
//          for (int i = 0; i < N/2; i++) {
//              sum1 += arr[i];
//          }
//          int sum2=0;
//          for (int i = (N-1); i >= N/2; i--) {
//              sum2+=arr[i];
//          }
//          return Math.abs(sum1-sum2);
//    }
//
//
//}
//class StaticCheck{
//    int a2=9;
//    public static void main(String[] args) {
//        int a = Integer.MAX_VALUE;
//        long b = Long.MAX_VALUE;
//        System.out.println(a + b);
//        String s=new String("hello");
//        String s2="hello";// BOTH THE ABOVE AND BELOW STATEMENT ARE SAME
//        StaticCheck obj = new StaticCheck();
//        obj.a2=10;
//          greet();
//        Static methods
//        When a method is declared with the static keyword, it is known as the static method. The most common example of a static method is the main( ) method. As discussed above, Any static member can be accessed before any objects of its class are created, and without reference to any object. Methods declared as static have several restrictions:
//
//        They can only directly call other static methods.
//        They can only directly access static data.
//        They cannot refer to this or super in any way.


//    }
//
//    private  void greet() {
//    }
//
//}
class InvalidRadiusException extends Exception{

    InvalidRadiusException(){
        super();
    }
     InvalidRadiusException(String Msg){
         super(Msg);

     }
}
class CircleWithCustomExceptin {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException("RADIUS CAN'T BE NEGATIVE");
        }

    }

    public static void main(String[] args) {
            int a=4;

    }
}


