package Java_Basics;

import java.util.Scanner;

public class Count_Odd_Even {
    public static void main(String[] args) {

        int even_count =0 , odd_count = 0;
        Scanner sc = new Scanner(System.in);
        int []a = new int[10];

        System.out.println("Enter 10 Numbers: ");
        for (int i=0;i<10;i++)
        {
            int n = sc.nextInt();

            a[i] = n;
        }

        for (int j=0;j<10;j++)
        {
            if((a[j] % 2) == 0)
            {
                even_count++;
            }

            else
            {
                odd_count++;
            }
        }

        System.out.println("Total Even Counts : " +even_count);
        System.out.println("Total Odd Counts : " +odd_count);
    }
}
