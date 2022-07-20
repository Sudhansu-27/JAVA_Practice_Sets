package OOPS;

class Animal
{
    void eat()
    {
        System.out.println("I Am Eating.");
    }

    void sleep()
    {
        System.out.println("I Am Sleeping.");
    }
}

class dog extends Animal
{
    void repeat()
    {
        System.out.println("I Am Repeating.");
    }
}

class cat extends dog
{
    void exit()
    {
        System.out.println("I Am Existing.");
    }
    public static void main (String[] args)
    {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println("-------------------------------------");

        dog d = new dog();
        d.eat();
        d.sleep();
        d.repeat();

        System.out.println("-------------------------------------");

        cat c = new cat();
        c.eat();
        c.sleep();
        c.repeat();
        c.exit();

        System.out.println("--------------------------------------");
    }
}