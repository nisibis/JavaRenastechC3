package day04_ifStatements;

public class c06_minNumber {

    // 3 variable
    //x=4 y=3 z=2
    //output should be min number is 200
    // if x is the minimum taht mean x<y and x<z
    // if y is the minimum taht mean y<x and y<z
    // if z is the minimum taht mean z<y and z<x
    //




    public static void main(String [] arg) {

        int x = 100;
        int y = 200;
        int z =300;
        boolean b1 = z<x && z<y; //false
        boolean b2 = x<y && x<z;  //true
        boolean b3 = y<x && y<z;//false
        if (b1) {

            System.out.println("If my statement is true,java will work it b1");
        }

        if (b2) {
            System.out.println("If my statement is true,java will work it b2");
        }

        if (b3) {
            System.out.println("If my statement is true,java will work it b3");
        }
    }




}
