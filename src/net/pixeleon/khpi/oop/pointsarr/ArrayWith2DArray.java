package net.pixeleon.khpi.oop.pointsarr;

public class ArrayWith2DArray extends AbstractArrayOfPoints {

    private double[][] points = {};

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            points[i] = new double[]{x, y};
        }
    }

    @Override
    public double getX(int i) {
        return points[i][0];
    }

    @Override
    public double getY(int i) {
        return points[i][1];
    }

    @Override
    public int count() {
        return points.length;
    }

    @Override
    public void addPoint(double x, double y) {
        double[][] newPoints = new double[points.length + 1][];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        newPoints[points.length] = new double[]{x, y};
        points = newPoints;

    }

    @Override
    public void removeLast() {
        if (count() == 0) {
            return;
        }
        double[][] newPoints = new double[points.length - 1][];
        System.arraycopy(points, 0, newPoints, 0, newPoints.length);
        points = newPoints;
    }

    public static void main(String[] args) {
        new ArrayWith2DArray().test();
    }
}
