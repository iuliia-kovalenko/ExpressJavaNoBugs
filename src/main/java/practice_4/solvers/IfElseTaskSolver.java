package practice_4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        System.out.println(checkParity(0));
        System.out.println(checkAge(17));
        System.out.println(checkAge(18));
        System.out.println(checkAge(60));
        System.out.println(checkAge(66));
        System.out.println(checkMax(4, 44, 9));
    }

    public static String checkParity(int number) {
//        if (number % 2 == 0) {
//           return "Четное";
//        } else {
//            return "Нечетное";
//        }
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    public static String ageDescription2(int age) {
        if (age < 18) {
            return "Несовершеннолетний";
        } else if (age <= 60) {
            return "Взрослый";
        }
        return "Пожилой";
    }

    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }
}
