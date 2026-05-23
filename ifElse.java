package Marquee;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i=0; i<=30; i++) {
            if(i%2 == 0)
                sum += i;

        }
        System.out.println(sum);
    }
}
