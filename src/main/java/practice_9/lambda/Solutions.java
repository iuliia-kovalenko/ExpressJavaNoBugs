package practice_9.lambda;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Solutions {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------");
        int base = 10;
        IntSupplier s = () -> base + 5;
        System.out.println(s.getAsInt());

        System.out.println("---------------");
        int base1 = 10;
//        IntSupplier s1 = () -> base1 + 1; // final or effectively final
//        base1++;
//        System.out.println(s1.getAsInt());

        System.out.println("---------------");
        AtomicInteger x = new AtomicInteger(0);
        IntSupplier s2 = () -> x.incrementAndGet();

        System.out.println(s2.getAsInt());
        System.out.println(s2.getAsInt());
        System.out.println(x.get());

        System.out.println("---------------");
        run(() -> System.out.println("R"));
        run(() -> 42);

        System.out.println("---------------");
//        call(() -> 7);

        System.out.println("---------------");

//        Supplier<Integer> s3 = () -> {
//            if (System.currentTimeMillis() > 0) throw new RuntimeException("x");
//            return 1;
//        };
//        System.out.println(s3.get());

        System.out.println("---------------");
        BiFunction<Integer, Integer, Integer> f = (var a, var b) -> a + b;
        System.out.println(f.apply(2, 3));

//        BiFunction<Integer, Integer, Integer> f2 = (var a, b) -> a + b; // либо (a, b), либо указать типы!!!!
//        System.out.println(f2.apply(2, 3));

    }

    static void run(Runnable r) {
        r.run();
    }

    static void run(Callable<Integer> c) throws Exception {
        System.out.println(c.call());
    }

    static void call(Supplier<Integer> s) {
        System.out.println("S " + s.get());
    }

    static void call(Callable<Integer> c) throws Exception {
        System.out.println("C " + c.call());
    }
}

class L7 {
    private final String name = "Outer";

    void test() {
        Runnable r = () -> System.out.println(this.name);
        r.run();
    }

    public static void main(String[] args) {
        new L7().test();
    }
}

class L8 {
    private final String name = "Outer";

    void test() {
        Runnable r = new Runnable() {
            private final String name = "Inner";

            @Override
            public void run() {
                System.out.println(this.name);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        new L8().test();
    }

}

class L11 {
    static void m1(Function<String, String> f) {
        System.out.println(f.apply("a"));
    }

    static void m(Function<Integer, Integer> f) {
        System.out.println(f.apply(1));
    }

    public static void main(String[] args) {
//        m(x->x);
        // вариант 1 — явное приведение
        m1((Function<String, String>) x -> x);   // → "a"
        m((Function<Integer, Integer>) x -> x); // → 1

// вариант 2 — через переменную
        Function<String, String> fs = x -> x;
        m1(fs); // → "a"

        Function<Integer, Integer> fi = x -> x;
        m(fi); // → 1

// вариант 3 — явный тип параметра в лямбде
        m1((String x) -> x);  // → "a"
        m((Integer x) -> x); // → 1
    }
}

class L12 {
    interface X {
        void run() throws IOException;
    }

    public static void main(String[] args) {
        X x = () -> {
            throw new IOException("io");
        };
        try {
            x.run();
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}