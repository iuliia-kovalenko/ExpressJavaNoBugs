package practice_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

   void applyDiscount(double discount) {
        this.price = this.price - (this.price * discount/100);
   }

   void printInfo() {
       System.out.println("Product: " + this.name + ", price: " + this.price);
   }
}
