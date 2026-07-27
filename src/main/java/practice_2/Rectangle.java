package practice_2;

public class Rectangle {
    double width;
    double height;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double calculateArea(double width, double height) {
        return width * height;
    }
}
