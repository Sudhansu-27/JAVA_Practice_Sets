package OOPS;

interface abstraction_by_interface {  //Interface supports multiple inheritance
    public abstract void show();

    int a = 10;
}

interface I1{
    void look();
}
class test implements abstraction_by_interface ,I1{
    public void show()
    {
        System.out.println("Hi Sudhansu");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.look();
    }

    public void look()
    {
        System.out.println("Hello Bapun");
    }
}