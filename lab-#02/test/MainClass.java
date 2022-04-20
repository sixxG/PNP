package test;

import util.Point;
import util.Rectangle;

public class MainClass {
    public static void main(String[] args) {
        Point firstPoint = new Point(1,5);
        Point secondPoint = new Point(10,1);
        
        Rectangle firstRectangle = new Rectangle(firstPoint, secondPoint);
        System.out.println(firstRectangle.Perimetr(firstRectangle));
    }
}
