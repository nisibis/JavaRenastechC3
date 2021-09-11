package day08_String;

import java.math.MathContext;

public class c3_StringMethods {


    public static void main(String[] args) {
        //charAt()

        //charAt method will ask you pass index number (position number)

        String str = "Hello";
                    //01234
        //index number always start from 0 in the java

        char letter0 = str.charAt(0); // H
        System.out.println(letter0);
        System.out.println(str.charAt(3)); // L

        //char ch = str.charAt(5);
        //System.out.println(ch); //because our range 0-4 (make error)

        String word = "hello world";
                     //012345678910
        System.out.println("word char5 is : " + word.charAt(5));

        //concat() method ;
        //
        String firstName = "Mikail";
        String lastName = "Can";
        System.out.println(firstName+ " " + lastName);

        System.out.println(firstName.concat(" " + lastName));
        System.out.println(firstName.concat(" ").concat(lastName));

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

        System.out.println("****************");
        System.out.println(fullName.concat(" "+ str).concat(" " + letter0));
        //concat method will only accept string
        //i cannot concat other then strimg

        int score = 90;
        System.out.println(fullName.concat(" " +score));

        //mikail can score is 90
        //System.out.println( fullName.concat( "is ").concat("score " + score));
        System.out.println(firstName.concat(" ").concat(lastName).concat(" ").concat("score is").concat(" "+score));

        //Method               Description                                                      Return Type
        //charAt()             Returns the character at the specified index (position)          char
        //concat()             Appends a string to the end of another string                        String
        //contains()           Checks whether a string contains a sequence of characters            boolean
        //endsWith()           Checks whether a string ends with the specified character(s)     boolean
        //equals()             Compares two strings. Returns true if the strings are equal,
        //                      and false if not                                                 boolean
        //equalsIgnoreCase()   Compares two strings, ignoring case considerations               boolean
        //indexOf()            Returns the position of the first found occurrence
        //                      of specified characters in a string                              int
        //isEmpty()            Checks whether a string is empty or not                          boolean
        //lastIndexOf()        Returns the position of the last found occurrence of
        //                      specified characters in a string                                 int
        //length()             Returns the length of a specified string                         int
        //replace()            Searches a string for a specified value, and returns
        //                      a new string where the specified values are replaced             String
        //replaceFirst()       Replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement              String
        //
        //startsWith()         Checks whether a string starts with specified characters         boolean
        //substring()              Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character                        String
        //toLowerCase()        Converts a string to lower case letters                          String
        //toUpperCase()        Converts a string to upper case letters                          String
        //trim()               Removes whitespace from both ends of a string                        String
        //
        //     */



      //contains  checks whether a string contains a sequence of characters
        //contain will check if the string contains given value
        //if string contains it will true
        //if string doesnt containd it will false
        String sentence = "Java dsd kilk34343275";
        System.out.println(sentence.contains("a"));//true
        System.out.println(sentence.contains("A"));//false
        System.out.println(sentence.contains("Ja"));//true
        System.out.println(sentence.contains("Ja "));//false there is no ja(space) inside the sentence
        System.out.println(sentence.contains("va "));//true there is  va(space) inside the sentence

        boolean example = sentence.contains(" ");
        System.out.println(example);

        System.out.println("*************8");
        //endsWith() checks whether a string ends with the speciied characters
        String sentence2 = "Hello World Java 47";
        System.out.println(sentence2.endsWith("7"));
        System.out.println(sentence2.endsWith("47")); //true
        System.out.println(sentence2.endsWith("Java 47"));  //true
        System.out.println(sentence2.endsWith("JavA 47"));  //false

        System.out.println("*************8");









    }
}
