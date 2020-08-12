package net.pixeleon.khpi.oop.funcmin;

public class SpecificFunction extends AbstractFunction {

    @Override
    public double f(double x) {
        return x * x * x + 3 * x * x - x;
    }

    public static void main(String[] args) {
        SpecificFunction func = new SpecificFunction();
        System.out.println(func.findMin(-3, 3, 0.001));
    }
}
