package Java_Basics;

public class Common_elements_3 {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {7, 5, 3, 9, 10, 16, 18};
        int [] c = {7,22,23,34,45,56,67,99};

        System.out.println("Common Elements In 3 Arrays Are : ");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                   for (int k=0;k<c.length;k++)
                   {
                      if (a[i] == c[k])
                      {
                          System.out.print(c[k]);
                          break;
                      }
                   }
                }
            }
        }
    }
}
