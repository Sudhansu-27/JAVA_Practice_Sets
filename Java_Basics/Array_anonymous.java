package Java_Basics;

public class Array_anonymous {
    static void sum(int[][] nu)
    {
        int total=0;
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++) {
                total = total + nu [i][j];
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        sum(new int[][]{{10,20,30}, {40,50,60,70}}); //Creation Of Anonymous Array
    }
}

