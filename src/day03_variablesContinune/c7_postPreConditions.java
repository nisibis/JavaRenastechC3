package day03_variablesContinune;

public class c7_postPreConditions {

    public static void main(String [] args ) {

        int x = 10;//post effect this number
        System.out.println(x);

        System.out.println(++x);
        System.out.println(x);
        System.out.println(+x);

        int y = 20;
        System.out.println(y++);//will increae the  number on next step
        System.out.println(y);
        x = x+5;


        System.out.println(x);

    }
}
