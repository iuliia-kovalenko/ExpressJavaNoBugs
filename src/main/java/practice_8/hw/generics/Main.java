package practice_8.hw.generics;

public class Main {
    public static void main(String[] args) {
        GenericMethods.printArray(new String[]{"first", "second", "third"});
        GenericMethods.printArray(new Double[]{0.5, 50.9, 11.0});

        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(10);
        System.out.println(pair.getFirst());

        pair.setSecond("Low score");
        System.out.println(pair.getSecond());

        System.out.println(pair);
    }
}