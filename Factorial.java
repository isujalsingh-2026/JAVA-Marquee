package Marquee;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 0;

        while (num >= 1) {
            if(num == 1)
                fact = 1;
            fact += num * (num - 1);
        }

        System.out.println(fact);

    }
}


