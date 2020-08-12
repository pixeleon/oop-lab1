package net.pixeleon.khpi.oop;

import java.util.Arrays;

public class Circle implements Comparable<Circle> {

    double radius;

    public Circle(double radius) {
        if (radius > 0)
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public int compareTo(Circle c) {
        return Double.compare(this.radius, c.getRadius());
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                '}';
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5.5),
                new Circle(12.06),
                new Circle(22),
                new Circle(7.2)
        };

        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));
    }
}
