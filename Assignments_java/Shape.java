//Create a class named 'Shape' with a method to print "This is shape". Then create two
//other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print
//"This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of
//'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and
//'Rectangle' class by the object of 'Square' class.


package Assignments_java;

public class Shape {

    void print_0()
    {
        System.out.println("This is shape");
    }
}

class Rectangle_1 extends Shape
{
    void print_1()
    {
        System.out.println("This is rectangular shape");
    }

}

class Circle extends Shape
{
    void print_2()
    {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle_1
{
    void print_3()
    {
        System.out.println("Square is a rectangle");
    }
}

class demmo
{
    public static void main(String[] args) {
        Square ob1 = new Square();
        ob1.print_0();
        ob1.print_1();
    }
}
