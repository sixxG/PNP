package MyClases;

import MyInterfaces.MyInterface;

public class SecondClass implements MyInterface {
    public int count(int number){
        int a = 2;
        int b = 0;
        int cont = 0;
        while(number >= a){
            if(number % a == 0 && b != a){
                cont++;
                number /= a;
                b = a;
            } else if(a == 2){
                a++;
            } else{
                a += 2;
            }
        }
        return cont;
    }
}