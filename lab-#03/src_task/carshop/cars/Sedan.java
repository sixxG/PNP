package carshop.cars;

public class Sedan extends Car {
    public int length;
    public Sedan(int speed, boolean isSellOut,
            double regularPrice,
            String color, int length) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.length = length;
    }
    public double getSalePrice(){
        // если длина больше 20, скидка 5%
        if (length > 20) {
            return (regularPrice - (regularPrice / 100)*5);
        } else return regularPrice;
    }
}
