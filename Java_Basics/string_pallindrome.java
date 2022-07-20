package Java_Basics;

import java.util.Scanner;

public class string_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String : ");
        String str = sc.next();
        String rev = "";
        int n = str.length();
        System.out.println("String After Reverse : ");
        for (int i=0;i<n;i++)     // for(int i = str.length()-1; i>=0;i--)
        {
            rev   = rev + str.charAt(n-1-i);;
        }

        System.out.println(rev);

        if (str.equals(rev))
        {
            System.out.println("It's A Pallindrome");
        }
        else
        {
            System.out.println("It's Not A Pallindrome");
        }
    }
}
