package Java_Basics;

import java.util.Scanner;

public class factorial_recursion {
    static int factorial(int a)
    {
        int f;
        if(a>0)
            return f = a  *  factorial(a-1);
        else
           return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int n = sc.nextInt();

        factorial(n);
        System.out.println("Factorial Of " +
                "" +n+ " Is :" + factorial(n));
    }
}
