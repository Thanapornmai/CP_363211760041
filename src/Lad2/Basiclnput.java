package Lad2;

import java.util.Scanner;

public class Basiclnput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name ?;");
        String name = scanner.nextLine();

        System.out.print("Your name is"+name);

        System.out.print("อายุเท่าไร ?: ");
        int ags = scanner.nextInt();
        System.out.println("อายุของคุณคือ "+ ags);

        System.out.print("Enter you  nick name ?;");
        String nickname = scanner.nextLine();

        System.out.print("Your nickname is"+nickname);


    }


}
