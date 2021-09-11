package day08_String;
//import java.lang.String;//no need to import because java will import automatically

public class c2_StringClass {
    public static void main(String[] args) {
        //to create a string


        ////import java.lang.String; no need to import beacause java will import automaticlly
        //
        //public class c2_StringClass {
        //
        //    public static void main(String[] args) {
        //
        //        //to create a string
        //       // String str="Hello";
        //
        //        /*
        //            in Java, string is an object that represents a sequence of characters.
        //            The java.lang.String class is used to create a string object.
        //
        //            How to create a string object?
        //            There are two ways to create String object:
        //
        //            1.By string literal
        //            2.By new keyword
        // */
        //        //create an string object 1.By string literal
        //        //Java String literal is created by using double quotes. For Example:
        //        //
        String str = "Hello";

        //for example :
        String str1 = "Hello"; //by string literal java will check pool and since we dont have have "hello"
        //in the pool memory java will create new sttring under pool memory
        String str2 = "Hello";// this wont create a new instance under pool memory
        //because if string already excist in teh pool, a referrence eo the pooled instance will be returned
        //to reason of java use strinng literall logic is to make java memory more efficient

        //2.by new keyword

        String str3 = new String("Hello");
        //it will create an object called hello under java heap memory(non-pool);

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        //we have 2 different objects and those 2 objects created under different memory
        //what is the different == and equals method


        String s1="New York ";//placed under string pool
        s1="Virginia"; //new object will be placed as virgina
        //s1 references will change virginai

        // in  java strings objects are immutable
        //immutable means object is unchangeable (cannot be modify)

        String s2 = "New York";






    }
}
