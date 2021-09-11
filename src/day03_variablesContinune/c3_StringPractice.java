package day03_variablesContinune;

public class c3_StringPractice {

    public static void main(String[] args ) {
    String name1 = "Basoz";
    String name2 = "Bahast";

    int age1 = 22;
    int age2 = 24;
    System.out.println("Basoz age is 22");
    System.out.println(name1 + "age is: " + age1);
    System.out.println(name2 + "age is "+ age2);
    System.out.println("Person 1 name is :" + name1);

    System.out.println("Sum of person age is "+ age1+ age2); //text+number =text
    System.out.println("Sum of person is: " + (age1+age2));// text+(number+number) ==text

    int sumOfAges = age1+age2;
    System.out.println("Sum of all : " + sumOfAges);
    }
}
