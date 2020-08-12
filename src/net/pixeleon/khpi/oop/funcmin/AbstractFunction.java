package net.pixeleon.khpi.oop.funcmin;

public abstract class AbstractFunction {
    public abstract double f(double x);

    public double findMin(double a, double b, double h) {
        double min = a;
        for (double xi = a; xi <= b; xi += h) {
            if (f(xi) < f(min))
                min = xi;
        }
        return min;
    }
}
