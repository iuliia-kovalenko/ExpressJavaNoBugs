package practice_6;

public class Sculpture extends Exhibit{
    @Override
    public void describe() {
        System.out.println("Скрульптрурный объект");
    }

    @Override
    public void preserve() {
        System.out.println("Реставрация");
    }
}
