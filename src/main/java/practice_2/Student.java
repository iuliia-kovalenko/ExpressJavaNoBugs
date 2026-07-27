package practice_2;

public class Student {
    int age;
    String name;

    Student(){}

    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Age " + this.age + ", name " + this.name );
    }
}