package net.pixeleon.khpi.oop.funcmin;

public interface SomeFunction {
    double f(double x);

    static double findMin(double a, double b, double h, SomeFunction func) {
        double min = a;
        for (double xi = a; xi <= b; xi += h) {
            if (func.f(xi) < func.f(min))
                min = xi;
        }
        return min;
    }
}
