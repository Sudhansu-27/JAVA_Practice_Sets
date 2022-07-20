//Write a program to Print the average of three numbers entered by user by creating a
//class named 'Average' having a method to calculate and print the average.
//Define another driver class to demonstrate the basic operation.


package Assignments_java;

import java.util.Scanner;

public class Average_using_method_class {
    int a,b,c;
    float avg;

    void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        a = sc.nextInt();

        System.out.println("Enter 2nd Number : ");
        b = sc.nextInt();

        System.out.println("Enter 3rd Number : ");
        c = sc.nextInt();
    }

    void calculate()
    {
        avg = (a+b+c)/3;
    }

    void show()
    {
        System.out.println("Average of 3 numbers : "+avg);
    }
    }

    class Driver
    {
        public static void main(String[] args) {
            Average_using_method_class ob1 = new Average_using_method_class();
            ob1.Input();
            ob1.calculate();
            ob1.show();
        }
    }

