package practice_2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        if( discount < 0) {
            System.out.println("Discount can not be negative");
            return;
        }
        if (discount > 100) {
            System.out.println("Discount can not be more than 100 %");
            return;
        }
        this.price = this.price - (this.price * discount/100);
   }

    public void printInfo() {
       System.out.println("Product: " + this.name + ", price: " + this.price);
   }
}
