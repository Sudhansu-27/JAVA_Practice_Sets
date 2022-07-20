//Print the sum of two complex numbers by creating a class named 'Complex’ whose real
//and imaginary parts are entered by user

package Assignments_java;

import java.util.Scanner;

public class Complex_num_sum {
    int real , img;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Real Number : ");
        real = sc.nextInt();

        System.out.println("Enter An Imaginary Number : ");
        img = sc.nextInt();
    }

    void add(Complex_num_sum ob1 , Complex_num_sum ob2)
    {
        real = ob1.real + ob2.real;
        img = ob1.img + ob2.img;
    }

    void show()
    {
        System.out.println("Complex Addition = "+real + " + " + img+"i");
    }
}
class DempComplexAdd
{
    public static void main(String[] args) {
        Complex_num_sum ob1 = new Complex_num_sum();
        ob1.input();

        Complex_num_sum ob2 = new Complex_num_sum();
        ob2.input();

        Complex_num_sum ob3 = new Complex_num_sum();
        ob3.add(ob1,ob2);
        ob3.show();

    }
}