package practice_2;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Brand: " + this.brand + ", price: " + this.price);
    }
}
