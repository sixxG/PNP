package laba3_pp;

import MyInterfaces.MyInterface;
import MyClases.FirstClass;
import MyClases.SecondClass;
import java.util.Scanner;

public class Laba3_PP {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        FirstClass one = new FirstClass();
        SecondClass two = new SecondClass();
        
        System.out.print("Введите число: ");
        int number = console.nextInt();
        
        System.out.println("Кол-во символов в числе: " + one.count(number));
        System.out.println("Кол-во различных простых множителей: " + two.count(number));
    }
}
