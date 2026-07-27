package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo() {
        System.out.println("GroupName: " + this.groupName + ", total students: " + this.studentCount);
    }
}
