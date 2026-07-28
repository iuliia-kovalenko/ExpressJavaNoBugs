package practice_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Student.studentCount);
//        Student student_1 = new Student(18, "Ivan");
//        System.out.println(Student.studentCount);
//        Student student_2 = new Student(20, "Sergey");
//        System.out.println(Student.studentCount);

//
//        System.out.println(student_1.age);
//        System.out.println(student_2.age);

//        int maxYears = Student.maxYears;
//        System.out.println(Student.MAX_YEARS);
//        Student.printMaxYears();
//        Company.printCompanyName();
//        Company company1 = new Company(1, "Employee1");
//        Company company2 = new Company(2, "Employee2");
//        Company.companyName = "Company_2";
//        Company.printCompanyName();
//
//        System.out.println(MathConstants.calculateCircumference(10));
//        System.out.println(MathConstants.calculateCircumference(3));
//        System.out.println(MathConstants.calculateCircleArea(2));
//        System.out.println(MathConstants.calculateCircleArea(5));
//        System.out.println(MathConstants.calculateExponentialGrowth(3, 2, 30));
//        System.out.println(MathConstants.calculateExponentialGrowth(2, 1, 2));


//        University university1 = new University(1, "John");
//        University university2 = new University(2, "Sophie");
//        University university3 = new University(3, "Mark");
//
//        university1.printStudentInfo();
//
//        University.changeUniversityName("UniversityNew");
//
//        university2.printStudentInfo();
//        university1.printStudentInfo();
//
//        GameSettings game1 = new GameSettings("Game1");
//        GameSettings game2 = new GameSettings("Game2");
//
//        game1.printGameStatus();
//        game2.printGameStatus();
//
//        game1.addPlayer();
//        game2.addPlayer();
//        game2.addPlayer();
//
//        GameSettings.setMaxPlayers(100);
//
//        game1.printGameStatus();
//        game2.printGameStatus();

        Person person1 = new Person("123-45-6789", "Petrov", "Ivan");
        Person person2 = new Person("888-99-5555", "Sergeev", "Andrey");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setFirstName("Alexander");
        person1.printPersonInfo();
        person2.printPersonInfo();

    }
}
