package Java_Basics;

public class Array_duplicacy_remove {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,5,5};
        System.out.println("Entered Array :");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }

        int temp[] = new int[a.length];
        int j=0;
        for (int i=0;i<a.length-1;i++)
        {
            if (a[i] != a[i+1])
            {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length - 1];

        System.out.println("Array After Removing Duplicacy :");
        for (j=0;j<temp.length;j++)
        {
            System.out.print(temp[j] + " ");
        }
    }
}
