package Java_Basics;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class sort_or_not {
    public static void main(String[] args) {
        int []arr={20,5,78,45,56};
        boolean isSorted = true;

        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }

            else
            {
                isSorted = true;
            }
        }

      if (isSorted)
      {
          System.out.println("Array Is Sorted");
      }

      else
      {
          System.out.println("Array Is Not Sorted");
      }
    }
}
