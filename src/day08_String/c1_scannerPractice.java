package day08_String;

import java.util.Scanner;

public class c1_scannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //to able to use library an object from class

        System.out.println("Employee First Name ");
        String firstName = input.next(); //next will only ecxept one word
        System.out.println("First Name is : " + firstName);

        //to handle enter that comes after next use below loine
        input.nextLine();

        System.out.println("Full name of employee  ");
        String fullName = input.nextLine();//will except enter
        System.out.println("full name is  " + fullName);

        //input.nextLine();

        System.out.println("Employee Company Name ");
        String compnayName = input.nextLine();
        System.out.println("Company Name is "+compnayName);
        System.out.println("Employee Age" );
        int age = input.nextInt();
        System.out.println("Age is "+age);
        //input.nextLine();
        //after passing age we can enter clivking will be accepted on nextlone
        input.nextLine();


        System.out.println("enter Employee city");
        String city = input.nextLine();
        System.out.println("City name is " +city);
        System.out.println("Enter salary of employee ");
        double salary = input.nextDouble();
        System.out.println("Salary is " + salary);



    }
}
