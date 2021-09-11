package day04_ifStatements;

public class assigmentForDay04 {







    public static void main(String[] args ) {

        ////1.Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers

        int n1= 200;
        int n2= 350;
        int n3= 450;
        int n4= 550;

        int average = + (n1+n2+n3+n4)/4;
        System.out.println(average);



        ////2.please write a program that will return max number from 3 numbers

        int n5 = 5;
        int n6 = 6;
        int n7 = 7;
        boolean b1 = n7>n6&&n7>n5;//true+true =true
        boolean b2 = n5>n6 && n5>n7; //false+false = false
        boolean b3 = n6>n5 && n6 >n7;//true+false=false
        if (b1) {

            System.out.println("my maximum number is n7 : 7 " + (n7>n6 && n7>n5));


        }

        if (b2)  {
            System.out.println("my maximum number is n5 : 5 " + (n5>n6 && n5>n7));

        }

        if (b3) {

            System.out.println("my maximum number is n6 : 6 " + (n6>n7 && n6>n5));
        }

        //16. Write a Java program to print a face. Go to the editor
//Expected Output
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+
        System.out.println(" +\"\"\"\"\"+");//when I try put ""insiden "" it was confused then i just
        //from te questin and find the face :))
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");

        ////32. Write a Java program to compare two numbers. Go to the editor
        ////Input Data:
        ////Input first integer: 25
        ////Input second integer: 39
        ////Expected Output
        ////
        ////25 != 39
        ////25 < 39
        ////25 <= 39

        int x = 25;
        int y = 39;
        boolean m = 25 != 39;  //true
        boolean n = 25 < 39; //true
        boolean p = 25 <= 39; //true

        System.out.println(m);
        System.out.println(n);
        System.out.println(p);

        if (m) {
            System.out.println("m is gonna be  " +(25 != 39));
        }
        if (n) {
            System.out.println("n is also gonna be "+(25 < 39));
        }

        if (p) {
            System.out.println("p is "+(25 <= 39));
        }

        ////3.create a java program to check number is postive or negative

        int number=0;// we can change de the number which we are curious about that;
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

    }
}
