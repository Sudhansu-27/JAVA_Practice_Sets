package Java_Basics;

import java.util.Scanner;

public class max_in_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array elements are:");
        int [] arr = new int[5];

        for(int i = 0; i < 5;i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i < 5; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        max_element(arr,arr.length);
    }

    static void max_element(int a[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
             max = a[i];
            }
        }
        System.out.println("Max Element In Array :"+max);
    }
}
