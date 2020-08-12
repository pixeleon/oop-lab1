package net.pixeleon.khpi.oop;

import java.util.Arrays;

public class Triangle {
    double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getArea() {
        return Math.sqrt((sideA + sideB + sideC) * (sideB + sideC - sideA) *
                (sideA + sideC - sideB) * (sideA + sideB - sideC)) / 4;
    }

    @Override
    public String toString() {
        return "Triangle {area = " + String.format("%f",getArea()) + "}";
    }

    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(10, 8, 4),
                new Triangle(12, 15, 22),
                new Triangle(7, 20, 20)
        };

        System.out.println(Arrays.toString(triangles));
        Arrays.sort(triangles, (tr1, tr2) -> -Double.compare(tr1.getArea(), tr2.getArea()));
        System.out.println(Arrays.toString(triangles));
    }
}
