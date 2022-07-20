package Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int []a = {36,19,29,12,5};

        System.out.println("Array Before Bubble Sorting :");
        for (int k = 0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
        System.out.println();

        int temp;

        for (int i=0;i<a.length;i++)  // For Rounds
        {
            int flag=0;
            for (int j=0;j<a.length-1;j++)
            {
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        System.out.println("Array After Bubble Sorting :");
        for (int k = 0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}
