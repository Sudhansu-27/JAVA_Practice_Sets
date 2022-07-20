package Java_Basics;

public class string_constructors {   //Constructor - Class & Method name will be same & no return type.
                                     //No arg constructor, literals, StringBuffer , StringBuilder can be passed in string constructor.

    public static void main(String[] args) {
        byte[] b = {101,102,103};   // byte array can be passed in string constructor
        String a2 = new String(b);
        System.out.println(a2);

        char [] c = {'s' , 'u' , 'd' , 'd' , 'u'}; // char array can be passed in string constructor
        String a3 = new String(c);
        System.out.println(a3);
    }
}
