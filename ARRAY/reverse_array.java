import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int number[]=new int[a];
        for(int i=0;i<a;i++)
        {
            number[i]=sc.nextInt();
        }
        
        for(int i=number.length-1;i>=0;i--)
        {
            System.out.print(number[i]+" ");
        }
        
    }
}
