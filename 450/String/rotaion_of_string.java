import java.util.*;
class rotate 
{   // by creating function
    public static boolean  checkrotate(String s1 , String s2)
    {
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            if(s1.equals(s2))
            {
                return true;
            }
            char last=s1.charAt(s1.length()-1);
            s1=last+s1.substring(0, s1.length()-1);
        }
        return false;
    }
    public static boolean inbuilt(String s1 , String s2)
    {
        s1=s1+s1;
        if(s1.contains(s2))
        {
            return true;
        }
        return false;
    }
}

public class rotaion_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(rotate.checkrotate(s1, s2));
        sc.close();
    }
    
}
