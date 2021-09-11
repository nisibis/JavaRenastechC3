package day03_variablesContinue;

public class c1_boolenCharContinue {
    //        boolean          1 bit          Stores true or false values
//        char             2 bytes            Stores a single character/letter or ASCII values   'a'
//
    public static void main(String[] args){

        boolean b1=false;
        boolean b2=25 == 30;//false
        boolean b3 = 20 != 21;//true

        //== that means equal
        //!= not equal
        System.out.println(b2);
        System.out.println(b3);

        // ! this will change your value as a opposite
        // !true = false
        // !false =true
        System.out.println(true == false);//false
        System.out.println(!true == false);//false == false  ---- true

        System.out.println(!true != !false);
        //(false != true) ----  true

        System.out.println( !(true == false) );
        //( !(false) )
        //( true  )

        System.out.println( !(true == true) == (false == !true) );
        // !(true == true)  --- > !(true) ---> false
        // (false == !true) --- > (false == false) -- true

        // (false == true) -- false


        //        char
        //     2 bytes            Stores a single character/letter or ASCII values   'a'

        char c = 'a';
        char c1 = '2';
        char c2 = '@';

        System.out.println(c);
        System.out.println(c1);

        //asci table
        //from asci 97 is small a
        //from ascii 67 is A

        int i = 97; //thi is number
        char ch = 97; //store characters

        System.out.println(i); // 97
        System.out.println(ch); // a

        System.out.println(i+ch);
        // since we have int number we want to sum with char code
        //java will take charr ascii number

        int i2 = 'c'; // c have 99 from ascii table
        System.out.println(i2);







    }
}