package carshop.cars;

public class Ford extends Car {
    public int year;
    public int manufacturerDiscount;
    public Ford(int speed, boolean isSellOut,
            double regularPrice,
            String color, int year, int mD) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
        this.year = year;
        this.manufacturerDiscount = mD;
    }    
    public double getSalePrice(){
        //вычисляется как цена минус скидка производителя
        return (regularPrice - manufacturerDiscount);
    }
}
