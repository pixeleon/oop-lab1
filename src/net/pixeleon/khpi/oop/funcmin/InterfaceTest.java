package net.pixeleon.khpi.oop.funcmin;

class MyFunction implements SomeFunction {

    @Override
    public double f(double x) {
        return x * x * x + 3 * x * x - x;
    }
}


public class InterfaceTest {

    public static double f(double x) {
        return x * x * x + 3 * x * x - x;
    }

    public static void main(String[] args) {
        FuncMinimum fmin = new FuncMinimum();
        //class using interface reference as parameter and class implementing the interface
        System.out.println(FuncMinimum.findMin(-3, 3, 0.001, new MyFunction()));
        //interface static method and class implementing the interface
        System.out.println(SomeFunction.findMin(-3, 3, 0.001, new MyFunction()));
        //interface static method and anonymous class
        System.out.println(SomeFunction.findMin(-3, 3, 0.001, new SomeFunction() {
            @Override
            public double f(double x) {
                return x * x * x + 3 * x * x - x;
            }
        }));
        //interface static method and lambda function
        System.out.println(SomeFunction.findMin(-3, 3, 0.001, x -> x * x * x + 3 * x * x - x));
        //interface static method and reference to method
        System.out.println(SomeFunction.findMin(-3, 3, 0.001, InterfaceTest::f));
    }
}


