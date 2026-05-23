package Marquee;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int battery = 10;
        int count = 0;

        while(battery != 100) {
            if(battery % 10 == 0) {
                count++;
            }
            battery++;
        }
        System.out.println(count);
    }
}
