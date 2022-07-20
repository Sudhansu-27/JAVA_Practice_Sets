// Write a program that would print the information (name, year of joining, salary, address)
// of three employees by creating a constructor named 'Employee'.



package Assignments_java;

 class Employee_1 {
    public Employee_1(int i, String s, double a, double b, String s1) {
        System.out.println("Details Of Employee " + i + " : \n");
        System.out.println("Name : " + s);
        System.out.println("Year Of Joining : " + a);
        System.out.println("Salary : " + b);
        System.out.println("Address : " + s1);
        System.out.println();
    }
}
public class Employee_info_constructor {
        public static void main(String[] args) {
            Employee_1 e1 = new Employee_1(1,"Suddu" , 2019 , 20000 , "Rasulgarh");

            Employee_1 e2 = new Employee_1(2,"Bapun" , 2018 , 22000 , "Vanivihar");

            Employee_1 e3 = new Employee_1(3,"Suddu" , 2017 , 25000 , "Saheed Nagar");
        }
    }
