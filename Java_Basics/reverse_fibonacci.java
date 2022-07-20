package Java_Basics;

import java.util.Scanner;

public class reverse_fibonacci {

        static void rvrs_fibonacci(int n) {
            int a[] = new int[n];
            a[0] = 0;
            a[1] = 1;

            for (int i=2;i<n;i++)
            {
                a[i] = a[i-2] + a[i-1];
            }

            for (int i=n-1;i>=0;i--)
            {
                System.out.println(a[i] + " ");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Howmany Numbers You Want To Print In Fibonacci Series : ");

            int n = sc.nextInt();

            System.out.println("Fibonacci Series :");
            rvrs_fibonacci(n);
        }
    }
