package day05_ifContinue;

public class c6_EvenOdd {
    public static void main(String[] args) {
        //create a java project that will check if number is even or odd

        int number ;
        number = 25;
        String result ="";
        //lets try with if

        if (number %2 == 0) {
            result ="number is even";
        } else {
            result =number + "number is odd";
        }
        //shorcut of printline sout

        System.out.println(result);
        //ternary
        //if ==?
        //else == :

        String result2= (number%2== 0 ) ?number+ "number is even": number + "number is odd ";
        System.out.println(result2);
    }


}
