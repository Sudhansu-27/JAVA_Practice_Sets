package Java_Basics;

public class string_methods {
    public static void main(String[] args) {
        String r = "Suddu";   // It'll in SOP(String Object Pool) or SLP(String Lateral Pool)
        String t = new String("Bapun");   // It'll in both HEAP Area & SCP(String Constant Pool) or SLP(String Lateral Pool)
                                                //SCP/SLP - It is a special memory location in heap area which stores string laterals.

        String s = new String("Sudhansu");  //String objects are immutable (Unchangeble) , String immutability always related with object.
        s.concat(" Sekhar");     //String object can't replace the original string value rather it'll create another new object.
        System.out.println(s);   //Sudhansu

        s = s.concat(" Barik");  //Reference changed
        System.out.println(s);   //Sudhansu Barik


        // String Immutability - Original Value of string won't change but if you try to change then it'll create another object without disturbing others
        //equals() & '==' METHOD

        String s1 = new String ("Suddu");
        String s2 = new String ("Suddu");

        System.out.println(s1 == s2); //false // == used for reference/address comparison.
        System.out.println(s1.equals(s2)); //true // .equals() used for content check.

        String s3 = "Bapun";
        String s4 = "Bapun";

        System.out.println(s3 == s4); //true
        System.out.println(s3.equals(s4)); //true

        //.equals() used for content check in STRING CLASS but used for reference/address comparison in OBJECT CLASS.

        // length(), isEmpty(), Trim() String Method

        String name = "Suddu   ";
        String email = "Suddu2712@gmail.com";
        String password = "Suddu2712";

        System.out.println(name.length());   // 8
        System.out.println(name.isEmpty());  // false4
        System.out.println(name.trim());     // will remove spaces  //Suddu

      //equals() & equalsIgnoreCase()

        String s5 = "Suddu";
        String s6 = "suddu";

        System.out.println(s5.equals(s6));             //false -- will treat upper & lower case as different.
        System.out.println(s5.equalsIgnoreCase(s6));   //true  -- will treat upper & lower case as same.

        //compareTo() & comparedToIgnoreCase()

        String s7 = "a";   //97
        String s8 = "A";   //65

        System.out.println(s7.compareTo(s8));  // 97 - 65 = 32  , will return int value.  //Decimal Value / lexicographically
        System.out.println(s7.compareToIgnoreCase(s8));  // ignores lower & upper case.

    }
}




