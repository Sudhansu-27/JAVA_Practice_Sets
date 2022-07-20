//Create a class with a method that prints "This is parent class" and its subclass with another
//method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class



package Assignments_java;

public class Inheritance_1
{
    void method_1()
    {
        System.out.println("This is parent class");
    }
}

class derived extends Inheritance_1
{
    void method_2()
    {
        System.out.println("This is child class");
    }
}

class demo
{
    public static void main(String[] args) {
        Inheritance_1 ob1 = new Inheritance_1();
        ob1.method_1();

        derived ob2 = new derived();
        ob2.method_2();
        ob2.method_1();
    }
}
