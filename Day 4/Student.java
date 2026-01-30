public class Student {

    int rollNo;

    static String college = "ABC College";

    void displayStudent(int r) {
        rollNo = r;
        System.out.println("Roll Number: " + rollNo);
        System.out.println("College: " + college);
    }

    static void showCollege() {
        System.out.println("College Name: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayStudent(101);

        Student.showCollege();
    }
}
