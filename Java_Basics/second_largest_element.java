package Java_Basics;

import java.util.Scanner;

public class second_largest_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a [] = new int[8];
        System.out.println("Enter 8 arrays: ");
         for (int l=0;l<8;l++)
         {
            a[l] = sc.nextInt();
         }

        System.out.println("\n Entered elements are ");

         for (int b=0;b<a.length;b++)
         {
             System.out.print(a[b] + " ");
         }

        int temp;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n Array after sorted in decreasing order");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
        System.out.println("\n Enter the largest element at position ");
        int c = sc.nextInt();
        System.out.println(c + "th largest element is "+a[c]);
    }
}
