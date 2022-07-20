package Java_Basics;

public class Array_3d {
    public static void main(String[] args) {
//            int [][][] a=new int[2][3][4];
        int [][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};
//            System.out.println(a[0][0][0])
//            ;
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                for (int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
}
    }
    }
