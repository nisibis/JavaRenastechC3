package day03_variablesContinune;

public class c5_unaryOperators {
    public static void main(String[] args ) {

        int number1 = 10;
        int number2 = number1;


        System.out.println(number2);

        int number3 = 15;
        int number4 = -number3; //-15
        int number5 = +number3; //+15

        System.out.println("number3: " + number3);

        //ctrl+d copy some line

        int x = 10;
        int y = -x;

        boolean b1 = y>0;//-10>0 false
        boolean b2 = x>=0;//10>=0 true
        System.out.println(b1);
        System.out.println(b2);

        //if you have + before veriable it wont effect effect number
        //if you - before variable it make your number opposite
        int i1 = -15;
        int i2 = +i1;//=+- = -15
        int i3 = -i1;//= - - = +15
        int i4 = -i3;// - + = -15

        System.out.println(i4>i1);
        System.out.println(i4>=i1);
        System.out.println(i4);






    }
}
