package Key_Words;

public class super_keyword {
    int a = 20;

    void S()
    {
        System.out.println("Successfully Run");
    }
}

class A extends super_keyword
{
    int a = 30;

    void S()
    {
        System.out.println("Good Job !!");
    }

    void show(int a)
    {
        System.out.println(a);

        System.out.println(this.a);    // reference variable from current class

        System.out.println(super.a);   // reference variable from parent class

        this.S();                      // also used to call the method in current class

        super.S();                     // also used to call the method in parent class
    }

    public static void main(String[] args) {
        A b = new A();
        b.show(10);
    }
}
