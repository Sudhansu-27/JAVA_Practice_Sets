package Key_Words;

public class final_keyword {   //if we add final keyword beforev this class then inheritance won't support;
   final void m1()
    {
        System.out.println("I Am In Demo Class");
    }
}

class abc extends final_keyword {

//    void m1() {
//        System.out.println("I Am Here");     this will show error
//    }

    public static void main(String[] args) {
        final int i = 10;
        abc g = new abc();
        g.m1();
        // i = i + 1; will show an error
    }
}
