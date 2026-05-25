package Marquee.JavaFunction;
import java.util.*;

public class SecondLastEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checksEven(n));

    }

    static boolean checksEven(int n) {
//       n /= 10;
//       int digit = n % 10;
//       if (digit % 2 == 0) {
//           return true;
//       }
//       return false;

        // generalize formula for nth digit from last digji.
        int count = 0;
        while (n > 0) {
            count++;
            if (count == 2) {
                int digit = n % 10;
                if(digit % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            n /= 10;
        }
        return false;
    }
}

