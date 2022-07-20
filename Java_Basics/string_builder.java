package Java_Basics;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Sudhansu");
        System.out.println(s.append(" Sekhar"));           // It is non synchronized.
    }
}
