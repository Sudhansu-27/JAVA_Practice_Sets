package Sorting;

public class Heap_Sort {
    public static void main(String[] args) {
        int a[] = {10,5,17,7,3,15,1};
        Heap_Sort b = new Heap_Sort();
        b.sort(a);
        b.printArray(a);
    }

    void sort(int a[])
    {
      int l = a.length;
      for (int i=l/2 - 1 ;i>=0;i--)
      {
          heapify(a,l,i);
      }

      for (int i=l-1;i>=0;i--)
      {
          int temp = a[0];
          a[0] = a[i];
          a[i] = temp;
          heapify(a,i,0);

      }
    }

    void heapify(int a[],int l, int i)
    {
        int largest = i; // Parent Index
        int li = 2*i+1;  // Left Child Index
        int ri = 2*i+2;  // Right Child Index

        if (li < l && a[largest] < a[li] )
        {
            largest = li;
        }
        if (ri < l && a[largest] < a[ri] )
        {
            largest = ri;
        }
        if (largest != i)
        {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a,l,largest);

        }
    }

    void printArray(int []a)
    {
        for (int i = 0; i < a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

