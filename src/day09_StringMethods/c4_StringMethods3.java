package day09_StringMethods;

import java.util.Locale;

public class c4_StringMethods3 {

    //replace()              Searches a string for a specified value, and returns
    //                      a new string where the specified values are replaced               String
    //replaceFirst()         Replaces the first occurrence of a substring that matches the
    //                      given regular expression with the given replacement                String
    //
    //startsWith()       Checks whether a string starts with specified characters         boolean
    //substring()            Extracts the characters from a string,
    //                      beginning at a specified start position,
    //                      and through the specified number of character                      String
    //toLowerCase()          Converts a string to lower case letters                          String
    //toUpperCase()          Converts a string to upper case letters                          String
    //trim()                 Removes whitespace from both ends of a string                        String

    public static void main(String[] args) {
        String word="Hello world 123 hello world 123";
        //replace()              Searches a string for a specified value, and returns
        //                      a new string where the specified values are replaced               String

        //remove all e from word and pass x as a replecment
        System.out.println(word.replace("e","x"));
        System.out.println(word);

        //remove all world from sentence and replace with planet
        System.out.println(word.replace("world","planet"));
        System.out.println(word);//since we didnt reassigned this wont change

        word=word.replace("o","");
        System.out.println(word);


        //replaceFirst()         Replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement                String

        String str="Java is here , planet is Java , Java is planet";

        //replacefirst will only replace first matching one
        String newStr=str.replaceFirst("Java","Python");
        System.out.println(newStr);

        //replace will replace all the matching ones
        System.out.println(str.replace("Java","Python"));

        System.out.println(str.replace("Java ,","Python ,"));

        System.out.println("***************");

        String sentence = "Java hello Java 123 world";

        //check if sentence either startswith or endswith java

        boolean b1 = sentence.startsWith("Java ")||sentence.endsWith("Java");
        //check if start sentence startwith and endswith java

        boolean b2 = sentence.startsWith("Java") && sentence.endsWith("Java");

        if (b1) {
            System.out.println("sentence either starting or ending with java ");
            if (b2) {
                System.out.println("Sentence starts and ends with java");
            } else {
                System.out.println("since b1 is true one of theem starts with java");
            }
        } else {
            System.out.println("Sentence does not start or end with java");
        }



        //substring

        //we have 2 method
        //first substring(beginnig index, ending index ) :

        String letters = "Hello world java";
                        //012345678910

        //print world java
        System.out.println(letters.substring(6));
        //print world
        System.out.println(letters.substring(6,10+1));//last index wont be include
        //System.out.println(letters.substring(6,11));//last index wont be include
        System.out.println(letters.substring(0,4+1));
        System.out.println(letters.substring(12,15+1));


        //lets say you have long sentence and if you dont want to count

        int indexOfJava = letters.indexOf("j");
        System.out.println(indexOfJava);

        System.out.println(letters.substring(indexOfJava));




    }
}
