package Java_Basics;

public class odd_even_count {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,17,24,22,15};
        int odd_count =0 , even_count = 0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2 == 0)
            {
                even_count++;
            }


            else
            {
                odd_count++;
            }
        }

        System.out.println("Number of even numbers present in the array : "+even_count);
        System.out.println("Number of even numbers present in the array : "+odd_count);
    }
}
