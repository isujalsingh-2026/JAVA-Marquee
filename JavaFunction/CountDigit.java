package Marquee.JavaFunction;
import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(CountDigit(num));

    }

    static int CountDigit(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
}
