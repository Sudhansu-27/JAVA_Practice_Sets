//Write a program to Create a class named 'Student' with String variable 'name' and integer
//variable 'roll_no'. Assign the value of roll_no as '20' and that of name as "John" by creating
//an object of the class Student.


package Assignments_java;

public class Student_class {
    String name;
    int roll_no;

    Student_class(String n, int r)
    {
        name = n;
        roll_no = r;
    }

    void show()
    {
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll No. : "+roll_no);
    }
}

class Demonstrate
{
    public static void main(String[] args) {
        Student_class ob1 = new Student_class("John" , 20);
        ob1.show();
    }
}
