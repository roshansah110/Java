interface College {
    void showCollege();
}

class Person {
    String name;

    Person(String name) {
        this.name = name;   
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person implements College {

    int rollNo;

    Student(String name, int rollNo) {
        super(name);          
        this.rollNo = rollNo; 
    }

    public void showCollege() {
        System.out.println("College: ABC Engineering College");
    }

    void display() {
        super.display();   
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 101);

        s.display();
        s.showCollege();
    }
}
