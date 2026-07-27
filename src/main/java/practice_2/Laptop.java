package practice_2;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println("Brand: " + this.brand + ", price: " + this.price);
    }
}
