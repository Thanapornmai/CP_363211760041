package Lad4;

public class Example_basicMethod {
    public static int C(int x , int Y){
        //statement
        System.out.println("Hallo c.");
        int sum = x + Y;
        return sum;
    }//C
    public static void B(int x){
        //Statement
        System.out.println("Hllo B "+x);
    }//B
    public static void main(String[] args) {
        System.out.println("Hollo Main.");
        //call A()
        A();
        A();
        A();
        //call B()
        B(200);
        //call c()
        int num = C(300,500); //800
        System.out.println(num);
        System.out.println(C(30,50));
    }//main


    public static void A(){
        //statement
        System.out.println("Hollo A.");
        B(500);
    }//A



}//class
