import java.util.*;
class reve
{
    public static String revv(String s)
    {
        StringBuilder ss=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            ss.append(c);
        }
        return ss.toString();
    }
}
public class reverse_string {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       System.out.println( reve.revv(s));
       sc.close();
     }
}