package Java_Basics;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
//        String phy,chem,math , sci,eng;
        System.out.println("We Are Printing The Mark Of Suddu");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Mark of Physics: ");
        int a = sc.nextInt();

        System.out.println("Enter The Mark of Chemistry: ");
        int b = sc.nextInt();

        System.out.println("Enter The Mark of Mathematics: ");
        int c = sc.nextInt();

        System.out.println("Enter The Mark of English: ");
        int d = sc.nextInt();

        System.out.println("Enter The Mark of IT: ");
        int e = sc.nextInt();

        int sum = (a + b + c + d + e) ;
        float per = (sum / 5);

        System.out.println("Total Percentage Of Suddu : ");
        System.out.println(per + "%");
    }
}
