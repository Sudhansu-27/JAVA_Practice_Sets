package Java_Basics;

public class Array_float {
    public static void main(String[] args) {
        float sum = 0;
        float [] marks ={3.4f , 4.8f , 6.9f , 9.7f , 8.3f};
        for(int i = 0;i<5;i++)
        {
            sum = sum + marks[i];
//            System.out.println("Summation of" +marks[i]+ "with" +marks[i+1] +"=" +sum);
        }
        System.out.println("Total SUM Of Marks = "+sum);
    }
}
