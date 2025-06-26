import java.util.*;
class occur 
{
    public static void check(int arr[] , int x)
    {
        Integer first=null;
        Integer last =null;
        for(int i=0;i<arr.length;i++)
        {
                if(first ==null && last ==null)
                {
                    if(arr[i]==x)
                    {
                        first=i;
                        last=i;
                    }
                }
                if(arr[i]==x)
                {
                    last=i;
                }
        }
        System.out.println("First "+ first);
        System.err.println("last" + last);
        
    }
}
public class find_first_and_last_occurence_of_a_no_in_sorted_array {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        occur.check(arr, x);
        sc.close();



    }
}