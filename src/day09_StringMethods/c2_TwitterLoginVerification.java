package day09_StringMethods;

import java.util.Scanner;

public class c2_TwitterLoginVerification {
    public static void main(String[] args) {
        ////create a logic that will check login function of facebook.
        //    //correct username = renastech
        //    //correct password = renastech123
        //
        //    //use scanner here to pass usernames and passwords
        //    //do validation of those usernames and password matching with correct credentials

        String expectedUserName = "renastech";
        String expectedPassWord = "renastech123";

        //false uername true password
        ///false password true username
        //false username false password


        Scanner input = new Scanner(System.in);//this will create object from scanner class
        System.out.println("Enter UserName ");
        String userInputForUserName = input.nextLine();
        System.out.println("Enter Password :");
        String userInputForPassword = input.nextLine();
        if (userInputForPassword.equals(expectedUserName) && userInputForPassword.equals(expectedPassWord)) {

            System.out.println("You have succesfully logged in ");
        } else {

            System.out.println("Login function has failed");
            System.out.println("invalid credentil please check your credentials");
            System.out.println("credentials are : " +userInputForUserName + "," +userInputForPassword);
        }

    }
}
