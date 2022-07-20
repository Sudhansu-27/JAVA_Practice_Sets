package Java_Basics;

import java.util.Locale;
                                    // String is a class & an immutable object.
public class string {               // String is the Array of characters & sequence of Characters.
                                    //To create string there are 3 classes : String, StringBuilder, StringBuffer.
    public static void main(String[] args) {
        String name = "    Su dhan su  se   khar     ";

        int count = name.length();
        System.out.println(count);

        String small = name.toLowerCase();
        System.out.println(small);

        String big = name.toUpperCase();
        System.out.println(big);

        String replace = name.replace(" ",  "_");
        System.out.println(replace);

        System.out.println(name.substring(7));

    }

}
