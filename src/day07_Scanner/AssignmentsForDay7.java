package day07_Scanner;

import java.util.Scanner;

public class AssignmentsForDay7 {




//Question 4
//Largest Number
//Write a program that asks the user to enter a numbers in three variables and then displays the largest number.
//
//Question 5
//Positive, negative or zero
//Write a program that prompts the user to input a number.
// The program should then output the number and a message saying whether
// the number is positive, negative, or zero.
//
//Question 6
//
//Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.
//
//Question 7
//Leap Year
//Any year is input by the user. Write a program to determine whether the year is a leap year or not.
//Leap Years are any year that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
//
//Example :
//1992      Leap Year
//2000      Leap Year
//1900      NOT a Leap Year
//
//Question 8
//
//Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

//Question 9
//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100  A
//80-89   B
//70-79   C
//60-69   D
//0-59    F
//
//Question 10
//Meaning of Grade
//Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade    Meaning
//A        Excellent
//
//B        Good
//
//C        Average
//
//D        Deficient
//
//F        Failing

//Question 11
//
//Descending Order Names
//Write a program that prompts the user to enter three names.
// Your program should display the names in descending order.

    public static void main(String[] args) {
        ////Question 1
        ////Even or Odd
        ////Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.
        ////

        Scanner Program = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int number = Program.nextInt();

        if (number % 2 ==0)  {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

        Program.nextLine();

        System.out.println("**********************");
        ////Question 2
        ////Absolute value
        ////Write a program that asks the user to enter a number and displays the absolute value of that number.
        ////
        int x = 45;
        int y = -453;

        System.out.println("Absolute value of  ("+x+") = "+ Math.abs(x));
        System.out.println("Absolute value of  ("+y+") = "+ Math.abs(y));

        System.out.println("***********************");
        System.out.println("Question 3");
        ///Question 3
        ////Discount and Revenue
        ////Revenue can be calculated as the selling price of the product times the quantity sold, i.e.
        // revenue = price × quantity.
        // Write a program that asks the user to enter product price and quantity and
        // then calculate the revenue.
        // If the revenue is more than 5000 a discount is 10% offered.
        // Program should display the discount and net revenue.







    }
}
