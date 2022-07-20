package Java_Basics;

import java.util.Scanner;

public class Dec_To_Bin {
    static int dec_bin(int a)
    {
        int rem , bin=0;
        int b = 1;

        while(a !=0)
        {
            rem = a%2;
            bin = bin + rem*b;
            a = a/2;
            b = b*10;
        }

        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Decimal Number : ");
        int a = sc.nextInt();
        dec_bin(a);

        System.out.println("The Binary Conversion Of " +a+ "is " + dec_bin(a));
    }
}
