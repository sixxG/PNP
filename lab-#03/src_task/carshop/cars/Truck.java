package carshop.cars;

public class Truck extends Car {
    public int weight;
    public Truck(int speed, boolean isSellOut,
            double regularPrice,
            String color, int weight) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.weight = weight;
    }   
    public double getSalePrice(){
        //если вес больше 2000, скидка 10%
        if(this.weight > 2000){
            return (regularPrice - regularPrice / 10);
        }else return regularPrice;
    }
}
