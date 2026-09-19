package practice_8.exceptions.solutions;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int x = 1 / 0;
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}

class Task2 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("bad org");
//            System.out.println("I will never run");
        } catch (RuntimeException e) {
            System.out.println("runtime");
        }
//        catch (IllegalArgumentException e) {
//            System.out.println("illegal");
//        }
    }
}

class Task3 {
    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        try {
            System.out.println("m1-1");
            m2();
            System.out.println("m1-2");
        } catch (IllegalArgumentException e) {
            System.out.println("m1-catch");
        }
        System.out.println("m1-end");
    }

    static void m2() {
        try {
            System.out.println("m2-1");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("m2-catch");
            throw new IllegalArgumentException();
        } finally {
            System.out.println("m2-finally");
        }
    }
}


class Task4 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static int test() {
        try {
            return 10;
        } finally {
            return 11;
//            System.out.println("finally");
        }
    }
}

class Task5 {
    public static void main(String[] args) {
        System.out.println(calc());
    }

    static int calc() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}

class Task6 {
    public static void main(String[] args) {
        try {
            System.out.println("start");
            method();
            System.out.println("after");
        } catch (Exception e) {
            System.out.println("caught " + e.getClass().getSimpleName());
        }
    }

    static void method() {
        try {
            int x = Integer.parseInt("abc"); //NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught in try method()");
        } finally {
            int y = 10 / 0; //ArithmeticException
        }
    }
}

class Resource implements AutoCloseable {
    private final String name;

    Resource(String name) {
        this.name = name;
        System.out.println("open" + name);
    }

    @Override
    public void close() {
        System.out.println("close " + name);
        throw new RuntimeException("close " + name);
    }
}

class Task7 {
    public static void main(String[] args) {
        try (Resource r1 = new Resource("R1");
            Resource r2 = new Resource("R2")) {
            System.out.println("body");
//            throw new RuntimeException("jhgjhsdg");
//            throw new IllegalStateException("jhgjhsdg");
        } catch (RuntimeException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}