package Java_Basics;

import java.util.Scanner;

public class multiplication_table {

    static void multiplication_table(int a)
    {
        int b = a;
        for(int i=1;i<11;i++)
        {
            int m = b * i;
            System.out.format("%d * %d = %d \n" , b , i , m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int n = sc.nextInt();

        multiplication_table(n);
        System.out.println("The Multiplication Table Of " +n+ " Is :");
    }
}
