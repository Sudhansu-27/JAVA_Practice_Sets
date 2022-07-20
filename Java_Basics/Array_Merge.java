package Java_Basics;

public class Array_Merge {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {40,50,60,70};

        int a_len = a.length;
        int b_len = b.length;
        int c_len = a_len + b_len ;

        int c[] = new int[c_len];

        for (int i=0;i<a.length;i++)
        {
            c[i] = a[i];
        }

        for (int j=0;j<b.length;j++)
        {
            c[a.length + j] = b[j];
        }

        System.out.println("Array After Merge :");

        for (int k=0;k<c.length;k++)
        {
            System.out.print(c[k] + " ");
        }
    }
}
