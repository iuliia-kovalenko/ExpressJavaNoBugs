package practice_6;

public class RollerCoaster extends Attraction {
    @Override
    public void info() {
        System.out.println("Острые ощущения");
    }

    @Override
    public void maintain() {
        System.out.println("Проверка безопасности");
    }
}
