package day09_StringMethods;

public class c1_StringMethods {

    public static void main(String[] args) {

        //you will create a as scanner where you ask user howi the weather
        //2/you will need to strore that in a stringto check in the if statement
        //3/you will create if else block where you check weather
        //if weather is good you create another scanner where it ask user to put temperature
        //if weather is bad you ask for temperrature


        String sentence = "Hello world. Java is here llllo";

        char ch = sentence.charAt(3);
        System.out.println(ch);//l
        System.out.println(sentence.charAt(2));//l

        System.out.println(sentence.indexOf("l"));//it will check first matching l from sentence and
        //return first l index number which is 2
        System.out.println(sentence.indexOf("ll"));//index 2
        System.out.println(sentence.indexOf("lo"));
        //to get second lo from seconf lo;
        int indexNumber = sentence.indexOf("lllo");
        System.out.println(indexNumber);

        System.out.println(indexNumber + 2);
        int lastIndexe = sentence.indexOf("e ");
        System.out.println(lastIndexe);
        System.out.println("last e " + lastIndexe);

        String sentence2 = "Hello world. Java is here llllo";

        System.out.println("*****************");
        //to get last l index

        System.out.println(sentence2.lastIndexOf("l"));

        int indeFirstl = sentence2.indexOf("l");
        int indexLastl = sentence2.lastIndexOf("l");
        int indexSecondl = sentence2.indexOf("lo");
        int indexBeforelastl = sentence2.lastIndexOf("llo");
        System.out.println(indeFirstl+ "," + indexLastl);
        System.out.println(indexSecondl + " ," + indexBeforelastl);





    }


}
