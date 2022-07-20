package Java_Basics;

import java.util.Scanner;

public class Array_avg_marks {
    public static void main(String[] args) {


        System.out.println("Enter the mark of physics of 5 students :");
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[5];

        for(int i = 0; i < 5;i++)
        {
            System.out.println("Mark of student "+(i+1) + " in physics :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i=0; i < 5; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        int sum = 0;

        for(int i=0;i<5;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Total Sum of marks : "+sum);
        float avg = sum/5;
        System.out.println("Average of marks is : "+avg);
    }
}
