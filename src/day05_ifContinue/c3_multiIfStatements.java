package day05_ifContinue;

public class c3_multiIfStatements {

    public static void main(String[] args) {
        //you will prefer to use if you have more than two conditions
        //check 2 number
        //first check if they are ==
        //second is one of them bigger
        //last conditions is smaller

        int x = 45;
        int y= 35;

        if (x==y) { //java will check this block first
            System.out.println(x+"equal to" + y);
        } else if (x>y) { //it will check this one as a next step
            System.out.println(x+"is bigger than" + y);
        }
        else { //if both of if not true it will print this else
            System.out.println(x+  "  is smaller then" + y);
        }

        //else will cover what ever if and if else conditions
        //it will very at the end
        //// starting point is 0                                 print  you are at starting point
        //        // ending  point  is 10                           print  you are at ending point
        //        // between those numbers (0-10) will be  on my way    print  you are on your way
        //anything left will be wrong way                             print some warning messages

        int point = 10;
        if ( point == 0) { //covered 1 scnerio
            System.out.println("you are at starting point");
        } else if (point==10) { // covered 1 schnerio which is 10
            System.out.println("you are at ending point" );
        } else if (point>0 && point<10) { // covered  1 2 3 4 5 6 7 8 9
            System.out.println("you are on your way"); //

        } else  {

            //all other numbers this else block

            System.out.println("you are on wrong way");
            System.out.println("please check your way" + point);
            System.out.println("point has to be 0-10");
        }

        ////        x = 2 * x;
        ////        x = x + y - 2;
        ////        sum = sum + num;
        ////        y = y / (x + 5);
        //
        //        int x = 10 ;
        //        int y = 15;
        //        int sum =25;
        //        int num=5;
        //
        //        //        x = 2 * x;
        //        x *= 2;
        //
        //        //        x = x + y - 2;
        //        x += y -2;
        //
        //        //        sum = sum + num;
        //        sum += num;
        //
        //        //        y = y / (x + 5);
        //        y /= (x+5);


    }
}
