package Java_Basics;

public class Array_Jagged {
        public static void main(String[] args) {

//        int [][]a;
//        a = new int[3][];
//        a[0] = new int[4];
//        a[1] = new int[3];


            int[][] a ={{10,20,30,40} , {50,60} , {70,80,90}};

            for (int i=0;i<a.length;i++)
            {
                System.out.println("Jagged Array Of " +(i+1)+ " Is ");
                for (int j=0;j<a[i].length;j++)
                {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

        }

    }
