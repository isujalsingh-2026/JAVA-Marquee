package Marquee;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int n = 4;
//        for (int i=0; i<=n; i++) {
//            for (int j=0; j<=n; j++) {
//                System.out.print(i+""+j+" " ); //("" +i+j);
//            }
//            System.out.println();
//        }

//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

//        int n=4;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.print(" ");
//        }

//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//                System.out.print("* ");//("*"+" ")
//            }
//            System.out.println(); //solid square
//        }

//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); //right triangle
//        }

//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=i; j<=n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // Inverse right triangle
//        }


//        int n = 5;
//        for (int i=0; i<=n; i++) {
//            for (int j=0; j<=i; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print(0+" ");
//              } else {
//                System.out.print(1+" ");
//            }
//        }
//            System.out.println();
//        }

//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(i+ " "); //(j less than i chalega)
//            }
//            System.out.println();
//        }

//        int n=5;
//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//            for (int i=n; i>=1; i--) {
//                for (int j=1; j<=i; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println(); // Sandwich
//        }


//        int n=4;
//        //spaces
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n-i ; j++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=i; j++) { // (2 * i - 1)
//                    System.out.print("* ");
//                }
//            System.out.println();//Pyramid Triangle
//        }

//        int n=4;
//        //spaces
//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=n-i ; j++) {
//                System.out.print("  ");
//            }
//            //stars
//            for (int j=1; j<=(2 * i - 1); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();//Inverted Pyramid triangle
//        }

//        int n=4;
        //spaces
//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int j=1; j<=i; j++) {
//                System.out.print("* "); /// ye wala use karna h
//            }
//            System.out.println(); //Inverted Pyramid triangle
//        }

//        int n=4;
//        for (int i=0; i<=n; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print((char)('A'+j));
//            }
//            System.out.println( ); //char pattern
//        }


//        for (int i=n; i>=0; i--) {
//            for (int j=0; j<i; j++) {
//                System.out.print((char)('A'+j));//((char)('A'+j) +" ")
//            }
//            System.out.println( ); //Inverted char pattern
//        }

//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int k=1; k<=i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println(); //left triangle
//        }

//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int k=1; k<=i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println(); // Inverted left triangle
//        }


    }
}
