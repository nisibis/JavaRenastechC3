package day07_Scanner;

import java.util.Scanner;

public class c1_ScannerClass {

    public static void main(String[] args) {
        //first of all scanner is a library under java
        //library has ready method created inside of library
        //to able to to use any library we need to code our class
        //and create object from that library
        //i called scanner class class (reday library under java) and created an object called input
        //to be able to create object we need to create new scanner


        //to import library click in option + enter for mac
        //clik on alt +enter for windiws


        Scanner input = new Scanner( System.in);
        System.out.println("insert your byte number");
        byte b1 = input.nextByte();
        //next byte method will ask to user enteer an number
        //then it will accept that number and assigfned to b1 variable
         int numberInt = input.nextInt();
        System.out.println("Number int is " + numberInt);

        Scanner scan = new Scanner(System.in); //this is another object comes from scanner class
        //name of object is scan
        short numberShort = scan.nextShort();
        System.out.println(numberShort);
    }
}
