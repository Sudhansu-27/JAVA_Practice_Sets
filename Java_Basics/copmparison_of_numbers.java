package Java_Basics;

import java.util.Scanner;
public class copmparison_of_numbers {
    public static void main(String[] args) {

        int b = 45;
        System.out.println("The Given Number is :" + b );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int a = sc.nextInt();
        System.out.println( a > b);


//        OR


//        if(a > b)
//            System.out.println("The Entered Number Is Greater Than The Given Number.");
//        else if(a < b)
//            System.out.println("The Entered Number Is Smaller Than The Given Number.");
//        else
//            System.out.println("Both The Numbers Are Equal.");
    }
}
