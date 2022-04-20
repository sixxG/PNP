package carshop.Interface;

public interface Customer {
    public double getCarsPrice();
    public void getCarColors();
    public double getCarPrice(int id);
    public String getCarColor(int id);
    public void purchaseCar(int id);
}
