package Java_Basics;

public class Common_elements_2 {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {7, 5, 3, 9, 10, 16, 18};

        System.out.println("Common Elements In 2 Arrays Are : ");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    System.out.print(b[j] + " ");
                    break;
                }
            }
        }
    }
}
