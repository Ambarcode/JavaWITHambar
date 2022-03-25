package com.ak;
import java.util.*;

class Temp {
    int age;
    String name="Ambar";
    int a=1;
    Temp(int age , String name) {
        this.age=age;
        this.name=name;
        //a=5;
        //System.out.println("PARENT CLASS IS CREATED");
    }
    public void Hello(){
        System.out.println("Hello World!");
    }

}
class Temp1 extends Temp{
    float salary;
    Temp1(int age ,String name , float salary){
        super(age,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(name+ " "+ age + " "+ salary);
        super.Hello();
    }



    public static void main(String[] args) {
        Temp1 obj =new Temp1(19,"Ambar",2000000f);
        obj.display();

    }
}

class DeafaultValue{
    int a=5;
     static DeafaultValue d=new DeafaultValue();
    public static void main(String[] args) {
    //DeafaultValue d=new DeafaultValue();
//       d.a=10;
        int n;
        // local variable is not initialized in java
        System.out.println(d.a);



    }
}

//*************Copying Variables of Primitive Data Types and Object Types************//
class copy{


        int a=4;
    public static void main(String[] args) {
        copy c1=new copy();
        copy c2=new copy();
        c1=c2;
        String s="Hello";
        String s1="Hello";

        //c1.a=5;
        //c1=c2;
//        c2=c1;
//        System.out.println(c1.hashCode());
//        System.out.println(c2.hashCode());
//        System.out.println(c1.a);
//        System.out.println(c2.a);

        if(c1.equals(c2)){
            System.out.println(true);

        }
        else
            System.out.println(false);



    }
}

//****************** DATE CLASS****************//
class date{
    public static void main(String[] args) {
        Date d= new Date();
//        System.out.println(d.toString());
//        System.out.println(d);
        int a =5,b=10;
        for (int i = 0; i <10 ; i++) {
            System.out.println((int)(Math.random()*(b-a)+a));

        }




    }

}
//*****************************RANDOM CLASS IN JAVA***************************////////////////////

class random{
    public static void main(String[] args) {
        Random random1 = new Random(2);
       // System.out.print("From random1: ");
       // for (int i = 0; i < 10; i++)
          //  System.out.print(random1.nextInt(100) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        //for (int i = 0; i < 10; i++)
         //   System.out.print(random2.nextInt(1000) + " ");

        for (int i = 0; i < 10; i++) {

        System.out.println(randomInt(5,10));
        }



    }
    public static int randomInt(int start ,int finish){


        return (
                new Random().nextInt(finish+1-start)+start
    );
    }
}
//************* Note: if we are creating an instance of 1st class in 2nd class then we can't access the private methods and members of first class
// however we can access the methods and members within the same class of the object

//**************** PASS BY VALUE AND PASSING THE VALUE OF REFERENCE VARIABLE *********************//
class PassByValue{
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.print("Original Values : ");
        System.out.println(a+" and "+b);
        swap(a,b);
        // here due to pass by value swapping does not work
        System.out.print("New Values      : ");
        System.out.println(a+" and "+b);
    }

    private static void swap(int a, int b) {
        int temp;
        temp=a;
        a=b;
        b=temp;

    }

}
class PassByReference_{

        int a=3;
        int b=4;
    public static void main(String[] args) {
        PassByReference_ obj =new PassByReference_();
        System.out.print("Original Values : ");
        System.out.println(obj.a+" and "+obj.b);
        obj.swap(obj);
        System.out.print("New Values      : ");
        System.out.println(obj.a+" and "+obj.b);



    }

    private void swap(PassByReference_ obj) {
        obj.a=4;
        obj.b=3;
    }

}
class ArrayOfObjects {
    String name;
    int age;
    char ch;
    ArrayOfObjects(String name,int age ,char ch){
        this.name=name;
        this.age=age;
        this.ch=ch;

    }
    public String toString(){
        return name + " " + age + " "+ ch;
    }
    public static void main(String[] args) {
        ArrayOfObjects[] obj={new ArrayOfObjects("Ambar",19,'M'),new ArrayOfObjects("Pratham",25,'M')};
        for (ArrayOfObjects index : obj)
        {
            System.out.println(index);
        }

    }


}
///************ Constructor chaining *****************//
// Constructing an instance of a class invokes all the superclasses’ constructors along the inheritance chain. This is called constructor chaining

 class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor"); //this reference can be used during constructor overloading to call default constructor implicitly from parametrized constructor NOTE: this should be the first statement inside the constructor

        System.out.println("(3) Employee's no-arg constructor is invoked");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

class Person {
    public Person() {
        System.out.println("(1) Person's no-arg constructor is invoked");
    }
}


class A{
    A(){
        //System.out.println("Class A Constructor is invoked");
    }
//    void parentGreet(){
//        System.out.println("Hello how are you!!!!!!!");
//    }
    String overrideMethod(){
        return "Parent class Method";

    }
}
class B extends A{

    B(){
        //super(); // there is bo need to write the super keyword as compiler will automatically write it
//        this("Contruction Overloading taked place",19);
//        System.out.println("Class B Constructor is invoked");
    }
//    B(String s){
//        System.out.println(s);
//    }
//    B(String m,int age){
//        //System.out.println(s);
//        System.out.println(age);
//
//    }
//    public void childGreet(){
//        super.parentGreet() ;
//
//    }

    @Override
    String overrideMethod() {
        return super.overrideMethod()+" Child method is overriding ";
    }
    // Note: Private methods can not be overloaded

//    public static void main(String[] args) {
//
//        B b=new B();
//        System.out.println(b.overrideMethod());
//        A a=new A();
//        System.out.println(a.overrideMethod());
//    }


}
class c{


    public static void main(String[] args) {
        B b=new B();



    }

}


class Apple {


}

class Fruit {
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}

// Note : We can't override static method in java

class Dog{
    private void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
    }
}


 class PolymorphismDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        //m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student_ {
}

class Student_ extends Person {
    public String toString() {
        return "Student";
    }
}

class Person_ extends Object {
    public String toString() {
        return "Person";
    }
}

class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<String>();
        al.add("Ambar");
        al.add("Kansal");
        al.add(1,"kumar");
        al.add(3,"KING");
        al.add(0,"Mr.");
       // al.add(9,"NUll");
        al.set(0,"Mr..");
//        System.out.println(al);
//        System.out.println(al.size());
//        for (int i = 0; i <20 ; i++) {
//            al.add(i);
//        }
//        System.out.println(al.size());
//
//        al.add(9,10);
//       al.set(10,11);
//
//        System.out.println(al);
        Stack<String> stack=new Stack<String>();
        stack.push("Ambar");
        stack.push("Kansal");
        stack.push("is");
        stack.push("a");
        stack.push("Good");
        stack.push("boy");
        System.out.println(stack);
    }
}

//*************** Exception Handling ***********************//

class ExceptionExample{ // they are runtime errors which are abnormal and unwanted and result in normal termination of program
    public static void main(String[] args) {
        int a =10,b=0,c;
        try {
            c=a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Main method ended");



    }
}

class Exception2{
    public static void main(String[] args) {
        try {
            System.out.println("hello world");
            int a =20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Third statement");


        }
        catch (ArithmeticException e){
            int x=20,y=0,z;
            z=x/y;
            System.out.println("can't divide by 0");

        }
        finally {
            int p=20,q=0,r;
            r=p/q;
            System.out.println("Finally block");

        }
        System.out.println("Main method ended");
    }
}

class MultipleTryCatchBlock{
    public static void main(String[] args) {
        try {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        try {
            int[] a={1,2,3,4};
            System.out.println(a[8]);

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Beyond the array list");

        }
    }
}

class MultiCatch{
    public static void main(String[] args) {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int[]arr ={1,2,3};
            System.out.println(arr[0]);

            String str="ankit";
            System.out.println(str.toUpperCase());



        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound");
        }
        catch (ArithmeticException en){
            System.out.println("Arithmetic exception");
        }
        catch (NumberFormatException enx){
            System.out.println("Number Format Exception");

        }
        catch (Exception exxxx){
            System.out.println("All Time exception -"+exxxx);
        }
    }

}

// throw keyword is used to throw the user defined r customized exception object to the JVM explicitly for the purpose we use the throw keyword
//throws keyword is used when we do not want to handle the exception and try to send the exception to the JVM (JVM or other Method)

class ThrowVsThrow
{
    void div(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();

        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args)  {
        ThrowVsThrow t=new ThrowVsThrow();
        try {
            t.div(20,0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        System.out.println(s);

    }
}
class OwnException{
    public static void main(String[] args) {
        try {
            vote(12);
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
    public static void vote(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Not Eligible for voting");

        }
        else {
            System.out.println("Eligible for votng");
        }
    }
}
class Test{
    public static void main(String[] args) {
        try {
            String s = "5.6";
            Integer.parseInt(s);
            int i = 0;
            int y = 2 / i;
        }
        catch (Exception e){
            System.out.println("Number Format Exception");
        }


    }
}
class Foo{
    int i;
    static int s;

    public static void main(String[] args) {
        Foo f1=new Foo();
        System.out.println(f1.i + f1.s);


    }
    public Foo(){
        i++;
        s++;

    }
}

class Ambar{
    void run(){
        System.out.println("Hello World ");
    }
}
class Keerti extends Ambar{
    public static void main(String[] args) {
        Ambar amb=new Keerti();

    }
}

