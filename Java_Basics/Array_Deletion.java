package Java_Basics;

import java.util.Scanner;

public class Array_Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i=0; i < 5; i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println("Enter The Element You Want To Delete :");
        int b = sc.nextInt();

        for (int j=0;j<a.length;j++)
        {
            if (b == a[j])
            {

                for (int k=j;k<a.length;k++)
                {
                    a[j] = a[j+1];
                }
                break;
            }
        }

        System.out.println("Elements After Deletion: ");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
