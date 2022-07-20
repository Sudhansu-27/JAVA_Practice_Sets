package Key_Words;

public class PRACTICEEEE {
    static {
        System.out.println("Hello");  // it will execute if the JDK version is < 1.6 , otherwise it'll throw an error.
    }

    public static void main(String[] args) {
        System.out.println("I'm Suddu");
    }
    static {
        System.out.println("You are smart.");  // static blocks will be executed first.
    }
}
