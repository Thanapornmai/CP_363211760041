package Lad8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer numder: ");
            int num = sc.nextInt(); //***
            System.out.println("The num is"+num);
        }catch (InputMismatchException ex){
                ex.printStackTrace();
        }



        System.out.println("Good Bye.");
    }
}
