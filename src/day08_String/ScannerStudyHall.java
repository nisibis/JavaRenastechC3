package day08_String;
//import java.util.Scanner;

import java.util.*;
public class ScannerStudyHall {

    /*
    I want create a condition
    score ==-60 ......D   fail
    score ==60 ......C
    score ==70 ......C+
    score ==80 ......B
    score ==90 ......B+
    score ==+90 ......A



        */



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");
        double score = scan.nextDouble();







        if (score>=60 && score<70) {
            System.out.println("C");
        } else if (score>=70 && score<80) {
            System.out.println("C+");
        } else if (score>=80 && score<90) {
            System.out.println("B");
        } else if (score>=90&&score<=100) {
            System.out.println("A");
        } else if (score<0 &&score<60) {
            System.out.println("less the  60 is fail " + score);
        }  else  {
            System.out.println("there is no such a score " + score);
        }
    }
}
