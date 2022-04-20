package carshop.impl;

//Побключаем интерфейсы
import carshop.Interface.Admin;
import carshop.Interface.Customer;

//Подключаем классы
import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;

public class MyOwnAutoShop implements Admin, Customer {
    //Метод вычисления суммарной цены проданных авто
    public double getIncome(){
        double sum = 0;
        for(int i = 0; i < autos.length; i++){
            if(autos[i].isSellOut){
                sum += autos[i].getSalePrice();
            }
        }
        return sum;
    }
    //Массив объектов авто
    public Car[] autos = new Car[5];
    //Заполнение массива объектов авто
    public Car[] getAutos(){
        autos[0] = new Sedan(100, false, 100000,
                "white", 25);
        autos[1] = new Ford(150, false, 150000,
                "black", 2022, 10000);
        autos[2] = new Ford(180, false, 200000,
                "grey", 2022, 15000);
        autos[3] = new Truck(110, false, 1000000,
                "red", 2500);
        autos[4] = new Truck(115, false, 1500000,
                "black", 5000);
        return autos;
    };
    //Метод подсчёта цены всех имеющихся авто
    public double getCarsPrice() {
        double sum = 0;
        for(int i = 0; i < autos.length; i++){
            if(!autos[i].isSellOut){
                sum += autos[i].getSalePrice();
            }
        }
        return sum;
    }
    //Метод вывода всех цветов авто
    public void getCarColors() {
        for(int i = 0; i < autos.length; i++){
            if(!autos[i].isSellOut){
                System.out.print(autos[i].color + " ");
            }
        }
    }
    //Метод вывода цены авто по id
    public double getCarPrice(int id) {
        if(id >= autos.length) {
            System.out.println("В налицие всего " 
                    + autos.length + "авто");
        }
        return autos[id].getSalePrice();
    }
    //Метод вывода цвета авто по id
    public String getCarColor(int id) {
        if(id >= autos.length) {
            System.out.println("В налицие всего " 
                    + autos.length + "авто");
        }
        return autos[id].color;
    }
    //Метод покупки авто
    public void purchaseCar(int id) {
        if(id >= autos.length) {
            System.out.println("В налицие всего " 
                    + autos.length + " авто");
        }else if(autos[id].isSellOut) {
            System.out.println("Данное авто уже купленно");
        }else autos[id].isSellOut = true;
    }
}
