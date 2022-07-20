package Sorting;

public class Bubble_Sort_String {
        public static void main(String[] args) {
            String []a = {"Suddu" , "Bapun" , "Kartik" , "Anu" , "Priyanks"};

            System.out.println("String Before Bubble Sorting :");
            for (int k = 0;k<a.length;k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println();

            String temp = "";
            int flag=0;

            for (int i=0;i<a.length;i++)  // For Rounds
            {
                for (int j=0;j<a.length-1;j++)
                {
                    if(a[j].compareTo( a[j + 1]) > 0)
                    {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        flag = 1;
                    }
                }
                if(flag == 0)
                {
                    break;
                }
            }
            System.out.println();
            System.out.println("String After Bubble Sorting :");
            for (int k = 0;k<a.length;k++)
            {
                System.out.print(a[k] + " ");
            }
        }
    }
