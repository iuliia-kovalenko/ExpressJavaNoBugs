package practice_3;

public class University {
    static String universityName = "Oxford";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student name: " + this.studentName + ", student ID: " + this.studentID + ", University: "
        + universityName);
    }
}
