package practice_8;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person("Nikita", 25);

        //toString
        System.out.println(nikita.toString());

        //Сравнение -> примитивы через ==, не примитивы через equals
        Person nikita2 = new Person("Nikita", 25);
        System.out.println(nikita.equals(nikita2));

        Person cloneNikita = nikita.clone();
        System.out.println(cloneNikita);

        System.out.println(nikita.getClass());

        System.out.println(nikita.getClass().equals(Person.class));
    }
}
