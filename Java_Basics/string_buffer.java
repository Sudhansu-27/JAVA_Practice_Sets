package Java_Basics;

public class string_buffer {
    public static void main(String[] args) {

        String s = "Sudhansu";                             // string creates immutable objects , it can't be concatinated.
        s.concat("Sekhar");
        System.out.println(s);

        StringBuffer s1 = new StringBuffer("Sudhansu");    // string buffer creates mutable objects , uses append keyword to merge strings
        s1.append(" Sekhar");
        System.out.println(s1);

        System.out.println(s1.delete(2,5));               // Sunsu Sekhar
        System.out.println(s1.deleteCharAt(5));           // will delete particular character
        System.out.println(s1.insert(3,"zzz"));
        System.out.println(s1.replace(3,6,"x"));
        s1.setLength(4);
        System.out.println(s1);
        System.out.println(s1.reverse());

        System.out.println(s1.capacity());                // default capacity of string buffer is 16 + 8(Sudhansu) = 24 ,if character increases then
                                                          // default capacity also increases - 16 * 2 + 2 = 34 and so on i.e (old capacity * 2) + 2.
        s1.ensureCapacity(100);             // will change the default capacity.
        System.out.println(s1.capacity());

        s1.trimToSize();                                  // it is used to trim the size
        System.out.println(s1.capacity());

    }
}
