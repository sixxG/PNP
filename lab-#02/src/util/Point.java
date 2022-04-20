package util;

public class Point {
    private double x = 0; 
    private double y = 0;
    //constructor
    public Point(double a, double b) {
        x = a;
        y = b;
    };
    public Point() {};
    public double getX() {
        return x;
    };
    public double getY() {
        return y;
    };
}
