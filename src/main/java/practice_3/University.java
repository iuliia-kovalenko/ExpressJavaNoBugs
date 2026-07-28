package practice_3;

public class University {
    static String universityName = "Oxford";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name: " + this.studentName + ", student ID: " + this.studentID + ", University: "
        + universityName);
    }
}
