package MyClases;

import MyInterfaces.MyInterface;

public class FirstClass implements MyInterface {
    public int count(int number) {
        int cont = 0;
        while(number != 0) {
            cont++;
            number /= 10;
        }
        return cont;
    }
}
