package practice_8.hw.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* 4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
* является ли строка правильным электронным адресом.
* Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
* ^[^\s@]+@[^\s@]+\.[^\s@]+$
*/
public class Task4 {
    public static void main(String[] args) {
        try {
            checkEmailFormat("66666test.tu....");
        } catch (InvalidEmailException e) {
            System.out.println("Unchecked exception is caught: " + e.getMessage());
        }
    }

    static void checkEmailFormat(String email) {
        Pattern emailPattern = Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
        Matcher matcher = emailPattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Format of the email: " + email + " is not correct");
        } else {
            System.out.println("Format of the email: " + email + " is correct");
        }
    }
}
