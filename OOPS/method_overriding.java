package OOPS;

public class method_overriding {     // IN DIFFERENT CLASS
    void show()
    {
        System.out.println("1");
    }
}

class overriding extends method_overriding
{
    void show()
    {
        System.out.println("2");
    }

    public static void main(String[] args)
    {

        overriding a = new overriding();
        a.show();


        method_overriding b = new method_overriding();
        b.show();
    }
}
