package OOPS;

class Employee_2     // By_Using_Constructor

{
   String name;
   int id;

   Employee_2(String name, int id)  //Constructor
   {
      this.name=name;
      this.id=id;
   }

    public static void main(String[] args) {
        Employee_2 e1 = new Employee_2("Suddu" , 7);
        Employee_2 e2 = new Employee_2("Bapun" , 16);

        System.out.println("Employee e1 :" +e1.name+" "+e1.id);
        System.out.println("Employee e2 :" +e2.name+" "+e2.id);


    }
}
