package OOPS;

class Employee   //By_Reference_Variable
{
    int id;
    String name;

    public static void main(String[] args) {
        Employee Suddu;
        Suddu = new Employee();    // Employee Suddu = new Employee();



        Suddu.id=12;
        Suddu.name="Sudhansu";

        System.out.println("Employee Id Is : " +Suddu.id);
        System.out.println("Employee Name Is : " +Suddu.name);
    }

}
