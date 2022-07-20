package Java_Basics;

public class string_method_replace {
    public static void main(String[] args) {

        // replace() , replaceFirst() , replaceAll()

        String s1 = "Good Morning Sudhansu. What is your planning for today's Morning.";
        System.out.println(s1.replace("Morning" , "Evening"));       //updates the substring
        System.out.println(s1.replaceFirst("Morning" , "Evening"));  //update the first substring
        System.out.println(s1.replaceAll("Morning" , "Evening"));
        System.out.println(s1.replaceAll("Morning(.)" , "Evening"));   //will remove s
        // paces after regax.
        System.out.println(s1.replaceAll("Morning(.*)" , "Evening"));  // will remove all after regax.

    }
}
