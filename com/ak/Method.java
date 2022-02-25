package com.ak;

import java.awt.*;

class PassByReference{

    public static void main(String[] args) {

        Point p =new Point();
        p.x=10;
        p.y=20;
        System.out.println("x= "+p.x +" y= "+p.y);
    change(p);
        System.out.println("x= "+p.x +" y= "+p.y);


    }

    private static void change(Point p1) { //here both p and p1 are pointing to the same object in the heap memory
        int temp=p1.x;
        p1.x=p1.y;
        p1.y=temp;

    }
}