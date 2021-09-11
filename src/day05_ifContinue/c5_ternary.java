package day05_ifContinue;

public class c5_ternary {
    public static void main(String[] args) {
        //this is just another way if else block
        //create an java program that prints next number from two number

        int number1= 10;
        int number2 = 20;
        int max;//this is to store max number
        String message = ""; //this is will be message that we will print at the end

        System.out.println(message);
        if ((number1>number2)) {
            max = number1;


        } else {
            max = number2;
        }
        //System.out.println("maximum number is " +max );
        //message =
        message = "maximum number is " +max;
        //text+number ==text
        System.out.println(message);

        ///ternary
        int number3 = 35;
        int number4 = 45;
        int max2;

        max2=(number3>number4) ? number3 : number4 ;
        //if present question mark
        //else present :
        System.out.println(max2);

        String result = "";
        result = (false) ? "Java" : "Phyton";
        System.out.println(result);

        if (false) {
            result="Java";
        } else {
            result="Phyton";
        }
        System.out.println(result);



        }
    }

