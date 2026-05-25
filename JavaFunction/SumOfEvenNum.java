package Marquee.JavaFunction;
import java.util.*;


// WAP to return sum of even numbers b/w Start and End.

public class SumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = Add(n, m);
        System.out.println(sum);
    }
    static int Add(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
