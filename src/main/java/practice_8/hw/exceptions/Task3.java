package practice_8.hw.exceptions;

/*
* 3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
*  Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
* */

public class Task3 {
    public static void main(String[] args) {
        try {
            checkAge(10);
        } catch (InvalidAgeException e) {
            System.out.println("Checked exception is caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("The age is invalid");
        } else {
            System.out.println("The age is correct");
        }
    }
}
