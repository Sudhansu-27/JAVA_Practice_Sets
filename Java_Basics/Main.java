package Java_Basics;

public class Main {

    public static void main(String[] args) {

        int a = 4 , b = 5, c = 6;

        String result = (a < 6) ? "SUDDU" : "BAPUN";
        System.out.println(result);

        if ((a > b) && (a > c))
            System.out.println("a is greater");

        else if ((b > a) && (b > c))
           System.out.println("b is greater");

        else
        System.out.println("c is greater");

    }
}
