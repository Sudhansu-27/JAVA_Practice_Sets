package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int min;
        int temp=0;
            int []a={15,7,2,90,27,42,1};

        System.out.println("Array Before Selection Sorting :");
        for (int k=0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }

            for (int i=0;i<a.length;i++)
            {
                min = i;
                for (int j=i+1;j<a.length;j++)
                {
                    if(a[j] < a[min])
                    {
                        min = j;
                    }
                }

                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }

        System.out.println();
        System.out.println("Array After Selection Sorting :");
            for (int k=0;k<a.length;k++)
            {
                System.out.print(a[k] + " ");
            }
    }
}
