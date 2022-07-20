package Java_Basics;
import java.util.Scanner;

public class wish {
    public static void main(String[] args) {
        System.out.println("What Is Your Name : ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();

        System.out.println("Hello "+ Name + ".How was your day ?");
    }
}
