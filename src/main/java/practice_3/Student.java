package practice_3;

public class Student {
    final static int MAX_YEARS = 11;
    static int studentCount;

    static {
        studentCount = 0;
    }

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        studentCount++;
    }


    int getAge() {
        return this.age;
    }

    static void printMaxYears() {
//        int a = 1;
        System.out.println(MAX_YEARS);
    }
}
