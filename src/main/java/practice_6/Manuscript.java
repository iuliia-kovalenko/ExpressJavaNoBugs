package practice_6;

public class Manuscript extends Exhibit {
    @Override
    public void describe() {
        System.out.println("Древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Контролируемая влажность");
    }
}
