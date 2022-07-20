package Java_Basics;

import java.util.Scanner;

public class Check_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int j=0;j<10;j++) {
            System.out.println("Enter Number" + j + ": ");
            while(j>=0)
            {
                int n = sc.nextInt();

                if ((n % 2) == 0)
                {
                    System.out.println("Even Number");
                    break;
                }
                else
                {
                    System.out.println("Odd Number");
                    break;
                }
            }
        }
    }
}
