package practice_8.hw.exceptions;

/*
*Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
* Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
* */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }
}
