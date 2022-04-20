package laba5_pp;

import List.ListElement;
import List.ListUtils;

import java.util.*;

public class Laba5_PP {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Введите число элементов: ");
        int N = console.nextInt();
        System.out.print("Введите элементы: ");
        
        //Вводим элементы
        ListElement first = null;
        for(int i = 0; i < N; i++){
            int value = console.nextInt();
            first = ListUtils.insert(first, value);
        }
        
        //Выбираем нужные элементы
        ListElement ListElemFiltered = ListUtils.filter(first);
        //Вычисляем кубы этих элементов
        ListElement ListElemMap = ListUtils.map(ListElemFiltered);
        //Считаем суммы кубов
        int result = ListUtils.reduce(ListElemMap);
        
        //Выводим элементы
        while (first != null){
            System.out.println(first.getValue());
            first = first.getNext();
        }
        
        System.out.println(result);
    }
    
}
