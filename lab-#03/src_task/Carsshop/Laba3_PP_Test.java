package Carsshop;


import carshop.cars.Car;
import carshop.impl.MyOwnAutoShop;

public class Laba3_PP_Test {

    public static void main(String[] args) {
        
        MyOwnAutoShop shop = new MyOwnAutoShop();
        Car[] arr1 = shop.getAutos();
        
        //Покупаем авто
        shop.purchaseCar(4);
        shop.purchaseCar(2);
        shop.purchaseCar(0);
        
        System.out.println("Суммарная цена всех проданных авто: "
                + shop.getIncome());
        
        System.out.println("Суммарная цена всех имеющихся авто: "
                + shop.getCarsPrice());
        
        System.out.print("Все цвета авто, которые в наличии: ");
        shop.getCarColors();
        System.out.println();
        
        System.out.println("Цены на каждое авто: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Авто " + (i+1) + " :" + 
                    shop.getCarPrice(i));
        }
        
        System.out.println("Цвета каждого авто: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Авто " + (i+1) + " :" + 
                    shop.getCarColor(i));
        }
    }    
}
