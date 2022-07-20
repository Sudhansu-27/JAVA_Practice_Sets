package Java_Basics;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int [] a = {3,9,1,10,4,20,2,
                21,22,5,25,24,23,19,18};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
        }

        int long_long = 0;
        for (int i=0;i<a.length;i++)
        {
            if (!hs.contains(a[i]-1))
            {
                int no=a[i];

                while (hs.contains(no))
                {
                    no++;
                }

                if (long_long < no-a[i])
                {
                    long_long = no-a[i];
                }
            }
        }

        System.out.println("Longest Sequence Is "+long_long);
    }

}
