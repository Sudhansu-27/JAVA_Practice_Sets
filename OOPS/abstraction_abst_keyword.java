package OOPS;

abstract class abstraction {
    int no_of_wheels;
    abstract void show();
}

class car extends abstraction
{
    void show()
    {
        System.out.println("Car Has 4 Wheels");
    }

    public static void main(String[] args) {
        car c = new car();
        c.show();
    }
}
