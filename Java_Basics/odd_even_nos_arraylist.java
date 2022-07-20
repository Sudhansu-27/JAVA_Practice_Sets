package Java_Basics;
import java.util.ArrayList;

public class odd_even_nos_arraylist {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6,8};
        ArrayList<Integer> Even = new ArrayList<>();
        ArrayList<Integer> Odd = new ArrayList<>();

        for (int i=0;i<a.length;i++)
        {
            if (a[i] % 2 == 0)
            {
                Even.add(a[i]);
            }
            else
            {
                Odd.add(a[i]);
            }
        }

        System.out.println("Even Numbers Are :");
        for (int no:Even)
        {
            System.out.print(no +" ");
        }
        System.out.println("\n");
        System.out.println("Odd Numbers Are :");
        for (int no:Odd)
        {
            System.out.print(no +" ");
        }
    }
}
