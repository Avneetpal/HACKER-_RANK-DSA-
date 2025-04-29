import java.util.*;
class result 
{
    public static ArrayList<Integer> array(ArrayList<String> sl , ArrayList<String> que )
    {
        ArrayList<Integer> res=new  ArrayList<>();
        for(int i=0;i<que.size();i++)
        {
            int a=0;
            for(int j=0;j<sl.size();j++)
            { 
                if(sl.get(j).equals(que.get(i)))
                {
                   
                    a++;
                }
            }
            res.add(a);
        }
        return res;
    }
}
 public class Sparse_Arrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new  ArrayList<>();
        ArrayList<String> qu=new ArrayList<>();
        ArrayList<Integer> out=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          arr.add(sc.next());  
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            qu.add(sc.next());
        }
      out=result.array(arr, qu);
      for(int i=0;i<out.size();i++)
      {
        System.out.println(out.get(i));
      }
    }
}