//Qsn No.2
//WAP that would print the information (name, year of joining, salary, address) of three employees by methods.

package Assignments_java;

class Employee_e
{
    void Print_Info(int i, String s, double a, double b , String s1)
    {
            System.out.println("Details Of Employee "+i + " : \n");
            System.out.println("Name : "+s);
            System.out.println("Year Of Joining : "+a);
            System.out.println("Salary : "+b);
            System.out.println("Address : " +s1);
            System.out.println();
    }
}

public class Employee_info_methods {
    public static void main(String[] args) {
        Employee_e e1 = new Employee_e();
        e1.Print_Info(1,"Suddu" , 2019 , 20000 , "Rasulgarh");

        Employee_e e2 = new Employee_e();
        e2.Print_Info(2,"Bapun" , 2018 , 22000 , "Vanivihar");

        Employee_e e3 = new Employee_e();
        e3.Print_Info(3,"Suddu" , 2017 , 25000 , "Saheed Nagar");
    }
}
