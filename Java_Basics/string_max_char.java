package Java_Basics;

public class string_max_char {
    public static void main(String[] args) {
     String s = "sudhansuu" ;

     int temp = 1;
     char String[] = s.toCharArray();
     for (int i=0;i<s.length();i++)
     {
         int count = 0;
       for (int j=i+1;j<s.length();j++)
       {
           if (String[i] == String[j])
           {
               count++;
           }
       }
       if (temp<count)
       {
           temp = count;
           System.out.println("Max Character Is : " +String[i]);
           System.out.println("Occurance Of Max Character : " + (count + 1));
       }
     }

    }
}
