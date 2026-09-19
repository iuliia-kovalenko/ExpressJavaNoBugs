package practice_9.funcinterfaces;

public class Task10 {
        @FunctionalInterface
        interface Mapper {
            String map(String s);

            default Mapper then(Mapper after) {
                return x -> after.map(this.map(x));
            }
        }

    public static void main(String[] args) {
        Mapper m1 = s -> {
            System.out.print("m1 ");
            return s.trim();
        };

        Mapper m2 = s -> {
            System.out.print("m2 ");
            return s.toUpperCase();
        };

        Mapper m3 = s -> {
            System.out.print("m3 ");
            return "[" + s + "]";
        };

        String r = m1.then(m2).then(m3).map("  hi  ");
        System.out.println();
        System.out.println(r);
    }

}
