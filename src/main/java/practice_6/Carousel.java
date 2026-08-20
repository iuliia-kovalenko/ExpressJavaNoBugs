package practice_6;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println("Спокойный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("Тех. обслуживание");
    }
}
