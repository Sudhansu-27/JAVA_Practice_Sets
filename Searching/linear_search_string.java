package Searching;

import java.util.Scanner;

public class linear_search_string {
    public static void main(String[] args) {
        String a[] = {"suddu" , "bapun" , "raja" , "ashish" , "salman"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String b = sc.nextLine();
        String temp = b;
        int temp1 = 0;

        for (int i=0;i<a.length;i++)
        {
            if(a[i].equals(temp))
            {
                System.out.println("Entred string is in "+i+ "th index.");
                temp1 = temp1 + 1;
            }
        }

        if(temp1 == 0)
        {
            System.out.println("Entered string is not present.");
        }
    }
}
