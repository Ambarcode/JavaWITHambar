package com.ak;

class Parent{
     static void hello(){

        System.out.println("Hello World ");
    }

}

class InstanceOf {
    //The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
    //The instanceof in java is also known as type comparison operator because it compares the instance with type.
    // It returns either true or false
    // . If we apply the instanceof operator with any variable that has null value, it returns false.
    static class Simple1 extends Parent {

        public static void main(String args[]) {

            Parent p = new Simple1(); // We can create reference of parent class and object of child class but reverse is not possible
            // Simple1 sl=new Parent(); We can not create reference of child and object of parent
            Simple1 s = new Simple1();
            System.out.println(s instanceof Simple1);//true
//            System.out.println(s instanceof Parent);
//            System.out.println(s instanceof Parent);
            // when we extend a class we can use its method by just declaring an object or if the method

            //**********     instanceof in java with a variable that have null value *********************//
            Simple1 s2 = null;
            System.out.println(s2 instanceof Simple1);


            // **************** Downcasting with java instanceof operator ***************//


            // When Subclass type refers to the object of Parent class, it is known as downcasting. If we perform it directly, compiler gives Compilation error.
            // If you perform it by typecasting, ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible.

            // Simple1 obj=new Parent();  It will create or generate compilation error
            //If we perform downcasting by typecasting, ClassCastException is thrown at runtime.
            Simple1 obj = (Simple1) new Parent();  //Compiles successfully but ClassCastException is thrown at runtime

            // ************Possibility of downcasting with instanceof************


        }
    }
}
            class Animal { }

            class Dog3 extends Animal {
                static void method(Animal a) {
                    if(a instanceof Dog3){
                        Dog3 d=(Dog3)a;//downcasting
                        System.out.println("ok downcasting performed");
                    }
                }

                public static void main (String [] args) {
                    Animal a=new Dog3();
                    Dog3.method(a);
                }

            }

               // *************Downcasting without the use of java instanceof*******************
        //Downcasting can also be performed without the use of instanceof operator as displayed in the following example:
               class Animal2 { }


               class Dog4 extends Animal2 {

                        static void method(Animal2 a) {
                        Dog4 d=(Dog4)a;//downcasting
                        System.out.println("ok downcasting performed");

            }
                             public static void main (String [] args) {
                                Animal2 a=new Dog4();
                                Dog4.method(a);

                                 }
                }

                //









