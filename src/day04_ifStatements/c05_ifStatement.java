package day04_ifStatements;

public class c05_ifStatement {
    public static void main(String [] args ) {

        boolean bool1 = 10>5;//true
        boolean b2 = 10 ==12;//false

        if (2>2) {  //opening bracket for if //false
            //  if if condition is false java will not check inside the statement

            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");

        } //closing bracket for if
        System.out.println("Java"); //true
        //if if statement is true java will go check inside in if method

        if (1==1) {
            System.out.println("World");
        }
        if (b2) {  //b2 was a false statement

            System.out.println(b2); //this wont be printed
        }
        if (true) { // if is true java will executed i statement
            System.out.println("b2 is " + b2); // b2 is false // inside of if is true no matter
            //what is inside it is gonna work

        }




    } //closing braket for main
} // closing for out class



