package Searching;

public class binary_search {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b = 7;
        int lower = 0;
        int higher = a.length - 1;
        int middle = (lower + higher) / 2;

//        int temp = middle;
        while (lower <= higher)
        {

            if (a[middle] == b)
            {
                System.out.println("Element is present in " + middle + "th index.");
                break;
            }
            else if (a[middle] < b)
            {
                lower = middle + 1;
            }
            else
            {
                higher = middle - 1;
            }
            middle = (lower + higher) / 2;
        }
    }
}
