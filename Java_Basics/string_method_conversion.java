package Java_Basics;

import java.util.Locale;

public class string_method_conversion {
    public static void main(String[] args) {

        //CASE CONVERSION

        String s = "SUDHansu";

        System.out.println(s.toUpperCase());    // SUDHANSU
        System.out.println(s.toLowerCase());    // sudhansu

        //TYPE CONVERSION

        int a = 10 , b = 20;

        System.out.println(a + b);      // 30

        String s1 = String.valueOf(a);  // converts integer/different types of values into string
        String s2 = String.valueOf(b);

        System.out.println(s1 + s2);   // 1020

        char [] c = s.toCharArray();
        System.out.println(c);        // SUDHansu
    }
}
