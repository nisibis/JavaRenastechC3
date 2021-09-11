package day05_ifContinue;

import java.util.Locale;

public class justRandomworks {

    public static void main(String[] args) {
        String txt = "sfklaj.Dhalsjdfvaskdhlfhsalhdflashlas";
        System.out.println("the length of text " + txt.length());

        String txt2 = "Hello world";
        System.out.println(txt2.toUpperCase(Locale.ROOT));
        System.out.println(txt2.toLowerCase(Locale.ROOT));

        String txt3 =  "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        String txt4 = "it\'s rigtt";
        System.out.println(txt4);

        String x = "18";
        String y = "12";
        String z = x+y;

        System.out.println(Math.max(98,120));

        System.out.println(z);

    }
}
