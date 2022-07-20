package Java_Basics;

public class string_dup {
    public static void main(String[] args) {
        String str ="SUDDU";
        int a;
        int count=0;
        char string[]=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
              if (string[i]==string[j])
              {
                  count++;
                  System.out.println("Repeating Element Is : " +string[i]);
              }
            }
        }
        System.out.println("count = "+count);
        if(count>0)
        {
            System.out.println("Duplicate/Repeating Characters Are Present In The String");
        }

        else
        {
            System.out.println("Duplicate/Repeating Characters Are Not Present In The String");
        }
    }
}
