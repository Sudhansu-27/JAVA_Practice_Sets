package Java_Basics;

public class star_3 {

    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i=5;i>=0;i--)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
