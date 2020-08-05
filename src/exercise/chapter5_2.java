package exercise;

import java.util.Scanner;

//1. รับค่า รัศมีวงกลม (r)
//2. หาพื้นที่วงกลม  (rI * r *r)
//3. หาเส้นรอบวง  (2 * rI * r)
//4. หาปริมาณทรงกลม (4/3 * *r*r*r)
public class chapter5_2 {

    public static final double PI =3.141;

    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        // รับค่ารัศมี r
        System.out.println("ระบุรัศมีวงกลม (r): ");
        double r = Scanner.nextDouble();

        //หาพื้นที่วงกลม
        double area =PI * r * r;
        System.out.println("พื้นที่วงกลม: "+area);

        //หาเส้นรอบวง
        double Cycle = 2 *PI * r;
        System.out.println("หาเส้นรอบวง: "+Cycle);

        //หาปริมาณทรงกลม
        double v = (4/3)*PI*r*r*r;
        System.out.println("หาปริมาณทรงกลม: " + v);


    }
}
