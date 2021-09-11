package day05_ifContinue;

public class c1_Practice {


    ////32. Write a Java program to compare two numbers. Go to the editor
    ////Input Data:
    ////Input first integer: 25
    ////Input second integer: 39
    ////Expected Output
    ////
    ////25 != 39
    ////25 < 39
    ////25 <= 39


    public static void main(String[] args ) {

        int number1 = 30;
        int number2 = 25;
        // ==
        //!=
        //<=
        //>=
        //>
        //<
        //if statement will be very usefull if you have some practices to print your code


        if (number1==number2) {  //equal
            System.out.println(number1 + " == " + number2);

        }

        if ( number1 != number2) { //not equal

            System.out.println(number1 + " != " + number2);
        }
        if (number1<number2) { //number1 smaller than num,ber 2

            System.out.println(number1 + " < " + number2);


        }
        if (number1>number2){

            System.out.println(number1 + " > " + number2);
        }

        if (number1>=number2) {

            System.out.println(number1 + " >= " + number2);
        }

        if (number1<=number2) {
            System.out.println(number1 + " <= " + number2);
        }

        int i1 = 20;
        int i2 = -i1++ +i1- ++i1;

        //-(20) + 21- (22)
        // -20 + 21 -22
        //-21
        System.out.println(i2);

        //check i2 number if it is possitive print or negative;

        if (i2<0) {
            System.out.println(i2+ "   is negative"); //+mean put them next to each other
            //-21 is negative
        }
        if (i2>0) {

            System.out.println(i2  +"  s possitive");
        }
        //number +number == new number
        //number+text ==numbertext



    }


}
