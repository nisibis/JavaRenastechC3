package day12_doWhileLoop;

public class c2_ReverseString {

    public static void main(String[] args) {
        //\
        String actualText = "Java is so fun !!!";
        System.out.println(actualText);
        String reverse = "";
        int lastIndex = actualText.length()-1; //last index of our text which is our first reverse

        do {
            //our gool is store each letter from last one to first one

            reverse+=actualText.charAt(lastIndex);
            lastIndex--;
            //from last index to first index
        } while (lastIndex>=0); //condition which is your end point which is index 0
        System.out.println(reverse);
    }


}
      // if your class red that means yo did not add to git;
//if it is
