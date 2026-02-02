abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);
}

class MyCalculator extends Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }
}

public class AbstractCalculator {
    public static void main(String[] args) {
        Calculator c = new MyCalculator();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10, 5));
        System.out.println("Multiplication: " + c.multiply(10, 5));
        System.out.println("Division: " + c.divide(10, 5));
    }
}
