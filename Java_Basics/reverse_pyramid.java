package Java_Basics;

public class reverse_pyramid {

    public static void main(String[] args) {

        for(int i=5;i>0;i--)
        {
            for(int j=i;j<5;j++)
                System.out.print("  ");

            for(int k=2*i;k>1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
       }

    }
}
