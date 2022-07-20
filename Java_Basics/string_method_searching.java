package Java_Basics;

public class string_method_searching {
    public static void main(String[] args) {
        String s1 = "sudhansu";
        System.out.println(s1.indexOf("su"));          // will check from first to last  // 0
        System.out.println(s1.lastIndexOf("su"));  // will check from last to first  // 6
        System.out.println(s1.charAt(3));              // will show value at particular index given by user  // h
        System.out.println(s1.contains("su"));         // will show value is present or not  // true - it will show boolean value.
        System.out.println(s1.startsWith("s"));        // it will also return boolean value.  // true
        System.out.println(s1.endsWith("a"));          //  it will also return boolean value.  // false
    }
}
