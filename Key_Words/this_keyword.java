package Key_Words;

public class this_keyword {
    int i;
    void setValues(int i)
    {
        this.i = i; // here we use "THIS" keyword to identify instansce variable
    }

    void getValues()
    {
        System.out.println(i);
    }
}

class values
{
    public static void main(String[] args) {
        this_keyword t = new this_keyword();
        t.setValues(10);
        t.getValues();
    }
}
