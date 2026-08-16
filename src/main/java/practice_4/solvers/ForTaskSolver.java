package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
//        multiplyTable(5);

//        System.out.println(sumOfAllNumbers(10));
        printSimpleNumbers();
    }

    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printSimpleNumbers() {
        // простое число делится на себя и на 1
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= 100; i++) {
            if (isSimple(i)) {
                sb.append(i).append(", ");
            }
        }
        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public static boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
