import java.util.*;
class result
{
    public static int hour(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                int top=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int mid=arr[i+1][j+1];
                int bottom=arr[i+2][j]+arr[i+2][j+1]+ arr[i+2][j+2]; 
                int sum=top+bottom+mid;
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        return max;
    }
}
public class Maximum_hourglass_sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(result.hour(arr));
        sc.close();
          
    }
}