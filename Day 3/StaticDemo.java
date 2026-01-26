class StaticDemo {

    // Static variable
    static int count = 10;

    // Static method
    static void showCount() {
        count = count + 5;   // modifying static variable
        System.out.println("Value of count: " + count);
    }

    public static void main(String[] args) {
        // Calling static method
        StaticDemo.showCount();
    }
}
