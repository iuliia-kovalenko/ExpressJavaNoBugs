package practice_9.funcinterfaces;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        UnaryOperator<int[]> op = arr -> {
            arr[0] = 99;
            return arr;
        };

        int[] b = op.apply(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(a == b);
    }
}
