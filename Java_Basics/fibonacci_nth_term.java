package Java_Basics;

import java.util.Scanner;

public class fibonacci_nth_term {
    static void fibonacci(int a)
    {
        int b=0,c=1,d,s;
        System.out.println("Fibonacci Series : ");
        System.out.println(b);
        System.out.println(c);
        int i=3;

        while(i<=a)
        {
            s = b+c;
            b=c;
            c=s;
            i++;
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number Of Terms : ");
        int n = sc.nextInt();

        fibonacci(n);
    }
}
