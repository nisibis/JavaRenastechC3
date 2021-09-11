package day05_ifContinue;

public class taskAssigmentFor_day5 {

    public static void main(String[] args) {

        System.out.println("Task 1");

        //task 1: create a java program that will check if number is divisible by 2 and 5 same time

        int hijmar = 280; //this is randomly selected
        // Checking if remainder is 0 or not
        //When divided by 5
        //if (hijmar%5==0)
        //if (hijmar%2==0)

        if (hijmar%5==0 && hijmar%2==0) {
            System.out.println(hijmar + " is divided by 5 and 2 the same time");
        }

        System.out.println("Task 2");
        //task 2: write  java program to find the largest among three numbers. 1) Using if-else..if

        int n1 = 10; //n1>n2 && n1>n3
        int n2= 9; //n2>n1 && n2>n3
        int n3= 8; // n3>n1 && n3>n2

        if (n1>n2 && n1>n3) {
            System.out.println(n1 + " the bigger than all off them");
        }
        else if (n2>n1 && n2>n3) {
            System.out.println(n2 + " the bigger than all of them");
        }
        else {
            System.out.println(n3 + "bigger than all of them");
        }

        System.out.println("task 3");
        //task 3: create Program to check whether the given number is positive or negative
//    → If a number is greater than zero then it is a positive number
//            → If a number is less than zero then it is a negative number
//            → If a number is equal to zero then it is neither negative nor positive.

        int number=-1;// we can change de the number which we are curious about that;
        //positive or negative

        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }

        System.out.println("Question 3");

        //Question 3
//Discount and Revenue
//Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
// Write a program that asks the user to enter product price and quantity and then calculate the revenue.
// If the revenue is more than 5000 a discount is 10% offered.
// Program should display the discount and net revenue.

        //revenue == price*quantity
        //for instance i am using some number for be calculate

      int price = 1000;
      int quantity = 8;
      double discount;
        discount = 10f;
        // because of 10% means == 10/100;
        int revenue = (+price*quantity);



        if (revenue<5000) {

            System.out.println(revenue + "is just price*quantity");
        }
        else if (revenue>5000) {
            System.out.println( revenue + "  has desire to make discount percent  " + discount);


        }
        System.out.println("task 6");
        //Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.

        /*A triangle has three sides, three vertices, and three angles.
        The sum of the three interior angles of a triangle is always 180°.
        */
        int x = 60;
        int y= 70;
        int z = 50;

        if (x+y+z == 180 ) {

            System.out.println("This is a Great Triangle");
        }
        else if (x+y+z>180) {
            System.out.println("error");
            System.out.println("This is wrong triangle");
            System.out.println("Did you mean something different");
        }
        else {
            System.out.println("Dead End");
        }

    }
}
