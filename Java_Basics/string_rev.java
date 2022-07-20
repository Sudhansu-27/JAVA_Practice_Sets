package Java_Basics;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class string_rev {
    public static void main(String[] args) {
//        String str = "Suddu" ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A String : ");

        String str = sc.next();

        int n = str.length();
        char ch;
        String rstr = "";

        for(int i=0;i<n;i++)
        {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }

        System.out.println("String After Reverse : " +rstr);
    }
}

//    String str = "Sudhansu";
//    String rev = "";
//    int n = str.length();
//    char temp;
//        for (int i=0;i<n;i++)     // for(int i = str.length()-1; i>=0;i--)
//        {
//        rev   = rev + str.charAt(n-1-i);;
//        }
//
//        System.out.println(rev);
