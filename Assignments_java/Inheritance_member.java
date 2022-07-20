// Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager'
//classes have data members 'specialization' and 'department' respectively. Now, assign name, age,
//phone number, address and salary to an employee and a manager by making an object of both of
//these classes and print the same.


package Assignments_java;

import java.sql.SQLOutput;

public class Inheritance_member {
    String name,address,phone_no;
    int salary,age;
    void printSalary(int salary)
    {
        System.out.print("Salary : " +salary);
        System.out.println("\n");
        System.out.println("---------------------------------------- \n");

    }
}

class Employeee extends Inheritance_member
{
    String specialization;
    void print_employee_details(String name, String address, String phone_no, int age, String specialization )
    {
        System.out.println("Employee Name : " +name);
        System.out.println("Employee Address : " +address);
        System.out.println("Employee Phone_no : " +phone_no);
        System.out.println("Employee Age : " +age);
        System.out.println("Employee Specialization : " +specialization);
    }
}

class Manager extends Inheritance_member
{
    String department;
    void print_manager_details(String name, String address, String phone_no, int age, String department )
    {
        System.out.println("Manager Name : " +name);
        System.out.println("Manager Address : " +address);
        System.out.println("Manager Phone_no : " +phone_no);
        System.out.println("Manager Age : " +age);
        System.out.println("Manager Specialization : " +department);
    }
}

class demoo
{
    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        e1.print_employee_details("Suddu" , "Rasulgarh" , "0123456789" , 23 , "MCA");
        System.out.print("Employee ");
        e1.printSalary(22000);

        Manager m1 = new Manager();
        m1.print_manager_details("Bapun" , "GGP Colony" , "9876543210" , 27 , "Computer Science");
        System.out.print("Manager ");
        m1.printSalary(45000);
    }
}
