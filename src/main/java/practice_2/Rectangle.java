package practice_2;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return this.width * this.height;
    }
}
