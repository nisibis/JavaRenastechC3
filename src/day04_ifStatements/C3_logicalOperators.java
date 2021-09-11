package day04_ifStatements;

public class C3_logicalOperators {

    // && -- and
    // || -- or
    //  !  -- not (opposite)

    public static void main(String[] args ) {
        // && -- and
        System.out.println( (5>3) && (3>5) );//(true && false) //false
        System.out.println( (10<5) && (0==0));//false && true  //false
        System.out.println((1==2) && (2!=2));//false && false   //false
        System.out.println((10>=10) && (10<=10)); //true && true  // true

        //if you are using and operator only option that you will get your result is all conditions true
        //other then that alwasy will be false
        //true && true && true && false && true ==false







        // if you ars using and operatir only option that your results true
        // other then they alwatys will be false
        //treu+false+true = false

        System.out.println("***************");
        /// || -- or
        System.out.println( (5>3) || (3>5) );//(true || false) //true
        System.out.println( (10<5) || (0==0));//false || true  //true
        System.out.println((1==2) || (2!=2));//false || false   //false
        System.out.println((10>=10) || (10<=10)); //true || true  // true

        //  shift plus \ == |
        // shift + 7 == &&
        //true ||  true ||  true ||  false || true ==true
        //false || true || false == true

      System.out.println("***************");

        //  !  -- not (opposite)
        //!true == false
        //!!false == false

        boolean bool1 = true;
        boolean bool2 = ! ( 10 !=15 ); // false
        System.out.println(bool1 && bool2);

        Boolean bool3 = !!!!!!bool1; //true
        boolean bool4 = ! (15>-15);//false
        System.out.println((bool3||bool4) && true);//true

        System.out.println(("Mikail" =="Mikail") ||  ("ridvan" != "Ridvan")); //false || true
        //java is case sensitive language be able to compare two string the have to exact match

        System.out.println(("Pelin" == "Pelin ") || ("Ozgur12"=="Ozgur21")); // false or false

        //what ever you have in the string will be a character either an number or special character










    }
}
