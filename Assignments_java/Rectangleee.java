// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods
//to print the area and perimeter of the rectangle respectively. Its constructor having parameters for
//length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit
//the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the
//constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a
//square.


package Assignments_java;

public class Rectangleee {
    int l;
    int b;
    float area;
    int perimeter;

    Rectangleee(int length, int breadth) {
        l = length;
        b = breadth;
    }

    void area()
    {
        area = l * b;
        System.out.println("Area Of Rectangle Is : " + area);
    }

    void Perimeter ()
    {
        perimeter = 2 * (l + b);
        System.out.println("Perimeter Of Rectangle Is : " + perimeter);
    }
}

class Squareee extends Rectangleee
{
    int side, area_1, perimeter_1;

    Squareee(int s, int length, int breadth) {
        super(length, breadth);
        side = s;
    }
    void area_1() {
        area_1 = side * side;
        System.out.println("Area Of Square Is : " + area_1);
    }

    void perimeter_1() {
        perimeter_1 = 4 * side;
        System.out.println("Perimeter Of Square Is : " + perimeter_1);
    }
}

class Demooo
{
    public static void main(String[] args) {
        Squareee ob1 = new Squareee(8, 6, 5);
        ob1.area();
        ob1.Perimeter();
        ob1.area_1();
        ob1.perimeter_1();
    }
}
