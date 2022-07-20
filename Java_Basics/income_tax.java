package Java_Basics;
import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        float tax = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Salary :");
        float sal = sc.nextFloat();

        if(sal < 2.5f)
        {
            tax = tax + 0;
            System.out.println("Tax is : " + tax);
        }
        else if(sal > 2.5f && sal < 5.0f)
        {
            tax = tax + 0.05f * (sal - 2.5f);
            System.out.println("Tax is :" +tax);
        }
        else if(sal > 5.0f && sal < 10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (sal - 5.0f);
            System.out.println("Tax is :" +tax);
        }
        else
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (sal - 10.0f);
            System.out.println("Tax is :" +tax);
        }
    }
}
