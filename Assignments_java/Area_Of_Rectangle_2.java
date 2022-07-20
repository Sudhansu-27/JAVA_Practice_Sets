//Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//respectively by creating a class named 'Rectangle' with a method named 'Area ()' which
//returns the area.


package Assignments_java;

public class Area_Of_Rectangle_2 {
    int l , b;
    float area;

    Area_Of_Rectangle_2(int length, int breadth)
    {
        l = length;
        b = breadth;
    }

    void Area()
    {
       area = l * b;
    }

    void show()
    {
        System.out.println("The Area Of Rectangle Is : " + area);
    }
}

class Demo
{
    public static void main(String[] args) {
        Area_Of_Rectangle_2 ob1 = new Area_Of_Rectangle_2(4,5);
        ob1.Area();
        ob1.show();

        Area_Of_Rectangle_2 ob2 = new Area_Of_Rectangle_2(5,8);
        ob2.Area();
        ob2.show();
    }
}
