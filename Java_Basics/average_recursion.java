package Java_Basics;

import java.util.Scanner;

public class average_recursion {
    static int sum(int...arr)      //VAR__ARGS
    {
        int s=0;
        for(int a: arr)
        {
            s+=a;
        }

       return s;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
         n = sc.nextInt();

        System.out.println("Enter "+n+" Numbers");
        int [] j = new int[n];
        int k = n;
         for(int i=0;i<n;i++)
         {
             int l = sc.nextInt();
            j[i]= l;
         }

         sum(j);
        System.out.println("Sum Is: "+sum(j));
    }
}
