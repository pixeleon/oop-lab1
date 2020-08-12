package net.pixeleon.khpi.oop.pointsarr;

public class ArrayWithPairsArray extends AbstractArrayOfPoints {

    private double[] pointsPairs = {};

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            pointsPairs[i * 2] = x;
            pointsPairs[i * 2 + 1] = y;
        }
    }

    @Override
    public double getX(int i) {
        return pointsPairs[i * 2];
    }

    @Override
    public double getY(int i) {
        return pointsPairs[i * 2 + 1];
    }

    @Override
    public int count() {
        return pointsPairs.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] newPointsPairs = new double[pointsPairs.length + 2];
        System.arraycopy(pointsPairs, 0, newPointsPairs, 0, pointsPairs.length);
        newPointsPairs[pointsPairs.length] = x;
        newPointsPairs[pointsPairs.length + 1] = x;
        pointsPairs = newPointsPairs;

    }

    @Override
    public void removeLast() {
        if (count() == 0) {
            return;
        }
        double[] newPointsPairs = new double[pointsPairs.length - 2];
        System.arraycopy(pointsPairs, 0, newPointsPairs, 0, newPointsPairs.length);
        pointsPairs = newPointsPairs;
    }

    public static void main(String[] args) {
        new ArrayWithPairsArray().test();
    }
}
