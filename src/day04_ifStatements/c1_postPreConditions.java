package day04_ifStatements;

public class c1_postPreConditions {

    public static void main(String[] args ) {

        byte x = 21;
        System.out.println(x);

        System.out.println(--x); // pre decrease number by one

               //post
        int w = 30;

        System.out.println(w--);// post 29 but it will be 28 in the next line
        System.out.println(w--);// post 29 it wil be 28 next line
        System.out.println(--w);// 27 next line  it will be be 29 on the next line
        System.out.println(w); //post  27
        System.out.println(w++);  // 27 will be next line
        System.out.println(w);

    }
}
