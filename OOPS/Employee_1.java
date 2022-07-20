package OOPS;

class Employee_1    //By_Method_OOPS
{
    int id;
    String name;

    public void printdetails()
    {
        System.out.println("Employee Id Is : " +id);
        System.out.println("Employee Name Is : " +name);
    }

    public static void main(String[] args) {
        Employee_1 Suddu;
        Suddu = new Employee_1();    // Employee_1 Suddu = new Employee_1();



        Suddu.id=12;
        Suddu.name="Sudhansu";

        Suddu.printdetails();
    }

}
