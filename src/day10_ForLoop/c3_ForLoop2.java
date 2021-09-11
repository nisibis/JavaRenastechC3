package day10_ForLoop;

public class c3_ForLoop2 {
    public static void main(String[] args) {

        //minus iteration

        for (int i = 6;i>-2; i--) { //startin point 6, 5 ,4,3,2,1,0,-1
            System.out.println("merhaba");
        }

        //starting point -1
        //ending point is 4
        //iteration -1
        //loop will be runnug condition gets false
        //if condition always true then your loop will be infinitve loop

        //for (int i = 0; i<5;i--) {
           // System.out.println("sabahulxeyr");
        //}

        for (int i =10;i<0; i++) {
            System.out.println("Mikail");

        }

        for (int i =10;i>0; i--) {
            System.out.println("Mikail");
        }
        for (float i =10;i>0; i--) {
            System.out.println("Mikail");
        }

        for (int number = 0; number<=10;number++){
           // System.out.println("number " +number + " square of nummber : " + number*number);
            System.out.println("number is : " +number);
            int squareResult = number*number;
            System.out.println(" Square of number is  : " +squareResult);

        }




    }
}
