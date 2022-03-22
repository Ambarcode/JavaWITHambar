package com.ak;

import java.util.Objects;

public class OverringEqualsMethod {

    private double re, im;

    public OverringEqualsMethod(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OverringEqualsMethod that))
            return false;

        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
    // Driver class to test the Complex class

    public static void main(String[] args) {

        OverringEqualsMethod c1 = new OverringEqualsMethod(10, 15);
        OverringEqualsMethod c2 = new OverringEqualsMethod(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }


    }
        }




    //The reason for printing “Not Equal” is simple: when we compare c1 and c2, it is checked whether both c1 and c2 refer to same object or not (object variables are always references in Java). c1 and c2 refer to two different objects, hence the value (c1 == c2) is false.
   // If we create another reference say c3 like following, then (c1 == c3) will give true.

    //So, how do we check for equality of values inside the objects? All classes in Java inherit from the Object class,
    // directly or indirectly (See point 1 of this). The Object class has some basic methods like clone(), toString(), equals(),.. etc.
    // We can override the equals' method in our class to check whether two objects have same data or not.





