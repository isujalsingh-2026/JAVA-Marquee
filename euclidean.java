package Marquee;
import java.util.Scanner;

public class euclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 60;
        int min = 18;
        while(min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);
    }
}
