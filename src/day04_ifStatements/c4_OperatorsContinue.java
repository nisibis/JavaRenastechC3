package day04_ifStatements;

public class c4_OperatorsContinue {
    public static void main(String[] args ) {

        int x = 125;
        System.out.println(x);


        //if you want to reassign your varianle you should it by variable name

        x=100;
        System.out.println(x);
        x = x+10;//110
        System.out.println(x);
        x=x+20;//130
        System.out.println(x);

        x += 20;// x=x+20
        System.out.println(x); // x = x+20

        int y = 20;
        y = y+20;//y + =20
        y +=20;
        System.out.println(y);

        y *= 2;
        System.out.println(y);
        x =-y; //x =-120
        x-=y; //-120 + -120
        System.out.println(x);
        System.out.println("*************");
        int z = 10;
        int w = 20;

        // z=w+z+10; //40

        z = w-z+10 + --z;
       // z = 20-(10)+ (9) //20

        int number = 20;
        number*=2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);


        z -= z+z-z+20; //29-(29+29-29+20) =-20
        System.out.println(z);


    }
}
