package Java_Basics;

public class Missing_num {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,7};

        for (int i=0;i<a.length;i++)
        {
            if ((i+2) != a[i+1])
                System.out.println("Missing Number In The Sorted Array : " + (i + 2));
        }
    }
}
