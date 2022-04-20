package laba4_pp;

import java.util.*;
import Point_Class.Point;
import Point_Class.PointComparator;

public class Laba4_PP {

    public static Point read(Scanner console) {
        System.out.print("Введите координаты X и Y точки: ");
        int X = console.nextInt();
        int Y = console.nextInt();
        return new Point(X, Y);
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PointComparator PC = new PointComparator(); 
        Set set = new TreeSet(PC);
        
        System.out.print("Введите количество точек: ");
        int N = console.nextInt();
        
        for (int i = 0; i < N; i++) {
            set.add(read(console));
        }
        
        for (Object o : set) {
            System.out.println(o);
        }
    }   
}
