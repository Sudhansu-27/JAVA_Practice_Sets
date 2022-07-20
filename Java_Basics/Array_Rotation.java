package Java_Basics;

public class Array_Rotation {
    public static void main(String[] args) {
        int []a={12,35,67,90,2,3,6,41,8};
        System.out.println("Entered Array :");
        int n = a.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i] +" ");
        }
        int temp;
        for(int j=0;j<(n/2);j++)
        {
            temp = a[j];
            a[j] = a[n-(j+1)];
            a[n-(j+1)] = temp;
        }
        System.out.println("Array After Rotate");
        for (int k=0;k<n;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}
