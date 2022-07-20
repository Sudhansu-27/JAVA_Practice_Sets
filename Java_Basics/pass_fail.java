package Java_Basics;
import java.util.Scanner;
public class pass_fail {
    public static void main(String[] args) {
//        char phy , eng ,math ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Mark Of Physics - ");
        int a = sc.nextInt();
        System.out.println("Enter The Mark Of English - ");
        int b = sc.nextInt();
        System.out.println("Enter The Mark Of mathematics - ");
        int c = sc.nextInt();

        int sum = a + b + c ;

//        float physics_p = a/100;
//        float english_e = b/100;
//        float mathematics_m = c/100;

        float total_percentage = sum/3;

        if(total_percentage > 40 && a > 33 && b > 33 && c > 33)
        {
            System.out.println("You Passed");
        }
        else
        {
            System.out.println("You Failed");
        }
    }
}
