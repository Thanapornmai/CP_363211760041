package Lab9;

import java.io.File;
import java.io.IOException;

public class ExCreateFile {
    public static void main(String[] args) {
        //Createdfile()
        File myFile = new File("exFile.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            }else {
                System.out.println("Can not create file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //CanRead()
        if (myFile.canRead()) {
            System.out.println("Can read this file.");
        }else {
            System.out.println("Can not read this file.");
        }
        //conWrite()

        if (myFile.canRead()) {
            System.out.println("Can Write this file.");
        }else {
            System.out.println("Can not Write this file.");
        }
        //exists()
        if (myFile.exists()) {
            System.out.println("This file is exists.");
        }else {
            System.out.println("This file is not exists.");
        }
        //getName()
        System.out.println("File name is "+myFile.getName());
        //getPath()
        System.out.println("Path file is "+myFile.getPath());
        //renameTo()
        File rFile =new File ("myNewFile.txt");
        if (myFile.renameTo(rFile)) {
            System.out.println("File name is already changed.");
        } else {
            System.out.println("Can not change file name.");
        }
    }
}//main
