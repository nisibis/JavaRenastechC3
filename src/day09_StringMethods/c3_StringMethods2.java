package day09_StringMethods;

public class c3_StringMethods2 {
    public static void main(String[] args) {


        //isempthy()

        String word = "mikail";
        System.out.println(word.isEmpty());//false

        String word2 = "";
        boolean b1 = word2.isEmpty();
        String word3 = " ";


        boolean b2 = word3.isEmpty();
        System.out.println(b1);
        System.out.println(b2);

        //length()
        String name = "recep";
        //01234
        System.out.println("name length " + name.length());
        System.out.println();

        int lastIndex = name.lastIndexOf("p");
        System.out.println("last index of name " + lastIndex);

        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(5)); exception out of index

        //to get last index number

        int lastindex2 = name.length()-1;
        System.out.println(lastindex2);



    }

}
