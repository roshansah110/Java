interface A {
    default void show() {
        System.out.println("Interface A show()");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B show()");
    }
}

class C implements A, B {

    public void show() {
        System.out.println("Diamond Problem Resolved in Class C");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
