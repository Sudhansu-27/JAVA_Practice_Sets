package Java_Basics;

import java.util.Scanner;

public class star_pyramid
{
    public static void main(String[] args)
    {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number You Wanna Make A Pyramid : ");

        n = sc.nextInt();

        for (int i=0;i<n;i++)
        {
            for(int k=i;k<n;k++)
                System.out.print(" ");

            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}