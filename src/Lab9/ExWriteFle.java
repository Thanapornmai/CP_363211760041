package Lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//1.สร้างไฟล์ ชื่อ myName .txt
//2.เขียนข้อมูล ชื่อ-สกุล ภาษาอังกฎษ ลงในไฟล์ myName.txt
public class ExWriteFle {

    public static void main(String[] args) throws IOException {

        Path pFile = Paths.get("myname.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(pFile, StandardCharsets.UTF_8);

            String msg = null;
            System.out.println("Text fwom file: ");
            while ((msg = reader.readLine())!= null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //set path file
        pFile = Paths.get("myname.txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(pFile,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            writer.write("Tanaporn Poonchum mai");
            writer.newLine();
            writer.close();
        } catch (IOException e )   {
            e.printStackTrace();
        }







    }//main
}//class
