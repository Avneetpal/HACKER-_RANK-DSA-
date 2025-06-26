import java.util.*;
class dublicate 
{
    public static HashMap<Character,Integer> check(String s)
    {
        HashMap<Character, Integer> mapp =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(mapp.containsKey(c))
            {
                mapp.put(c, mapp.get(c)+1);
            }
            else 
            {
                mapp.put(c, 1);
            }
        }
        HashMap<Character, Integer> duplicates = new HashMap<>();
        for(Map.Entry<Character,Integer> entry : mapp.entrySet())
        {
            if(entry.getValue()>1)
            {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        
        return duplicates;
    }
}
public class Dublicate_character_in_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(dublicate.check(s));
        sc.close();
    }
    
}
