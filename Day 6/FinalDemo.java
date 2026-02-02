final class Demo {          
    final int X = 10;       

    final void display() {  
        System.out.println("Final variable value: " + X);
        System.out.println("This is a final method.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
