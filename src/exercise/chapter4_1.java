package exercise;

import java.util.Scanner;

public class chapter4_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        System.out.println("Enter a test 1: ");
        int a = Scanner.nextInt();
        System.out.println("Enter a test 2: ");
        int b = Scanner.nextInt();
        System.out.println("Enter a test 3: ");
        int c = Scanner.nextInt();
        System.out.println("Enter a test 4: ");
        int d = Scanner.nextInt();
        System.out.println("Enter a test 5: ");
        int e = Scanner.nextInt();
        System.out.println("Enter a test 6: ");
        int f = Scanner.nextInt();
        System.out.println("Enter a test 7: ");
        int g = Scanner.nextInt();
        System.out.println("Enter a test 8: ");
        int s = Scanner.nextInt();
        System.out.println("Enter a test 9: ");
        int i = Scanner.nextInt();
        System.out.println("Enter a test 10: ");
        int t = Scanner.nextInt();

        int total = a + b + c + d + e + f + g + s + i + t;
        int avg = total / 10;

        System.out.println("Total : " + total);
        System.out.println("Auerage : " + avg);




    }

}
