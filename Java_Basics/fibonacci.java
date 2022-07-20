package Java_Basics;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=2;
        int s =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Howmany Numbers You Want To Print In Fibonacci Series : ");

        int n=sc.nextInt();

        System.out.println("Fibonacci Series :");
        System.out.println(a);
        System.out.println(b);

        while(c<n)
        {
            if (s<10)
            {
                s=a+b;
                System.out.println(s);
                a=b;
                b=s;
                c++;
            }
        }

    }

}
