package day07_Scanner;

public class c3_SwitchPractice {
    //Duplicate case values are not allowed.
//The value for a case must be of the same data type as the variable in the switch. (or smaller then switch range)
//The value for a case must be a constant or a literal. Variables are not allowed.
//The break statement is used inside the switch to terminate a statement sequence.
//The break statement is optional. If omitted, execution will continue on into the next case.
//The default statement is optional and can appear anywhere inside the switch block.
//          In case, if it is not at the end, then a break statement must be kept after the
//          default statement to avoid the execution of the next case statement.

//Accepted Data Types
//The variable passed as a switch argument can be one of the following:
//char
//byte
//short
//int
//String
//Integer,Short,Byte,Character

    public static void main(String[] args) {
        //create and logic that will check the number and print the day name
        byte b1 = 1;
        short s1 = 2;
        long l1 = 5; // not exceptable
        double d1 = 10;
        float f1 = 7;
        int number = 5;

        String dayName; //emoth string nit assigned anything yet
        String dayType;

        switch ( number) {

          ///The value for a case must be a constant or a literal. Variables are not allowed.
           //if yo do not specify whole number type java will take as an int number

            case 1:
                dayName = "monday";///Duplicate case values are not allowed.
            break;
            case 2:
                dayName = "Tuesday";
            break;
            case 3 :
                dayName = "wednesday";
            break;
            case 4 :
                dayName = "thursday";
                break;
            case 5:
                dayName = "friday";
                break;
            default:
                dayName ="Invalid day";

                break;

            case 6 :
                dayName ="Saturday";
                break;
            case 7 :
                dayName = "Sunday";
                break;


        }
        System.out.println(dayName);
        //print case number 1-5 as weekday
        //6-7 is weekend

        switch (number) {
            case 1 :
            case 2 :
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "invalid daytype";

        }
        System.out.println(number + "is a " +dayName);
        System.out.println(number+ "is a " + dayType);
        System.out.println(dayName + " is a " +dayType);


    }
}
