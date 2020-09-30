package Lad7;

public class Student {
    //  attributes
    private String name;
    private String person_id;
    private int age;
    //constructar
    //default constructar
    public Student(){}
    //design constructor
    public Student(String n,String pid,int a){
        name = n;
        person_id = pid;
        age = a;

    }

    //getter and setter
    //get คือ อ่านข้อมูลจาก attributer ของ objiect
    //set คือ เปลื่ยนแปลงหรือปรับปรุงข้อมูล attributer ของ objiect


    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }


    public String getPerson_id() {
        return person_id;
    }
    public void setPerson_id(String p_id) {
        person_id = p_id;
    }


    public int  getage() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", person_id='" + person_id + '\'' +
                ", age=" + age +
                '}';
    }
}//class
