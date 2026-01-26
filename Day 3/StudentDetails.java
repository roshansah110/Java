class StudentDetails {
    int rollNo;
    String name;
    String division;

    // Constructor
    StudentDetails(int r, String n, String d) {
        rollNo = r;
        name = n;
        division = d;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Division: " + division);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails(1, "Rahul", "A");
        StudentDetails s2 = new StudentDetails(2, "Neha", "B");
        StudentDetails s3 = new StudentDetails(3, "Amit", "A");

        s1.display();
        s2.display();
        s3.display();
    }
}
