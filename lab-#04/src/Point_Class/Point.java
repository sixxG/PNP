package Point_Class;

public class Point {
    private final int X;
    private final int Y;
    
    public Point(int a, int b){
        this.X = a;
        this.Y =  b;
    }
    
    public String GetX(){
        return Integer.toString(X);
    }
    
    public String GetY(){
        return Integer.toString(Y);
    }
    
    @Override
    public String toString() {
        return "Point: " + X + " " + Y;
    }
}
