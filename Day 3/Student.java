class Student {

    // Instance variable
    int rollNo;

    // Static variable
    static String college = "ABC College";

    // Instance method
    void display(int r) {
        rollNo = r;
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display(101);
        s2.display(102);
    }
}
