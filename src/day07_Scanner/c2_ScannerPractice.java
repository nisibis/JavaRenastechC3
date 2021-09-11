package day07_Scanner;

import java.util.Scanner;

public class c2_ScannerPractice {

    public static void main(String[] args) {
        Scanner newYork = new Scanner(System.in);
        //scanner is ready with object calls newYork
        //you can call any method from sccanner by using the object (newYork)

        System.out.println("Insert First Number" );
        //it is like int number1 = 25;

        int number1 = newYork.nextInt(); //we ask use to enter number from console
        System.out.println("You have inserted number : " + number1);
        //check if input even or odd number
        if (number1 % 2 ==0)  {
            System.out.println(number1 + " is even number");
        } else {
            System.out.println(number1 + " is odd number");
        }

        //max and min numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        short num1 = scanner.nextShort();
        System.out.println("Enter second Number");
        long num2 = scanner.nextLong();
        System.out.println("Enter Third Number");

        int num3 = scanner.nextInt();
        //exception in thread "main" java.util.inputmismatchexception
        //in the console if you pass something not ecxpcepted you woll an exceotion
        //max and min numbers

        int maxNumber = (num1>num2&&num1>num2) ? num1: (int) ((num2 > num1 && num2 > num3) ? num2 : num3);
        System.out.println("max number is "+maxNumber);
    }
}
