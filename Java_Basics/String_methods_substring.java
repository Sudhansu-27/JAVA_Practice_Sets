package Java_Basics;

public class String_methods_substring {
    public static void main(String[] args) {
        String s1 = "Su";
        String s2 = "ddu";

        //concat using '+' operator

        System.out.println(s1 + s2);      // Suddu
        System.out.println(s1 + 10);      //Su10
        System.out.println(s1 + 10 +20);  //Su1020
        System.out.println(10 + 20 + s1); //30Su
        System.out.println(s1 + 20/10);   //Su2  A/C to BODMAS

        // System.out.println(s1 + 10 - 5); //Error

        //join method -- static join (CharSequence delimiter , CharSequence... elements  (... - varargs)

        System.out.println(String.join(",",s1,s2));  // Su,ddu   //delimiter adds , : ; in between two strings

        //SUB STRING
        //subSequence

        String s3 = "Hello Sudhansu";
        System.out.println(s3.subSequence(3,9)); // lo sud       //returns char sequence
        System.out.println(s3.substring(3));     // lo Sudhansu  //returns string value
        System.out.println(s3.substring(3,9));   // lo sud
    }
}
