package practice_9.hw.part_1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Task1---------------");
        //1. Создайте свой функциональный интерфейс
        //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

        MathOperation add = (a, b) -> a + b;
        MathOperation substract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(add.operate(1, 4));
        System.out.println(substract.operate(1, 4));
        System.out.println(multiply.operate(14, 5));
        System.out.println(divide.operate(14, 5));

        System.out.println("-------------Task2---------------");
        //2. Использование анонимного класса
        //Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();

        System.out.println("-------------Task3---------------");
        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(5));
        System.out.println(even.test(6));

        System.out.println("-------------Task4---------------");
        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Five"));

        System.out.println("-------------Task5---------------");
        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

        Consumer<String> printToConsole = s -> System.out.println(s);
        printToConsole.accept("String to print");
    }
}
