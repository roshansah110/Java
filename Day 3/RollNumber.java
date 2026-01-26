class RollNumber {

    static String collegeCode = "CS2026"; // common part
    static int counter = 1;

    void generateRoll() {
        System.out.println("Roll Number: " + collegeCode + counter);
        counter++;
    }

    public static void main(String[] args) {
        RollNumber s1 = new RollNumber();
        RollNumber s2 = new RollNumber();
        RollNumber s3 = new RollNumber();

        s1.generateRoll();
        s2.generateRoll();
        s3.generateRoll();
    }
}
