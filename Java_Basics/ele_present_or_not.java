package Java_Basics;

import java.util.Scanner;

public class ele_present_or_not {
    public static void main(String[] args) {
        int [] arr = {5,4,8,9,6,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer :");
        int n = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<6;i++)
        {
            if(arr[i]==n)
            {
               isInArray = true;
               break;
            }
        }
        if (isInArray)
           System.out.println("Integer Is Present");
        else
            System.out.println("Integer Is Not Present");
    }
}
