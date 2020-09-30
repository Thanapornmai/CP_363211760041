package Lad7;

public class StudentApp {
    public static void main(String[] args) {

        // create abject of Student elass
        Student std1 = new Student();

        std1.setName("Tanaporn Poonchum");
        std1.setPerson_id("1939900414012");
        std1.setAge(20);

        displayDataObject(std1);

        Student std2 = new Student();
        std2.setName("Wayare Sysmil");
        std2.setPerson_id("1939900421587");
        std2.setAge(21);

        displayDataObject(std2);

        std2.setName("Wayare Sysmil");

        Student std3 = new  Student("Sysaran Motser", "14565879526", 22);

        displayDataObject(std3);

        System.out.println(std3.toString());

    }//main

    private static void  displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getage());

    }
}//class
