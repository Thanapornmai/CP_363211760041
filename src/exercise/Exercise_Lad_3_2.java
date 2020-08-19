package exercise;

public class Exercise_Lad_3_2 {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) { // row
            for (int j = 1; j <= i ; j++) { // column
                System.out.print("*");
            }//j
            System.out.println();
        }//i
    }
}
