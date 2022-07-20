package Java_Basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        a = sc.nextInt();

        System.out.println("Enter 2nd Number :");
        b = sc.nextInt();

        System.out.println("Enter A Sign :");
        String str = sc.next();

        switch (str){
            case "+":
                System.out.println("The Addition Result is : ");
                System.out.print(a + b);
                break;

            case "-":
                System.out.println("The Substraction Result is : ");
                System.out.print(a - b);
                break;

            case "*":
                System.out.println("The Multiplication Result is : ");
                System.out.print(a * b);
                break;

            case "/":
                System.out.println("The Division Result is : ");
                System.out.print(a / b);
                break;

            case "%":
                System.out.println("The Modulus Result is : ");
                System.out.print(a % b);
                break;

            default:
                System.out.println("Enter A Valid Expression :");
                break;

        }
    }
}
