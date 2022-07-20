package Java_Basics;

public class fizz_buzz {
    public static void main(String[] args) {
        for (int i=1;i<100;i++)
        {
            if ((i % 3 == 0)  && (i % 5 == 0))
            {
                System.out.print("Fizz Buzz\t");
            }
            else if (i % 3 == 0)
            {
                System.out.print("Fizz\t");
            }
            else if (i % 5 == 0)
            {
                System.out.print("Buzz\t");
            }
            else
            {
                System.out.print(i+"\t");
            }
        }
    }
}
