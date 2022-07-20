package Java_Basics;

import java.util.Scanner;

public class Number_Without_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting Number :");

        int a = sc.nextInt();

        System.out.println("Enter The Ending Number :");

        int b = sc.nextInt();

        System.out.println("Numbers Between Starting & Ending Number Are: ");
        withoutloop(a, b);

    }

    static void withoutloop(int a, int b){
        if(a <= b)
        {
            System.out.println(a + " ");
            withoutloop(a+1 , b);
        }
    }
}
