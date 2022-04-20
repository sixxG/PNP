package util;

public class Rectangle {
    private Point leftUP = new Point();
    private Point rightLW = new Point();
    
    public Rectangle(Point a, Point b) {
        leftUP = a;
        rightLW = b;
    }
    public double Perimetr(Rectangle a) {
        double leftSide = a.leftUP.getY() - a.rightLW.getY();
        double topSide = a.rightLW.getX() - a.leftUP.getX();
        
        return leftSide*2 + topSide*2;
    }    
}
