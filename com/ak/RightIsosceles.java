package com.ak;

interface Triangle {
    double area();

    double perimeter();
}

interface Right extends Triangle {
    double[] angles();
}

abstract class Isosceles {
    private double longSide, equalSide;

    public double perimeter() {
        return longSide + 2 * equalSide;
    }

    public void setsides(double ls, double es) {
        longSide = ls;
        equalSide = es;
    }

    public double getLongside() {
        return longSide;
    }

    public double getEqualSide() {
        return equalSide;
    }
}

public class RightIsosceles extends Isosceles implements Right {
    public static void main(String[] args) {
        RightIsosceles r1 = new RightIsosceles();
        r1.setsides(15, 10);
//        createProcess();
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        double[] angles = r1.angles();
        for (double element : angles) {
            System.out.println(element);
        }
    }

    public double area() {
        return getEqualSide() * getLongside() * 0.5;
    }

    public double[] angles() {
        double angle[] = {90, 45, 45};
        return angle;
    }
}
