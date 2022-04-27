package Laba06;

import sorting.QuickSort;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QuickSort one = new QuickSort();
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = rnd.nextInt(100);
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("--------");
        one.sort(arr);
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}