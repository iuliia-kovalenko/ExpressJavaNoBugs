package practice_5;

public class Main {
    public static void main(String[] args) {
        Transport auto = new Auto(80, 4);
        System.out.println(auto.getCapacity());
        auto.move();
        Transport plane = new Plane(700, 200);
        plane.move();
        Transport ship = new Ship(100,1000);
        ship.move();

    }
}
