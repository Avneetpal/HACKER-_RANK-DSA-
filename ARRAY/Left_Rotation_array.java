import java.util.*;
class result 
{
    public static void rev( ArrayList<Integer> arr, int d)
    {
        for(int i=0;i<d;i++)
        {
            int c;
            c=arr.remove(0);
            arr.add(c);  
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        result.rev(arr, d);
        sc.close();
    }
}