package day03_variablesContinune;
public class Assigment {
    public static void main(String[] args) {
        System.out.println("First Part");
        ////1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        ////Expected Output :
        ////Hello
        ////Alexandra Abramov

        System.out.println("Hello");
        System.out.println("Mikail Can");
        System.out.println("===============");

        System.out.println("Second part");

        // 2. Write a Java program to print the sum of two numbers.
        ////Test Data:
        ////74 + 36
        ////Expected Output :
        ////110

        int a = 74;
        int b = 36;

        System.out.println("a+b = "+(a+b));
        System.out.println("===============");
        System.out.println("Third part");
        //3. Write a Java program to divide two numbers and print on the screen.
     //Test Data :
     //50/3
     //Expected Output :
     //16

        int x = 50;
        int y = 3;
        System.out.println("x/y =" + (x/y));
        System.out.println("===============");
        System.out.println("Fourth part");

        // //4. Write a Java program to print the result of the following operations.
        ////Test Data:
        ////a. -5 + 8 * 6
        ////b. (55+9) % 9
        ////c. 20 + -3*5 / 8
        ////d. 5 + 15 / 3 * 2 - 8 % 3
        ////Expected Output :
        ////43
        ////1
        ////19
        ////13
        ////

        int a1 = -5+8*6;
        int b1 = (55+9)%9;
        int c1 = 20 + -3*5/8;
        int d1 = 5 + 15/3 *2 - 8%3;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println("===============");
        System.out.println("Fifth part");
        // //5. Write a Java program that takes two numbers as input and display the product of two numbers.
        ////Test Data:
        ////Input first number: 25
        ////Input second number: 5
        ////Expected Output :
        ////25 x 5 = 125

        int frst = 25;
        int scnd = 5;
        System.out.println("25*5 = " + (frst*scnd));

        System.out.println("===============");
        System.out.println("Sixth part");

        // //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        ////Test Data:
        ////Input first number: 125
        ////Input second number: 24
        ////Expected Output :
        ////125 + 24 = 149
        ////125 - 24 = 101
        ////125 x 24 = 3000
        ////125 / 24 = 5

        int firstNumber = 125;
        int secondNumber = 24;
        
        System.out.println("125+24 = " + (firstNumber+secondNumber));
        System.out.println("125-24 = " + (firstNumber-secondNumber));
        System.out.println("125*24 = " + (firstNumber*secondNumber));
        System.out.println("125/24 = " + (firstNumber/secondNumber));
        System.out.println("===============");
        System.out.println("Seventh part");
        // /7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
        ////Test Data:
        ////Input a number: 8
        ////Expected Output :
        ////8 x 1 = 8
        ////8 x 2 = 16
        ////8 x 3 = 24
        ////...
        ////8 x 10 = 80

        int num1 = 8;
        int num2 = 1;
        System.out.println( num1 + " * " + num2 + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println( num1 + " * " + (++num2) + " = " +(num1*num2));
        System.out.println("===============");
        System.out.println("Eighth part");
        // /8. Write a Java program to display the following pattern.
        ////Sample Pattern :
        ////
        ////   J    a   v     v  a
        ////   J   a a   v   v  a a
        ////J  J  aaaaa   V V  aaaaa
        //// JJ  a     a   V  a     a

        System.out.println("   J    a   V     V  a");
        System.out.println("   J   a a   V   v  a a");
        System.out.println("j  J  aaaaa   V V  aaaaa");
        System.out.println("JJJ  a      a  v  aaaaaaa");
        //I have confused my brain out..:)
        System.out.println("===============");
        System.out.println("Ninth part");
        // /9. Write a Java program to compute the specified expressions and print the output.
        ////Test Data:
        ////((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        ////Expected Output
        ////2.138888888888889
        double net = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        System.out.println(net);
        System.out.println("===============");
        System.out.println("Tenth part");
        //10. Write a Java program to compute a specified formula.
        ////Specified Formula :
        ////4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        ////Expected Output
        ////2.9760461760461765

        double net2 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(net2);
        System.out.println("===============");
        System.out.println("Eleventh part");

        /*12. Write a Java program that takes three numbers as input to calculate
        and print the average of the numbers.*/
        int b4 = 10;
        int  b5 = 20;
        int  b6 = 12;
        int  b7 = (b4+b5+b6)/3;
        System.out.println("average of those numbers   " +b4+","+b5+" and "+b6+" are = "+b7);


    }


}
