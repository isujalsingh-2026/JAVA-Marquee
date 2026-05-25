package Marquee.JavaFunction;
import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int Binomial = fact(n)/(fact(n-r)*fact(r));  // Binomial coefficient = nCr = n! / ((n-r)! * r!)
        System.out.println("nCr = " + Binomial);

        int permutation = fact(n) / fact(n-r);      //Permutation coefficient = nPr = n! /  b(n-r)!
        System.out.println("nPr = " + permutation);

    }

    static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
}
