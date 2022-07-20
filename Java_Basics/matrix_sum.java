package Java_Basics;

public class matrix_sum {
    public static void main(String[] args) {
        int[][] mat_1 = {{8, 5, 7},
                        {6, 2, 4}};

        int[][] mat_2 = {{3, 2, 1},
                        {0, 9, 7}};

        int[][] result = {{0, 0, 0},
                         {0, 0, 0}};

        for (int i = 0; i < mat_1.length; i++) //For ROW
        {
            for (int j = 0; j < mat_1[i].length; j++) //For COLUMN
            {
                System.out.println("Setting value for i=" + i + "and j=" + j);
                result[i][j] = mat_1[i][j] + mat_2[i][j];
            }

        }

        for (int i = 0; i < mat_1.length; i++) //For ROW
        {
            for (int j = 0; j < mat_1[i].length; j++) //For COLUMN
            {
                System.out.print(result[i][j] + " ");
//
            }
            System.out.println();

        }
    }
}