package day07_Scanner;

import java.util.Scanner;

public class c5_scannerNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //next only one word so if you have two word
        // better to use next line
        System.out.println("enter full name");

        String fullName = scan.nextLine();

        System.out.println(fullName);
        Scanner input = new Scanner(System.in);
        System.out.println("Employe First Name");
        String firstName = input.next();
        System.out.println("Employee full name" + firstName);

        input.nextLine(); //this is will acccept enter


        String fullNAme = input.nextLine();
        System.out.println("full name " + fullNAme);


        //package day07_Scanner;
        //
        //import java.util.Scanner;
        //
        //public class c1_ScannerClass {
        //
        //
        //    public static void main(String[] args) {
        //
        //
        //        //first of all scanner is a librarry under java
        //        //libraries has ready methods created inside of librarry
        //        //to be able to use any librarrry we need call them in our class
        //        //and create object from that librarry
        //        Scanner input = new Scanner(System.in);
        //        //I called  scanner class (ready librarry under java) and created an object called input
        //        //to be able to crreate object we nedd to create new Scanner
        //
        //        //to import librarry
        //        // click on option + enter  for mac
        //        //click on alt + enter for windows
        //
        //        //to go to librray hold on ctrl or command then click on library name
        //    }
        //}
    }
}
