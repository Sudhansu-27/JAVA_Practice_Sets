package Java_Basics;

public class star_1
{
    public static void main(String args[])
    {
        int n = 5;
        //Outer Loop for number of Rows
        for(int i=5;i > 0;i--)
        {
            // Inner loop for printing '*' in each column.
            for(int j=0;j<i;j++)
            {
                // We add two spaces to match shape of a square.
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}