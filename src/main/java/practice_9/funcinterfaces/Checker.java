package practice_9.funcinterfaces;

@FunctionalInterface
public interface Checker {
    //check if number satisfies the condition
    // default method print number, it satisfied

    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }
}
