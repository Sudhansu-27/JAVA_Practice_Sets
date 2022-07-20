package Java_Basics;

public class Array_Min_Max {
    static void biggest(int a[])
    {
        for (int i=1;i < a.length;i++)
        {
            if(a[0] < a[i])
            {
                a[0] = a[i];
            }
        }

        System.out.println("Biggest Element Is " +a[0]);
    }

    static void smallest(int a[])
    {
        for (int i=1;i < a.length;i++)
        {
            if(a[0] > a[i])

            {
                a[0] = a[i];
            }
        }

        System.out.println("Smallest Element Is " +a[0]);
    }

    public static void main(String[] args) {
        int []a={12,5,3,40,65,1,17,4};
        biggest(a);
        smallest(a);
    }
}
