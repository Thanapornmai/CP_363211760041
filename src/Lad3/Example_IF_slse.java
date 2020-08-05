package Lad3;

import java.util.Scanner;

public class Example_IF_slse {
    public static void main(String[] args) {

        Scanner Scnner =new Scanner(System.in);

        System.out.println("Enter Integer 1: ");
        int x = Scnner.nextInt();
        System.out.println("Enter Integer 2: ");
        int y = Scnner.nextInt();
        //test condition
        if (x > y) {
            System.out.println(x + " more than " + y);
        } else {
            System.out.println(x + " less than " + y);
        }

    }
}
