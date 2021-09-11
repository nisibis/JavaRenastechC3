package day10_ForLoop;

public class c1_StringPractice {

    public static void main(String[] args) {

        //how do you split a sentecne in basic specific character

        String sentence = "Hello java planet,java is beatiful java is best";
        //to split second java

        int indexOfPlanet = sentence.indexOf("java is b");

        String splitedSentence = sentence.substring(indexOfPlanet);
        System.out.println(splitedSentence);

        System.out.println(sentence.length());
        //length is equal = last index + 1

        System.out.println(sentence.length()-1);






    }
}
