package Lad3;

import java.util.Scanner;

public class Example_For2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Integers: ");
            int num = sc.nextInt();
            total += num; // ผลรวมเก็บใน total
        }
     //display
     System.out.println("Total: " + total);
     System.out.println("Average: " + total/10);


    }
}