import java.util.*;
class check 
{
    public static boolean checkfun(String s)
    {
        StringBuilder ss =new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            ss.append(c);
        }
        String news=ss.toString();
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i)!=news.charAt(i))
           {
                return false;
           }

        }
        return true;
    }
}
public class string_palindrone {

    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     System.out.println(check.checkfun(s));
     sc.close();

    }
}
