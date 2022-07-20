package Java_Basics;

import java.util.Scanner;

public class Array_Insertion {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80,90};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Position Where You Want To Insert The New Element : ");
        int b = sc.nextInt();

        System.out.println("Enter The New Element To Be Inserted In Position "+b+ " Is :");
        int c = sc.nextInt();

        for (int i=a.length - 1 ; i > b-1 ; i--)
        {
            a[i] = a[i-1];
        }

        a[b-1] = c;

        System.out.println("Array Elements After Insertion : \n");
        for (int j=0;j<a.length;j++)
        {
            System.out.print(a[j] +" ");
        }
    }
}
