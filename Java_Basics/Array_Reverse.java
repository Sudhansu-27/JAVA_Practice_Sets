package Java_Basics;

public class Array_Reverse {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70};
        rev(arr , arr.length);
    }

    static void rev(int a[],int n)
    {
        int [] c = new int[n];
        int j=n;
        for(int i=0;i<n;i++)
        {
            c[j-1] = a[i] ;
            j = j-1;
        }
        System.out.println("Array After Reverse:");
        for(int k=0;k<n;k++)
        {
            System.out.println(c[k]);
        }
    }
}



//
//    int []a = {10,20,30,40,50};
//    //            int n = a.length;
//    int n=5;
//    int b[] = new int[5];
//
//            for (int i=0;i<a.length;i++)
//        {
//        b[i] = a[n-1] ;
//        n--;
//        }
//
//        for (int i=0;i<b.length;i++)
//        {
//        System.out.println(b[i]);
//        }

