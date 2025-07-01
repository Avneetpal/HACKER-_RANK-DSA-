import java.io.*;
import java.util.*;
class heap
{
    public static void hh(List<String> operations)
    {
       PriorityQueue<Integer> p=new PriorityQueue<>();
       for (String op : operations)
       {
        if(op.startsWith("1"))
        {
            int x=Integer.parseInt(op.split(" ")[1]);
            p.add(x);
        }
        if(op.startsWith("2"))
        {
            int x=Integer.parseInt(op.split(" ")[1]);
            p.remove(x);
        }
        if(op.startsWith("3"))
        {
            System.out.println(p.peek());
        }
        
       }
         
    }
}
public class Qheap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> s=new  ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String ss=sc.nextLine();
            s.add(ss);
            
        }
        heap.hh(s);
       sc.close();
    }
}