package day07_Scanner;

import java.util.Scanner;

public class c4_ScannerNext {
    public static void main(String[] args) {
        //for the strings to be able to scanner you will need to call next method from library
        //2 way to create string scanner
        //next and nextline
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name");
        //String firstName = "ozer";
        String firstName = input.next();
        System.out.println("first name is " +firstName);
        String lastName = input.next();
        System.out.println("enter last name  " + lastName);

        String fullName = firstName + ""+lastName;
        System.out.println(fullName);


    }
}
