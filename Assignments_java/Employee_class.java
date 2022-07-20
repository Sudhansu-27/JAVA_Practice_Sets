//Write a program that would print the information (name, year of joining, salary, address)
//of three employees by creating a class named 'Employee'.


package Assignments_java;

import java.util.Scanner;

public class Employee_class {
    String ename;
    int year;
    int salary;
    String address;
    static int n=1;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employee "+n+ ": ");
        ename = sc.next();

        System.out.println("Enter the year of joining of the Employee "+n+ ": ");
        year = sc.nextInt();

        System.out.println("Enter the salary of the Employee "+n+ ": ");
        salary = sc.nextInt();

        System.out.println("Enter the address of the Employee "+n+ ": ");
        address = sc.next();

        n++;
    }

    void show()
    {
        System.out.println("Name : "+ename);
        System.out.println("Joining Date : "+year);
        System.out.println("Salary : "+salary);
        System.out.println("Address : "+address);
    }
}

class DemoEmployee
{
    public static void main(String[] args) {
        Employee_class e1 = new Employee_class();
        e1.input();
        e1.show();

        Employee_class e2 = new Employee_class();
        e2.input();
        e2.show();

        Employee_class e3 = new Employee_class();
        e3.input();
        e3.show();

        Employee_class e4 = new Employee_class();
        e4.input();
        e4.show();
    }
}
