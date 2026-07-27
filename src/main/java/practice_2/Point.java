package practice_2;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void print() {
        System.out.println("Координата X: " + this.x + ", координата Y: " + this.y);
    }
}
