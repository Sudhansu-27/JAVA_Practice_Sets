package Sorting;

public class practice_2 {
    public static void main(String[] args) {

        int []arr={5,3,7,1,15,4};
        int temp;

        for (int i=0;i<arr.length;i++)
        {
            int flag=0;
            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }

        for (int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] +" ");

        }
    }
}
