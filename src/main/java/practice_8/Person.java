package practice_8;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Person that = (Person) obj;
//        return this.name.equals(that.name) && this.age == that.age;
//    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        return result * 31 + age;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }
//
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }

}
