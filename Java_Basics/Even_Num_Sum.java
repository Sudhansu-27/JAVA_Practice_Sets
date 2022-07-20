package Java_Basics;

import java.util.Scanner;

public class Even_Num_Sum {
    public static void main(String[] args) {
        int i;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Range From 1 To ");
        int n = sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(i%2==0)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum Of Even Numbers : " +sum);
    }
}
