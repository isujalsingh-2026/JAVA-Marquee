package Marquee.JavaFunction;
import java.util.*;


// Create void function with parameter and arguments.
public class VoidFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String student = sc.nextLine();
        String college = sc.nextLine();

        greet(student, college);
    }

    static void greet(String student, String college) {
        System.out.println("Hello " + student + ", Welcome to " + college);
    }
}
