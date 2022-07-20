package Sorting;

public class Selection_Sort_String {
    public static void main(String[] args) {
        int min;
        String temp= "";
        String []a={"S" , "D" , "H" , "A" , "U" , "N"};

        System.out.println("String Before Selection Sorting :");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }

        for (int i=0;i<a.length;i++)
        {
            min = i;
            for (int j=i+1;j<a.length;j++)
            {
                if(a[j].compareTo( a[min]) < 0)
                {
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println();
        System.out.println();
        System.out.println("String After Selection Sorting :");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}
