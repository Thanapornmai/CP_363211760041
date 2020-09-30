package exercise;

import Lad7.Student;

public class mySuperCar {
    public static void main(String[] args) {


        SuperCar SC1 = new SuperCar();

        SC1.setCarBrand("Fino");
        SC1.setCarColor(" black");
        SC1.setCarEngineSize(556);
        SC1.setMaxSpeed(160);
        SC1.setCountryOfOrigin("France");

        displayDataObject(SC1);


        SuperCar SC2 = new SuperCar();

        SC2.setCarBrand("Wave");
        SC2.setCarColor("red");
        SC2.setCarEngineSize(496);
        SC2.setMaxSpeed(150);
        SC2.setCountryOfOrigin("America");

        displayDataObject(SC2);

        SuperCar SC3 = new  SuperCar("msx","Blue sky",654,200,"Usa");

        displayDataObject(SC3);

        SuperCar SC4 = new  SuperCar("Bmw","black",454,150,"JP");

        displayDataObject(SC4);

        SuperCar SC5 = new  SuperCar("Toyota","red",554,170,"EN");

        displayDataObject(SC5);


    }

    private static void displayDataObject(SuperCar SC) {
        System.out.println(SC.getCarBrand());
        System.out.println(SC.getCarColor());
        System.out.println(SC.getCarEngineSize());
        System.out.println(SC.getMaxSpeed());
        System.out.println(SC.getCountryOfOrigin());

    }
}
