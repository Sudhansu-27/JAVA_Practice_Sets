package Java_Basics;

import java.util.Scanner;

public class sum_natural_numbers {
        static int sum(int a)
        {
            int f;
            if(a>0)
                return f = a  +  sum(a-1);
            else
                return a;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Number :");
            int n = sc.nextInt();

            sum(n);
            System.out.println("Sum Of " +n+ " Is :" + sum(n));
        }
    }