package practice_9.funcinterfaces;

import java.util.function.IntUnaryOperator;

public class Task8 {
    public static void main(String[] args) {
        int base = 10;
        IntUnaryOperator op = x -> x + base;
        System.out.println(op.applyAsInt(5));
//        base = 20;
    }
}
