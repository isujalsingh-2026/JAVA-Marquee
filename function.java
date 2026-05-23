package Marquee;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int mul = multiply(x,y);
        System.out.println(mul);

    }
    public static int multiply(int x, int y) {
        return x*y;
    }
}
