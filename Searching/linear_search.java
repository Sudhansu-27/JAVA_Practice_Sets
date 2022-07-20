package Searching;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int a[] = {5,6,8,9,10,11,23,45,1,2,99,87,64,66,78,3,9999,5678,432,2712,4,0,97};
        System.out.println("Length of the array: "+a.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to search : ");
        int b = sc.nextInt();
        int temp = b;
        int temp1 = 0;
        for (int i=0; i<a.length;i++)
        {
            if (temp == a[i])
            {
                System.out.println("The entered number is in " +i+ "th index of the array.");
                temp1 = temp1 + 1;
            }
        }
        if(temp1 == 0)
        {
            System.out.println("Entered number is not present in the array.");
        }
    }

}
