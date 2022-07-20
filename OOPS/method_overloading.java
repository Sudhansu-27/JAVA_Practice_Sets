package OOPS;

public class method_overloading {    //IN A CLASS

        void show(Object a) //"Object" is the parent class of all the classes in java.
        {
            System.out.println("1");
        }

        void show(int a)
        {
            System.out.println("2");
        }

    public static void main(String[] args)
        {
            method_overloading a = new method_overloading();
            a.show("c");
        }
    }
