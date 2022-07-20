//WAP to calculate area of a rectangle by creating class name 'Rectangle' with a method named 'Area()' which returns area.


package Assignments_java;

import java.util.Scanner;
class Rectangle
{
    int Area(int a, int b)
    {
        int area = a * b;
        return area;
    }
}

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();

        Rectangle c = new Rectangle();
        c.Area(a,b);

        System.out.println("Area of rectangle is : "+ c.Area(a,b));
    }
}
