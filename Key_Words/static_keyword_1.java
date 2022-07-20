package Key_Words;

class Employee_2     // By_Using_Constructor

{
    static void show()    // It's not for method but for class because we have used static keyword before this method. we can call this by
    {                     // using the class name i.e Employee_2  // static key word is used for memory management
        System.out.println("Hiii");
    }
    String name;
    int id;
    static String company = "XYZ";
    Employee_2(String name, int id)  //Constructor
    {
        this.name=name;
        this.id=id;
    }

    void diplay()
    {
        System.out.println(name+" "+id +" " + company);
    }

    public static void main(String[] args) {
        Employee_2 e1 = new Employee_2("Suddu" , 7);
        e1.diplay();
        e1.show();
        show();
        Employee_2.show(); // Important - we dun have to create object to call the static method, we can call it by it's class name

        Employee_2 e2 = new Employee_2("Bapun" , 16);
        e2.diplay();
    }
}
