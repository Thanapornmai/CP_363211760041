package Lad3;

import java.util.Scanner;

public class Example_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter integers: ");
            num = sc.nextInt();
        } while (num != 0);

    }
}
